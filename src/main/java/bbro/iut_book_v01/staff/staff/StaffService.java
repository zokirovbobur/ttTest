package bbro.iut_book_v01.staff.staff;

import bbro.iut_book_v01.staff.staff.staffType.StaffType;
import bbro.iut_book_v01.staff.staff.staffType.StaffTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    private StaffRepo staffRepo;

    @Autowired
    private StaffTypeRepo staffTypeRepo;

    public ResponseEntity<Staff> login(Staff staff){
        //checks whether userId is not null
        if(staff.getUserId()==null ){
            System.out.println("22");
            Staff staff_error = new Staff();
            staff_error.setUserId("there should be user id like uXXXYYY");
            return ResponseEntity.badRequest().body(staff_error);
        }else{
            System.out.println("27");
            //tries to find staff account from db
            if (staffRepo.existsByUserId(staff.getUserId())){
                System.out.println("31");
                //if finds user want to login and rest should return user data
                return ResponseEntity.ok(staffRepo.findByUserId(staff.getUserId()));
            }else {
                if(staff.getStaffType()==null){System.out.println("38");
                    //in this case staff saves without staff type (no problem)
                    staffRepo.save(staff);
                    return ResponseEntity.ok(
                            staffRepo.findByUserId(staff.getUserId())
                    );
                }else {
                    System.out.println("45");
                    //if staff type not null so there is such record,
                    //and if staff type id is incorrect
                    //request may cause some problem
                    //that's why staff type id should be validated
                    if(staffTypeRepo.existsByStaffTypeId(
                            staff.getStaffType().getStaffTypeId()
                    )){
                        //in this case there is no problem with staffTypeId
                        //and saves with staff Type Id
                        staffRepo.save(staff);
                        System.out.println("56");
                        return ResponseEntity.ok(
                                staffRepo.findByUserId(staff.getUserId())
                        );
                    }else {
                        System.out.println("61");
                        // in that case there is incorrect id of staff type object
                        StaffType staffTypeError = new StaffType();
                        staffTypeError.setStaffTypeValue(
                                "there is no such staff type with given id"
                        );
                        staff.setStaffType(staffTypeError);
                        return ResponseEntity.badRequest().body(staff);

                    }
                }
            }
        }
    }
    //uuid sh'd be cleaned from list
    public List<Staff> findAll(){
        return staffRepo.findAll();
    }
    public List<Staff> findAllByType(StaffType staffType){
        return staffRepo.findAllByStaffTypeStaffTypeId(staffType.getStaffTypeId());
    }
    public ResponseEntity<Staff> findByFullName(Staff staff){
        if (staffRepo.existsByFirstNameOrLastName(staff.getFirstName(),
                staff.getLastName())){
            return ResponseEntity.ok(staffRepo.findByFirstNameOrLastName(
                    staff.getFirstName(), staff.getLastName()
            ));
        }else {
            staff.setFirstName("there is no such firs name");
            staff.setLastName("there is no such last name");
            return ResponseEntity.badRequest().body(staff);
        }
    }


}

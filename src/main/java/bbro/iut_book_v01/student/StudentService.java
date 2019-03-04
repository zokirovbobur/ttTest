package bbro.iut_book_v01.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;


    public ResponseEntity<Student> save(Student student){
        return login(student);
    }
    public ResponseEntity<Student> login(Student student){


        student.calculateFS();
        student.setUserId(student.getUserId().toLowerCase());
        Student studentFromBase;
        try {
            studentFromBase = studentRepo.findByUserId(student.getUserId());
            if (studentFromBase.getUserId().charAt(0)=='u'){
                System.out.println("inside login method try if");
            }
        }catch (NullPointerException e){
            System.out.println("catch nullPointer student");
            studentRepo.save(student);
        }


        return ResponseEntity.ok(studentRepo.findByUserId(student.getUserId()));
    }

    //smart update for updating only group of object
    public ResponseEntity<String> update(Student student){
        if(student.getUuid()==null||student.getGroup()==null){
            return ResponseEntity.badRequest().body("required fields student's uuid and group");
        }else {
            Student studentFromBase = studentRepo.findByUuid(student.getUuid());
            try {
                System.out.println(studentFromBase.getUserId()==null);
            }catch (NullPointerException e){
                return ResponseEntity.badRequest().body("uuid is incorrect");
            }
            System.out.println("after try catch and return");
            studentFromBase.setGroup(student.getGroup());
            studentRepo.save(studentFromBase);
            return ResponseEntity.ok("updated");
        }
    }
    public List<Student> findAll(){
        List<Student> all = studentRepo.findAll();
        all.forEach(student -> {
            student.nullUuid();
            //student.setPassword("");
        });
        return all;
    }
    public ResponseEntity<String> delete(Student student){
//        Student studentFromBase = studentRepo.findByUserId(student.getUserId());
//        if(student.matchesPassword(studentFromBase)){
//            studentRepo.delete(student);
//            return ResponseEntity.ok("User has been deleted successfully...");
//        }
//        else {
//            return ResponseEntity.badRequest().body("password is incorrect");
//
//        }
        return ResponseEntity.badRequest().body("this function is not available now");
    }

    public ResponseEntity<Student> findByUserId(StudentSample student){
        System.out.println(student.getUserId());

        return ResponseEntity.ok(studentRepo.findByUserId(student.getUserId()).nullUuid()) ;
    }

    public ResponseEntity<Student> findByName(Student student){
        return ResponseEntity.ok(studentRepo.findByFirstNameOrLastName(
                student.getFirstName(),student.getLastName()
        ).nullUuid());
    }
}

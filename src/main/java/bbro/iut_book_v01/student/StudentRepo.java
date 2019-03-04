package bbro.iut_book_v01.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByUserId(String userId);
    Student findByUuid(UUID uuid);
    Student findByFirstNameOrLastName(String firstName, String lastName);


}

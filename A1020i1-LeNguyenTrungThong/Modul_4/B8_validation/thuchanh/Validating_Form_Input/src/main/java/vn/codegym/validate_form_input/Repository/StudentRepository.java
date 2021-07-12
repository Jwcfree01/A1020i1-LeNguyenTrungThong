package vn.codegym.validate_form_input.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.validate_form_input.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

//    @Query("select s from s where s.name=:input")
//
}

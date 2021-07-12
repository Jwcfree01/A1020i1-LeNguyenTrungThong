package vn.codegym.validate_form_input.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.validate_form_input.Model.Student;

@Service
public interface StudentService {
    Page<Student> findAll(Pageable pageable);

    void createStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(int id);

    void searchByName(String kq);

    Student findById(int id);
}

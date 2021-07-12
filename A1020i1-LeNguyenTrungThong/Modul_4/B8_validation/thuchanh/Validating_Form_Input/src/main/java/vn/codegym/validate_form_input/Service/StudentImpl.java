package vn.codegym.validate_form_input.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.validate_form_input.Model.Student;
import vn.codegym.validate_form_input.Repository.StudentRepository;

@Service
public class StudentImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return this.studentRepository.findAll(pageable);
    }

    @Override
    public void createStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public void updateStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        this.studentRepository.deleteById(id);
    }

    @Override
    public void searchByName(String kq) {
//        this.studentRepository.fi
    }

    @Override
    public Student findById(int id) {
        return this.studentRepository.findById(id).orElse(null);
    }
}

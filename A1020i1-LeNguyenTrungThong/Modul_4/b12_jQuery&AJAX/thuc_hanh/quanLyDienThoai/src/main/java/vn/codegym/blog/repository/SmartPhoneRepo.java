package vn.codegym.blog.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.blog.model.SmartPhone;

@Repository
public interface SmartPhoneRepo extends JpaRepository<SmartPhone, Integer> {

}

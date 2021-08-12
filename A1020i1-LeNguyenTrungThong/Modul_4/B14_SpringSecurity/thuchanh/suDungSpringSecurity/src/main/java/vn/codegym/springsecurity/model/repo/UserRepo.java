package vn.codegym.springsecurity.model.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.springsecurity.model.Entity.User;


import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
//    @Query(value = "select username from User where username = :name", nativeQuery = true)
//    List<User> findByUserName(String name);

    User findByUsername(String username);
}

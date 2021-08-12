package vn.codegym.casestudy.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.casestudy.model.bean.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}

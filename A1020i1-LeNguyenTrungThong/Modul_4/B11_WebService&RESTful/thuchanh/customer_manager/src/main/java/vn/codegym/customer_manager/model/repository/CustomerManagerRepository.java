package vn.codegym.customer_manager.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.customer_manager.model.bean.Customer;

@Repository
public interface CustomerManagerRepository extends JpaRepository<Customer,Integer> {

}

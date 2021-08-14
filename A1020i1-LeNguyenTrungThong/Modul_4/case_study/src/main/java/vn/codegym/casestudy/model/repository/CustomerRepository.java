package vn.codegym.casestudy.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.casestudy.model.bean.Customer;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
//    List<Customer> findByNameDesc();

    @Query("SELECT c FROM Customer c WHERE " +
            "c.customerId LIKE %:key% OR " +
            "c.name LIKE %:key% OR " +
            "c.customerType.customerTypeName LIKE %:key% OR " +
            "c.address LIKE %:key%")
    Page<Customer> findAllByKey(String key, Pageable pageable);
}

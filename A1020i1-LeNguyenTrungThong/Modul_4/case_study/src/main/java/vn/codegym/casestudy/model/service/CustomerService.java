package vn.codegym.casestudy.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.casestudy.model.bean.Customer;

@Service
public interface CustomerService {
    void createCustomer(Customer customer);
    void deleteCustomer(String id);
    Customer findById(String id);
    void updateCustomer(Customer customer);
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> searchByName(String key, Pageable pageable);
}

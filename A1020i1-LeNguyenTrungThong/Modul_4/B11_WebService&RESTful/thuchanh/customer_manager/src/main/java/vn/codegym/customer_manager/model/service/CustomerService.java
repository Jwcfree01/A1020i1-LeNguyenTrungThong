package vn.codegym.customer_manager.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.customer_manager.model.bean.Customer;

import java.util.List;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Customer findById(int id);

    void createCustomer(Customer customer);

    void deleteCustomer (int id);
}

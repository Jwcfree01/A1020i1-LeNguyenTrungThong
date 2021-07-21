package vn.codegym.customer_manager.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.customer_manager.model.bean.Customer;
import vn.codegym.customer_manager.model.repository.CustomerManagerRepository;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerManagerRepository cus1;

    @Override
    public List<Customer> findAll() {
        return cus1.findAll();
    }

    @Override
    public Customer findById(int id) {
        return cus1.findById(id).orElse(null);
    }

    @Override
    public void createCustomer(Customer customer) {
        cus1.save(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        cus1.deleteById(id);
    }
}

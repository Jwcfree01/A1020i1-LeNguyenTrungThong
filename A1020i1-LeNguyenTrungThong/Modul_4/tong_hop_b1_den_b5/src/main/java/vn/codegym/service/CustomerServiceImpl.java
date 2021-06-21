package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import vn.codegym.model.Customer;
import vn.codegym.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customerRepository.saveCustomer(customer);
    }

    @Override
    public void editCustomer(int id) {

    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void findById(int id) {

    }
}

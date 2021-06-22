package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        customers = this.customerRepository.findAll();
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customerRepository.saveCustomer(customer);
    }

    @Override
    public Customer editCustomer(Customer customer) {
        return this.customerRepository.editCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        this.customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer findById(int id) {
       return this.customerRepository.findById(id);
    }
}

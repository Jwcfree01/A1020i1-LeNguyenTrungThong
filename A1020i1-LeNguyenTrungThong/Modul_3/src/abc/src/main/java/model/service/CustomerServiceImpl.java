package model.service;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public boolean createCustomer(Customer customer) {
        return this.customerRepository.createCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        this.customerRepository.deleteCustomer(id);
    }

    @Override
    public void editCustomer(int id) {

    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> showCustomer() {
        return this.customerRepository.showCustomer();
    }
}

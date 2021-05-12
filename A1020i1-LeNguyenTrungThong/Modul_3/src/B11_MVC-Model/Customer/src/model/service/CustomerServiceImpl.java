package model.service;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public boolean save(Customer customer) {
//        if (customer.getName().matches("[A-Za-z ]+")){
//            return this.customerRepository.save(customer);
//        }
//        return false;
        customerRepository.save(customer);
        return true;
    }

    @Override
    public void remove(int id) {
        customerRepository.remove(id);
    }
}

package vn.codegym.service;

import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void saveCustomer(Customer customer);

    void editCustomer(int id);

    void deleteCustomer(int id);

    void findById(int id);
}

package vn.codegym.repository;

import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    void saveCustomer(Customer customer);

    Customer editCustomer(Customer customer);

    void deleteCustomer(int id);

    Customer findById(int id);
}
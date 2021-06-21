package vn.codegym.repository;

import vn.codegym.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    void saveCustomer(Customer customer);

    void editCustomer(int id);

    void deleteCustomer(int id);

    void findById(int id);
}

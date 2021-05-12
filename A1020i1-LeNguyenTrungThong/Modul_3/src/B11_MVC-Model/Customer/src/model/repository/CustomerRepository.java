package model.repository;

import model.bean.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();

    boolean save (Customer customer);

    void remove(int id);
}

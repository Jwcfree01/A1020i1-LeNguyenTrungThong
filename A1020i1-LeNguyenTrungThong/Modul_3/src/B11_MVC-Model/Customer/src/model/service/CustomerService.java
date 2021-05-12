package model.service;

import model.bean.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAll();

    boolean save (Customer customer);

    void remove(int id);
}

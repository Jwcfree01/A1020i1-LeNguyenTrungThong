package com.codegym.service;

import com.codegym.model.bean.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codegym.model.repository.customerRepository;
import com.codegym.model.repository.customerRepositoryImpl;

public class customerServiceImpl implements customerService {

    private customerRepository CustomerRepository = new customerRepositoryImpl();

private static Map<Integer, customer> Customers;

    static {
        Customers = new HashMap<>();
        Customers.put(1, new customer(1, "John", "john@codegym.vn", "Hanoi"));
        Customers.put(2, new customer(2, "Bill", "bill@codegym.vn", "Danang"));
        Customers.put(3, new customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        Customers.put(4, new customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        Customers.put(5, new customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        Customers.put(6, new customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }



    @Override
    public List<customer> findAll() {
        return new ArrayList<>(Customers.values());
    }

    @Override
    public boolean save(customer Customer) {
        if (Customer.getName().matches("[A-Za-z ]+")) {
            return this.CustomerRepository.save(Customer);
        }
        return false;
    }

    @Override
    public customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, customer Customer) {

    }

    @Override
    public void remove(int id) {

    }
}

package com.codegym.model.repository;

import com.codegym.model.bean.customer;

import java.util.List;

public interface customerRepository {
    List<customer> findAll();
    boolean save(customer customer);
}

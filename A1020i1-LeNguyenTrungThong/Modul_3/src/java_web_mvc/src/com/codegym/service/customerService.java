package com.codegym.service;

import com.codegym.model.bean.customer;

import java.util.List;

public interface customerService {
    List<customer> findAll();

    boolean save(customer Customer);

    customer findById(int id);

    void update(int id, customer Customer);

    void remove(int id);
}

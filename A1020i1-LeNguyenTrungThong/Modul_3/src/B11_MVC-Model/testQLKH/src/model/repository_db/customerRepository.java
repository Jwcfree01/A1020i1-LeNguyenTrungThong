package model.repository_db;

import model.bean.customer;

import java.util.List;

public interface customerRepository {
    List<customer> findAll();

    boolean saveCustomer(customer Customer);

    customer removeCus(int idCus);
}

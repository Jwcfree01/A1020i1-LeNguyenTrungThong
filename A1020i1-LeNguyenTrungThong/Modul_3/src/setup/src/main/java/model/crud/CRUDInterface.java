package model.crud;

import model.bean.CusType;
import model.bean.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CRUDInterface {
    List<Customer> findAll();

    Customer findById(int id);

    void deleteCustomer(int id);

    void updateCustomer(int id, Customer customer);

    void createCustomer(Customer customer) throws SQLException;

    List<Customer> searchCustomer(String name);

    CusType findCusType (int id);
}

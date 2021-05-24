package model;

import model.bean.Customer;

import java.util.List;

public interface CRUDInterface {
    boolean createCustomer(Customer customer);
    void deleteCustomer (int id);
    void editCustomer(int id);
    Customer findById(int id);
    List<Customer>showCustomer();
}

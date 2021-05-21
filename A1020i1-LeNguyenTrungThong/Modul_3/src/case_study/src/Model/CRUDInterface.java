package Model;

import Model.Bean.Customer;

import java.util.List;

public interface CRUDInterface {
    boolean createCustomer(Customer customer);
    void deleteCustomer (int id);
    void editCustomer(int id);
    Customer findById(int id);
    List<Customer>showCustomer();
}

package repo;

import model.Customer;

import java.util.List;

public interface CustomerRepo {
    List<Customer> findAll();

    Customer finById(int id);

    void save(Customer customer);

    void delete(int id);

    void edit(Customer customer);
}

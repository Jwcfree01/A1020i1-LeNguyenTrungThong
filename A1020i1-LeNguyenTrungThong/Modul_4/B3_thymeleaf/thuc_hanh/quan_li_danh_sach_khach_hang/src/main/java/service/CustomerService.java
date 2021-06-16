package service;

import model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> findAll();

    Customer finById(int id);

    void save(Customer customer);

    void delete(int id);

    void edit(Customer customer);
}

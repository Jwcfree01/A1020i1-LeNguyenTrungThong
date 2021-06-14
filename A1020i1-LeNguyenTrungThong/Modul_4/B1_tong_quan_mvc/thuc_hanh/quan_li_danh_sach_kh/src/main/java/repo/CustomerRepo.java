package repo;

import bean.Customer;

import java.util.List;

public interface CustomerRepo {
    List<Customer> findAll();
}

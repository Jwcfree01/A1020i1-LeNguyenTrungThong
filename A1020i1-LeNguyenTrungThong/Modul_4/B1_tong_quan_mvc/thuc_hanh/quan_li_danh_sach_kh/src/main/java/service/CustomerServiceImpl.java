package service;

import bean.Customer;
import repo.CustomerRepo;
import repo.CustomerRepoImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepo repo = new CustomerRepoImpl();

    @Override
    public List<Customer> findAll() {
        return repo.findAll();
    }
}

package service;

import model.Customer;
import repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
    CustomerRepo customerRepo;

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }

    @Override
    public Customer finById(int id) {
        return this.customerRepo.finById(id);
    }

    @Override
    public void save(Customer customer) {
        this.customerRepo.save(customer);
    }

    @Override
    public void delete(int id) {
        this.customerRepo.delete(id);
    }

    @Override
    public void edit(Customer customer) {
        this.customerRepo.edit(customer);
    }
}

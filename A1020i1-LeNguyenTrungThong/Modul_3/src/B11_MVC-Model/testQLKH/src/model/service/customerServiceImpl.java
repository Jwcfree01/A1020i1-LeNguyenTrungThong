package model.service;

import model.bean.customer;
import model.repository_db.customerRepository;
import model.repository_db.customerRepositoryImpl;

import java.util.List;

public class customerServiceImpl implements customerRepository{
    customerRepository customerRepository = new customerRepositoryImpl();


    @Override
    public List<customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public boolean saveCustomer(customer Customer) {
        if (Customer.getName().matches("[A-Za-z ]+")){
            return this.customerRepository.saveCustomer(Customer);
        }
        return false;
    }

    @Override
    public customer removeCus(int idCus) {
        return this.customerRepository.removeCus(idCus);
    }
}

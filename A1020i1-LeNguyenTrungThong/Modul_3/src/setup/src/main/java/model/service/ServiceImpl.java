package model.service;

import common.Validate;
import model.bean.CusType;
import model.bean.Customer;
import model.repo.Repo;
import model.repo.RepoImpl;

import java.sql.SQLException;
import java.util.List;

public class ServiceImpl implements Service {
    Repo repo = new RepoImpl();
    @Override
    public List<Customer> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Customer findById(int id) {
        return this.repo.findById(id);
    }

    @Override
    public void deleteCustomer(int id) {
        this.repo.deleteCustomer(id);
    }

    @Override
    public void updateCustomer(int id, Customer customer) {

    }

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        this.repo.createCustomer(customer);
    }

    @Override
    public List<Customer> searchCustomer(String name) {
        return this.repo.searchCustomer(name);
    }

    @Override
    public CusType findCusType(int id) {
        return this.repo.findCusType(id);
    }
}

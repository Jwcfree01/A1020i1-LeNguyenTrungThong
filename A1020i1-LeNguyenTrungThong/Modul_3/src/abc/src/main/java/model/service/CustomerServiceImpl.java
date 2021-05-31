package model.service;

import model.bean.customer.Customer;
import model.bean.employee.*;
import model.bean.service.Service;
import model.repository.CustomerRepository;
import model.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public boolean createCustomer(Customer customer) {
        return this.customerRepository.createCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {
        this.customerRepository.deleteCustomer(id);
    }

    @Override
    public void editCustomer(Customer customer) {
        this.customerRepository.editCustomer(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> showCustomer() {
        return this.customerRepository.showCustomer();
    }

    @Override
    public boolean createService(Service service) {
        return this.customerRepository.createService(service);
    }

    @Override
    public List<Service> showService() {
        return this.customerRepository.showService();
    }

    @Override
    public boolean createEmployee(Employee employee) {
        return this.customerRepository.createEmployee(employee);
    }

    @Override
    public List<Employee> showListEmployee() {
        return this.customerRepository.showListEmployee();
    }

    @Override
    public void deleteEmployee(int id) {
        this.customerRepository.deleteEmployee(id);
    }

    @Override
    public Position findPosition(int id) {
        return this.customerRepository.findPosition(id);
    }

    @Override
    public void editEmployee(Employee employee) {
        this.customerRepository.editEmployee(employee);
    }

    @Override
    public Education_degree findEducation(int id) {
        return this.customerRepository.findEducation(id);
    }

    @Override
    public Division findDivision(int id) {
        return this.customerRepository.findDivision(id);
    }

    @Override
    public Employee findByIdEmployee(int id) {
        return this.customerRepository.findByIdEmployee(id);
    }
}

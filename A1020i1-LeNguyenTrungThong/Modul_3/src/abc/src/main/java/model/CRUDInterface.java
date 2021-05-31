package model;

import model.bean.customer.Customer;
import model.bean.employee.*;
import model.bean.service.Service;

import java.util.List;

public interface CRUDInterface {
    boolean createCustomer(Customer customer);
    void deleteCustomer (int id);
    void editCustomer(Customer customer);
    Customer findById(int id);
    List<Customer>showCustomer();

    boolean createService(Service service);
    List<Service>showService();

    boolean createEmployee(Employee employee);
    List<Employee>showListEmployee();
    void deleteEmployee(int id);
    Position findPosition(int id);
    void editEmployee(Employee employee);
    Education_degree findEducation(int id);
    Division findDivision(int id);
    Employee findByIdEmployee(int id);
}

package model.repository;

import model.bean.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static Map<Integer, Customer> Customers = new TreeMap<>();

    static {
        Customers.put(11, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        Customers.put(22, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        Customers.put(33, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        Customers.put(44, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        Customers.put(55, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        Customers.put(66, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(Customers.values());
    }

    @Override
    public boolean save(Customer customer) {
        int id = (int) (Math.random() * 100);
        customer.setId(id);
        Customers.put(id, customer);
        return true;
    }

    @Override
    public void remove(int id) {
        Customers.remove(id);
    }
}

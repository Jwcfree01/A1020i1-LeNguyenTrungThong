package model.repository_db;

import model.bean.customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class customerRepositoryImpl implements customerRepository {

    private static Map<Integer, customer> Customers = new TreeMap<>();

    static {
        Customers.put(11, new customer(1, "John", "john@codegym.vn", "Hanoi"));
        Customers.put(22, new customer(2, "Bill", "bill@codegym.vn", "Danang"));
        Customers.put(33, new customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        Customers.put(44, new customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        Customers.put(55, new customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        Customers.put(66, new customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }

    public List<customer> findAll(){
        return new ArrayList<>(Customers.values());
    }

    @Override
    public boolean saveCustomer(customer Customer) {
        int id = (int) (Math.random() * 100);
        Customer.setId(id);
        Customers.put(id, Customer);
        return true;
    }

    @Override
    public customer removeCus(int idCus) {
        return Customers.remove(idCus);
    }
}

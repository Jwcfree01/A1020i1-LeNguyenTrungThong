package repo;

import bean.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Repository
public class CustomerRepoImpl implements CustomerRepo {
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
}

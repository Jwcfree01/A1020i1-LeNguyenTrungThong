package repo;

import model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepoImpl implements CustomerRepo {
    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Nguyen Van A", "A@gmail.com","quang nam"));
        customerList.add(new Customer(2, "Nguyen Van B", "B@gmail.com", "da nang"));
        customerList.add(new Customer(3, "Nguyen Van C", "C@gmail.com", "Hue"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public Customer finById(int id) {
        return customerList.get(id);
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void delete(int id) {
        customerList.remove(id);
    }

    @Override
    public void edit(Customer customer) {
        customerList.add(customer);
    }
}

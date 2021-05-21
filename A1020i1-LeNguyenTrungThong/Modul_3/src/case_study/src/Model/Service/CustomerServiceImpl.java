package Model.Service;

import Model.Bean.Customer;
import Model.Repository.CustomerRepository;
import Model.Repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public boolean createCustomer(Customer customer) {
        return this.customerRepository.createCustomer(customer);
    }

    @Override
    public void deleteCustomer(int id) {

    }

    @Override
    public void editCustomer(int id) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public List<Customer> showCustomer() {
        return this.customerRepository.showCustomer();
    }
}

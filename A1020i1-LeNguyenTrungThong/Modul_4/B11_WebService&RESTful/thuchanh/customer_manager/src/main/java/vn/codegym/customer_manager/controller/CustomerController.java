package vn.codegym.customer_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.codegym.customer_manager.model.bean.Customer;
import vn.codegym.customer_manager.model.service.CustomerService;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ResponseEntity<List<Customer>> getCustomerAll(){
            List<Customer> customerList = customerService.findAll();
            if (customerList.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
            return new ResponseEntity<>(customerList, HttpStatus.OK);
    }

    @GetMapping("customer/{id}")
    public ResponseEntity<Customer>findById(@PathVariable int id){
        Customer customer = customerService.findById(id);
        if (customer == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("customer/create")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("delete/{id}")
    public ResponseEntity<Customer>deleteCustomer(@PathVariable int id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}






















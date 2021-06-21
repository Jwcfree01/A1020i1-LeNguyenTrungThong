package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Customer;
import vn.codegym.service.CustomerService;
import vn.codegym.service.CustomerServiceImpl;

@Controller
public class CustomerController {

//    @Autowired
    CustomerService customerService = new CustomerServiceImpl();

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("customer", new Customer());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String createCustomer(@ModelAttribute Customer customer){
        this.customerService.saveCustomer(customer);
        return "redirect:/list";
    }

    @GetMapping(value = "/list")
    public ModelAndView listCustomer(){
        return new ModelAndView("list", "listCustomer", this.customerService.findAll());
    }
}

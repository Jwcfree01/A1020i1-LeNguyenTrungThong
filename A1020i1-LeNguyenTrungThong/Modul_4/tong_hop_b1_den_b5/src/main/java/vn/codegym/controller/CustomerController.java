package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.Customer;
import vn.codegym.service.CustomerService;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService ;

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

    @GetMapping(value = "/delete/{id}")
    public String deleteCustomer(@PathVariable int id){
        this.customerService.deleteCustomer(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String showFormEdit(Model model, @PathVariable int id){
        model.addAttribute("customer", customerService.findById(id));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String updateCustomer(@ModelAttribute Customer customer){
        this.customerService.editCustomer(customer);
        return "redirect:/list";
    }
}

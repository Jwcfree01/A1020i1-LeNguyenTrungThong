package vn.codegym.casestudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.casestudy.model.bean.Customer;
import vn.codegym.casestudy.model.service.CustomerService;
import vn.codegym.casestudy.model.service.Impl.CustomerTypeService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService ;

    @GetMapping(value = "/list")
    public ModelAndView listCustomer(@PageableDefault(value = 5) Pageable pageable){
        Page<Customer> customer = customerService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("customer/listCustomer");
        String msg = "Customer is empty";
        if (customer == null){
            modelAndView.addObject("msg", msg);
        }
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public String showFormCreateCustomer(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType", this.customerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping(value = "/create")
    public String createCustomer(@Validated @ModelAttribute Customer customer, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "customer/create";
        }else {
            this.customerService.createCustomer(customer);
        }
        return "redirect:/customer/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String editCustomer(@PathVariable("id") String id, Model model){
        model.addAttribute("customer", this.customerService.findById(id));
        model.addAttribute("customerType", this.customerTypeService.findAll());
        return "customer/edit";
    }

    @PostMapping(value = "/update")
    public String updateCustomer(@ModelAttribute Customer customer){
        this.customerService.updateCustomer(customer);
        return "redirect:/customer/list";
    }

    @GetMapping(value = "delete/{id}")
    public String deleteCustomer(@PathVariable String id){
        this.customerService.deleteCustomer(id);
        return "redirect:/customer/list";
    }

    @GetMapping(value = "/notAccess")
        public String showNotAccess(){
        return "notAccess";
    }
}

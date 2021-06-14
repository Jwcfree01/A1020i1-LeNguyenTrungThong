package controller;

import bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.CustomerServiceImpl;

@Controller
public class QLKHController {
//    @Autowired
//    private CustomerService customerService ;

    CustomerService customerService = new CustomerServiceImpl();

    @GetMapping(value = "/list")
    public ModelAndView showCustomer(){
        return new ModelAndView("list", "findCus", customerService.findAll());
    }
}

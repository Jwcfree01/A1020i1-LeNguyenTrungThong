package controller;

import model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class QLKHController {
    @Autowired
    CustomerService customerService;

//    @GetMapping(value = "/list")
//    public ModelAndView showListCustomer(){
//        return new ModelAndView("customer","customerList", this.customerService.findAll());
//    }

    @GetMapping(value = "/")
    public String showListCus(Model model) {
        List<Customer> customerList = this.customerService.findAll();
        model.addAttribute("customerList", customerList);
        return "list";
    }

    @GetMapping(value = "/customer/create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping(value = "/customer/create")
    private String createCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success", "create customer " + customer.getName() + " ok");
        return "redirect:/";
    }

    @GetMapping(value = "/customer/{id}/detail")
    public String details(@PathVariable int id, Model model){
        model.addAttribute("customer", this.customerService.finById(id));
        return "detail";
    }

    @GetMapping(value = "/customer/{id}/delete")
    public String deleteCustomer(@PathVariable int id, Model model){
        this.customerService.delete(id);
        return "redirect:/";
    }

    @GetMapping(value = "/customer/{id}/edit")
    public String showFormEdit(Model model, @PathVariable int id){
        model.addAttribute("customer", customerService.finById(id));
        return "edit";
    }

    @PostMapping(value = "/customer/update")
    public String update(Customer customer){
        this.customerService.edit(customer);
        return "redirect:/";
    }
}

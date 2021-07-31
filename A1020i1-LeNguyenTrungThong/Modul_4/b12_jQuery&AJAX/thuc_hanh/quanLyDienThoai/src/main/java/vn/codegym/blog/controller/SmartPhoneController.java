package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.blog.model.SmartPhone;
import vn.codegym.blog.service.SmartPhoneService;

@Controller
public class SmartPhoneController {

    @Autowired
    SmartPhoneService smartPhoneService;

    @GetMapping("/")
    public String showIndex(){
        return "index";
    }

    @GetMapping(value = "/create")
    public ModelAndView createSmartphonePage() {
        ModelAndView mav = new ModelAndView("newPhone");
        mav.addObject("sPhone", new SmartPhone());
        return mav;
    }

    @PostMapping(value = "/create")
    public String addSmartPhone(@ModelAttribute SmartPhone smartPhone){
        this.smartPhoneService.saveSmartPhone(smartPhone);
        return "redirect:/index";
    }

}

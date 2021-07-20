package vn.codegym.hitcounterr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.codegym.hitcounterr.model.Login;
import vn.codegym.hitcounterr.model.MyCounter;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    @ModelAttribute("mycounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @GetMapping("/counter")
    public String demAbc(@ModelAttribute("mycounter") MyCounter myCounter, @SessionAttribute(value = "login", required = false) Login login, Model model,
                         @CookieValue(value = "nameCookie", defaultValue = "") String cookieUser) {
        System.out.println(login);

        //cookie
        if (cookieUser != null && "admin".equals(cookieUser)){
            Login login1 = new Login();
            login1.setUserName(cookieUser);
        }

        //session
        if (login.getUserName().equals("guest") || login == null){
            return "redirect:/login";
        }
        myCounter.increment();
        login.getUserName();
        return "index";
    }

}

package vn.codegym.springsecurity.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import vn.codegym.springsecurity.model.service.UserDetailsServiceImpl;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    UserDetailsServiceImpl detailsService ;

    @GetMapping(value = "/")
    public String showIndex(){
        return "index";
    }

    @GetMapping(value = "/user")
    public String showForm(Principal principal){
        System.out.println(principal.getName());
        return "user";
    }
    //sao k co controller
    //trang hello cũng k có sao nó return về được á
    //nó lưu vo cookie neu k co controller thi no bat duoc cookie k voi cai do la đường dẫn mã
//    @GetMapping(value = "/roleAdmin")
//    public String roleAdmin(){
//        return "roleAdmin";
//
//    }

    @GetMapping(value = "/admin")
    public String showAdmin(){
        SecurityContext context = SecurityContextHolder.getContext();
        System.out.println(context.getAuthentication().getName());
        return "admin";
    }

    @GetMapping(value = "/roleAdmin")
    public String roleAdmin(){
        return "roleAdmin";

    }

    @GetMapping(value = "/roleUser")
    public String roleUser(){
        return "roleUser";

    }
}

package vn.codegym.hitcounterr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.codegym.hitcounterr.model.Login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("login")
public class TesstSession {

    @ModelAttribute("login")
    public Login setUpLogin(){
        return new Login("guest", "");
    }

    @GetMapping("login")
    public String showFormLogin(@ModelAttribute Login login){
        return "login";
    }

    @PostMapping("login")
    public String loginAccess(@RequestParam String username, String password, String check, @SessionAttribute("login") Login login,
                              @CookieValue(value = "nameCookie", defaultValue = "") String cookieUser, HttpServletResponse response){

        //session
        if (username.equals("admin")&&password.equals("123")){
            login.setUserName(username);
            login.setPassword(password);
            return "redirect:/counter";
        }

        //cookie
        if (check != null){
            Cookie cookie = new Cookie("nameCookie", username);
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
        }else {
            Cookie cookie = new Cookie("nameCookie", username);
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }

        login.getUserName();
        return "login";
    }
}

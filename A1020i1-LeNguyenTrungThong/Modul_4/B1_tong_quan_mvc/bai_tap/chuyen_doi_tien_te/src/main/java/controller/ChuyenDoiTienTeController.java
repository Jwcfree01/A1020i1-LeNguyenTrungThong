package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChuyenDoiTienTeController {
    @GetMapping("/")
    public String home(){
        return "formInput";
    }

    @GetMapping(value = "/formInput")
    public String formInput(@RequestParam("usd") int input, Model model){
        if (input == 0){
            model.addAttribute("output",0);
        }else {
            double output =input*23000;
            model.addAttribute("output", output);
        }
        return "formInput";
    }
}

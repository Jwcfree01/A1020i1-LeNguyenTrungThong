package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MayTinhController {
    @GetMapping("/")
    public String home(){
        return "list";
    }

    @PostMapping(value = "/list")
    public String mayTinh(Model model, @RequestParam("number1") int number1,
                          @RequestParam("number2") int number2, @RequestParam("phepTinh") String phepTinh){
        if (phepTinh.equals("+")){
            model.addAttribute("result", number1+number2);
        }else if (phepTinh.equals("-")){
            model.addAttribute("result", number1-number2);
        }else if (phepTinh.equals("*")){
            model.addAttribute("result", number1*number2);
        }else if (phepTinh.equals("/")){
            model.addAttribute("result", number1/number2);
        }else {
            model.addAttribute("result", "khong co gia tri");
        }
        return "list";
    }
}

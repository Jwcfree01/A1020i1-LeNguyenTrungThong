package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TuDienController {
    @GetMapping(value = "/")
    public String home(){
        return "list";
    }

    private String [] vn = new String[]{"xin chao", "phong hoc", "dong ho"};
    private String [] en = new String[]{"hello", "class room", "alarm"};

    @GetMapping(value = "/list")
    public String translate(@RequestParam("input") String input, Model model){
        model.addAttribute("input", input);
        model.addAttribute("output", this.findEn(input));
        return "list";
    }

    public String findEn(String input){
        String output = null;
        if (input == null){
            output = "khong co gia tri";
        }else {
            for (int i=0; i<vn.length; i++){
                if (input.equals(vn[i])){
                    output = en[i];
                }
            }
        }
        return output;
    }
}

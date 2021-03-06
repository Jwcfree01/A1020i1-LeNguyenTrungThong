package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping("/list")
    public String save(@RequestParam(value = "condiment", defaultValue = "None") String[] condiments, Model model) {
        model.addAttribute("condiments", condiments);
        model.addAttribute("message", "Saved");
        return "list";
    }
}

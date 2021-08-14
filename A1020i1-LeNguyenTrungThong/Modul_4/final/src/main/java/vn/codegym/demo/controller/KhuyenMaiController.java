package vn.codegym.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.demo.bean.KhuyenMai;
import vn.codegym.demo.service.KhuyenMaiService;

@Controller
public class KhuyenMaiController {
    @Autowired
    KhuyenMaiService khuyenMaiService;

    @GetMapping(value = "/list")
    public ModelAndView listKhuyenmai(@PageableDefault(value = 5) Pageable pageable){
        Page<KhuyenMai> khuyenMais = khuyenMaiService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("list");
        String msg = "Chua co khuyen mai";
        if (khuyenMais == null){
            modelAndView.addObject("msg", msg);
        }
        modelAndView.addObject("khuyenmai", khuyenMais);
        return modelAndView;
    }

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("khuyenMai", new KhuyenMai());
        return "create";
    }

    @PostMapping(value = "/create")
    public String createKhuyenMai(@Validated @ModelAttribute KhuyenMai khuyenMai, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            this.khuyenMaiService.create(khuyenMai);
        }
        System.out.println(khuyenMai);
        return "redirect:/list";
    }

    @GetMapping(value = "/edit/{id}")
    public String editKhuyenMai(@PathVariable("id") int id, Model model){
        System.out.println(id);
        model.addAttribute("khuyenMai", this.khuyenMaiService.finById(id));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String updateKhuyenMai(@ModelAttribute KhuyenMai khuyenMai){
        this.khuyenMaiService.create(khuyenMai);
        System.out.println(khuyenMai);
        return "redirect:/list";
    }

    @GetMapping(value = "delete/{id}")
    public String deleteKhuyenMai(@PathVariable int id){
        this.khuyenMaiService.delete(id);
        return "redirect:/list";
    }

    @GetMapping(value = "/search")
    public String searchByKey(@RequestParam String key, @PageableDefault(value = 5) Pageable pageable, Model model){
        Page<KhuyenMai> khuyenMais = khuyenMaiService.searchByName(key, pageable);
        if (khuyenMais.isEmpty()) {
            model.addAttribute("khuyenmai", khuyenMaiService.findAll(pageable));
        } else {
            model.addAttribute("key", khuyenMaiService.searchByName(key, pageable));
            model.addAttribute("khuyenmai", khuyenMais);
        }
        return "list";
    }
}

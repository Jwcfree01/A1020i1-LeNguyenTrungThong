package vn.codegym.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.model.Blog;
import vn.codegym.service.BlogService;

import javax.persistence.PersistenceContext;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping(value = "/")
    public String list(){
        return "list";
    }

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping(value = "/create")
    public String createBlog(@ModelAttribute Blog blog){
        this.blogService.createBlog(blog);
        return "redirect:/list";
    }
}

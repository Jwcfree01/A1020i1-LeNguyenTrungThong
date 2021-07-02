package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.service.BlogService;


@Controller
public class BlogController {

    @Autowired
    BlogService blogService;
//
//    @GetMapping(value = "list")
//    public ModelAndView listBlog(){
//        return new ModelAndView("list", "listBlog", this.blogService.findAll());
//    }

    @GetMapping(value = "/list")
    public ModelAndView listBlog(@PageableDefault(value = 3) Pageable pageable) {
        return new ModelAndView("list", "listBlog", this.blogService.findAll(pageable));
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

    @GetMapping(value = "/delete/{id}")
    public String deleteBlog(@PathVariable("id") int id){
        Blog blog = blogService.findById(id);
        if (blog != null) {
            blogService.deleteBlog(blog);
        }
//        blogService.deleteBlog(blog);
//        this.blogService.deleteBlog(id);
        return "redirect:/list";
    }


}

package vn.codegym.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import vn.codegym.blog.model.Blog;
import vn.codegym.blog.service.BlogService;

import java.util.List;


@Controller
public class BlogController {

    @Autowired
    BlogService blogService;
//
//    @GetMapping(value = "list")
//    public ModelAndView listBlog(){
//        return new ModelAndView("list", "listBlog", this.blogService.findAll());
//    }

//    @GetMapping(value = "/list")
//    public ModelAndView listBlog(@PageableDefault(value = 3) Pageable pageable) {
//        return new ModelAndView("list", "listBlog", this.blogService.findAll(pageable));
//    }

    @GetMapping(value = "/list")
    public Object listBlogRestFull(){
        List<Blog> blogList = this.blogService.findAll();
        if (blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
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

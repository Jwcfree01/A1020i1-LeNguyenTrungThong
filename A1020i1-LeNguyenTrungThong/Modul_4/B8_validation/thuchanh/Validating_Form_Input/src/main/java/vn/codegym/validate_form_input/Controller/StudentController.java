package vn.codegym.validate_form_input.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.validate_form_input.Model.Student;
import vn.codegym.validate_form_input.Service.StudentService;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/list")
    public ModelAndView listStudent(@PageableDefault(value = 3) Pageable pageable) {
    return new ModelAndView("list", "listStudent", this.studentService.findAll(pageable));
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/create")
    public String createStudent(@Validated @ModelAttribute Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "create";
        }else {
            this.studentService.createStudent(student);
            return "redirect:/list";
        }
    }

    @GetMapping(value = "/edit/{id}")
    public String showFormEdit(@PathVariable int id, Model model){
        model.addAttribute("student", this.studentService.findById(id));
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String updateStudent(@ModelAttribute Student student){
        this.studentService.updateStudent(student);
        return "redirect:/list";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        this.studentService.deleteStudent(id);
        return "redirect:/list";
    }
}













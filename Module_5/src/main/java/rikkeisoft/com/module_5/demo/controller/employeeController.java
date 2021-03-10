package rikkeisoft.com.module_5.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rikkeisoft.com.module_5.demo.Entity.Customer;
import rikkeisoft.com.module_5.demo.Entity.Employee;
import rikkeisoft.com.module_5.demo.service.employeeSevice;

import java.util.EnumMap;
import java.util.List;
@RequestMapping("/employee")
@Controller
public class employeeController {
    @Autowired
    private employeeSevice employeeSevice;
    @GetMapping("/home")
    public String viewHomePage( Model model) {
        List<Employee> list = employeeSevice.listAll();
        model.addAttribute("listsnv", list);
        return "employee_index";
    }
    @GetMapping("/new")
    public String showNewCusTomer(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add_employee";
    }
    @RequestMapping(value ="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("employee") Employee employee) {
        employeeSevice.save(employee);
        return "redirect:/employee/home";
    }
    @RequestMapping("/delete/{id}")
    public String deleteCusCtomer(@PathVariable(name = "id") int id) {
        employeeSevice.delete(id);
        return "redirect:/employee//home";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditCustomer(@PathVariable(name = "id") int id) {
        ModelAndView manv = new ModelAndView("edit_employee");
        Employee employee = employeeSevice.get(id);
        manv.addObject("employee", employee);

        return manv;
    }
}

package rikkeisoft.com.module_5.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import rikkeisoft.com.module_5.demo.Entity.Customer;
import rikkeisoft.com.module_5.demo.service.customerSevice;

import java.util.List;

//@RestController
//@RequestMapping("/users")
@Controller
public class customerController {
    @Autowired
    private customerSevice customerSevice;

    @GetMapping("/trangchu")
    public String TrangChu(){
        return "TrangChu";
    }
    @GetMapping("/home")
    public String viewHomePage( Model model) {
        List<Customer> list = customerSevice.listAll();
        model.addAttribute("lists", list);
        return "index";
    }
    @GetMapping("/new")
    public String showNewCusTomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer", customer);
        return "add_customer";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute("customer") Customer customer, BindingResult result, RedirectAttributes redirect) {
        if(result.hasErrors()){
            return "add_customer";
        }
        customerSevice.save(customer);
        redirect.addFlashAttribute("success", "Saved employee successfully!");
        return "redirect:/home";
    }
    @RequestMapping("/delete/{id}")
    public String deleteCusCtomer(@PathVariable(name = "id") int id) {
        customerSevice.delete(id);
        return "redirect:/home";
    }
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditCustomer(@PathVariable(name = "id") int id) {
        ModelAndView makh = new ModelAndView("edit_customer");
        Customer customer = customerSevice.get(id);
        makh.addObject("customer", customer);

        return makh;
    }
    @RequestMapping("/user/search")
    public String search(@RequestParam("s") String s, Model model) {
        if (s.equals("")) {
            return "redirect:/user";
        }
        model.addAttribute("customer", customerSevice.get(Integer.parseInt(s)));
        return "index";
    }

}

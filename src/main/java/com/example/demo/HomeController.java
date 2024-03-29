package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("customers", customerRepository.findAll());
        return "index";
    }

}

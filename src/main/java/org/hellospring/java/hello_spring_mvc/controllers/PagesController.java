package org.hellospring.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PagesController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about(@RequestParam(name = "name") String name, Model model) {

        model.addAttribute("name", name);

        return "about";
    }

    @GetMapping("/contacts")
    public String contacts() {
        return "contacts";
    }

}

package ru.Artur.firstMVC.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/first")
public class FirstController {


    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("a") int a,
                                 @RequestParam("b") int b,
                                 @RequestParam("action") String action,
                                 Model model) {
        double n = 0;
        switch (action) {
            case ("multiplication"):
                n = a * b;
                break;
            case ("addition"):
                n = a + b;
                break;
            case ("subtraction"):
                n = a - b;
                break;
            case ("division"):
                n = (double) a / b;
                break;
        }
        model.addAttribute("answer", n);
        return "first/calculator";

    }

    @GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            Model model) {


        model.addAttribute("message", "Hi " + name + " " + surname);
        return "first/hello";
    }


    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}


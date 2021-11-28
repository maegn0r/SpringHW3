package ru.gb.hello.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final String msg = "message";

    @RequestMapping
    public String printProduct(Model model){
        model.addAttribute("msg",msg);
        return "product";
    }

    @ModelAttribute("info")
    public String info(){
        return "Additional information";
    }
}

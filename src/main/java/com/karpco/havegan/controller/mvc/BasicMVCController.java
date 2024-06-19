package com.karpco.havegan.controller.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class BasicMVCController {

    @GetMapping("/fragements")
    public String fragements() {
        return "fragments/general";
    }

    @GetMapping("/")
    public String index() {
        return "mainpage";
    }
}

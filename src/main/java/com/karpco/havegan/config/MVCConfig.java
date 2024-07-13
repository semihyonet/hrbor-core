package com.karpco.havegan.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Configuration
public class MVCConfig {

    @ModelAttribute
    public void username(Model model) {
        model.addAttribute("username", "Karpco");
    }
}

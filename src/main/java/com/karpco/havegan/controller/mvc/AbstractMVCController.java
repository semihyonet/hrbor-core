package com.karpco.havegan.controller.mvc;

import com.karpco.havegan.entity.core.User;
import com.karpco.havegan.service.CustomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public abstract class AbstractMVCController {

    @Autowired
    private CustomUserService userDetailsService;

    @ModelAttribute
    public void addAttributes(Model model, Authentication authentication) {
        User user = userDetailsService.loadUserByUsername(authentication.getName());
        model.addAttribute("username", user.getFirstName() + " " + user.getLastName());
    }
}

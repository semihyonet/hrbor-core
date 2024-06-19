package com.karpco.havegan.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/collection")
public class AdminBrandController {

    public String getBrands() {
        return "Am I working?";
    }

    public String getBrand(String id) {
        return "Am I working?";
    }

    public String createBrand() {
        return "Am I working?";
    }

    public String updateBrand(String id) {
        return "Am I working?";
    }

    public String deleteBrand(String id) {
        return "Am I working?";
    }


}

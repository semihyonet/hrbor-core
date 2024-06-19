package com.karpco.havegan.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Hello Worldy!";
    }

//    private ProductService productService;

//    @Autowired
//    public TestController(ProductService productService) {
//        this.productService = productService;
//    }


    @GetMapping("/show/{id}")
    public String getProduct(@PathVariable String id) {
        return " Am I working?";
//        return productService.findById(id);
    }

//    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Product createProduct(@RequestBody CreateProductRequest productRequest) {
//        System.out.println("Am I working?");
//    }
}


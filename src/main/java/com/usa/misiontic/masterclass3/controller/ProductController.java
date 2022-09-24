package com.usa.misiontic.masterclass3.controller;


import com.usa.misiontic.masterclass3.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.getAll();
    }
    @PostMapping("/save")
    public Product save(@RequestBody  Product p){
        return productService.save(p);
    }
}

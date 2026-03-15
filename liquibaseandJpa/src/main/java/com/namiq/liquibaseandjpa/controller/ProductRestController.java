package com.namiq.liquibaseandjpa.controller;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
import com.namiq.liquibaseandjpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/products")
public class ProductRestController {
    private final ProductService productService;

    @PostMapping
    public Product create(@RequestBody ProductCreateRequest request){
      return   productService.save(request);
    }

}

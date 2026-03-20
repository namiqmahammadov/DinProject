package com.namiq.liquibaseandjpa.controller;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
import com.namiq.liquibaseandjpa.model.response.ProductResponse;
import com.namiq.liquibaseandjpa.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/products")
public class ProductRestController {
    private final ProductService productService;

    @PostMapping
    public Product create(@RequestBody ProductCreateRequest request) {
        return productService.save(request);
    }

    @GetMapping
    public List<ProductResponse> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable Integer id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public ProductResponse edit(@PathVariable Integer id,@RequestBody ProductResponse productResponse){
        return productService.edit(id,productResponse);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        productService.deleteById(id);
    }
}

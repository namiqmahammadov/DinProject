package com.namiq.liquibaseandjpa.service;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.dao.repository.ProductRepository;

import com.namiq.liquibaseandjpa.mapper.Mapper;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Product save(ProductCreateRequest request) {
        Product product=Mapper.toEntity(request);
        return productRepository.save(product);
    }
}

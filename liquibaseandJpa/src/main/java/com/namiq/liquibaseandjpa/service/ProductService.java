package com.namiq.liquibaseandjpa.service;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.dao.repository.ProductRepository;

import com.namiq.liquibaseandjpa.mapper.Mapper;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
import com.namiq.liquibaseandjpa.model.response.ProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;


    public Product save(ProductCreateRequest request) {
        Product product=Mapper.toEntity(request);
        return productRepository.save(product);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(Mapper::toResponse)
                .toList();
    }

    public ProductResponse findById(Integer id) {
        Product product=productRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Product not found"));
        return  Mapper.toResponse(product);
    }

    public ProductResponse edit(Integer id, ProductResponse productResponse) {

        Product existing = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        Mapper.updateProductFromResponse(productResponse, existing);
        Product saved = productRepository.save(existing);
        return Mapper.toResponse(saved);
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}

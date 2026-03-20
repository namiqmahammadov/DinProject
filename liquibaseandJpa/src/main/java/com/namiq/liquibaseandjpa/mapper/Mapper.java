package com.namiq.liquibaseandjpa.mapper;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
import com.namiq.liquibaseandjpa.model.response.ProductResponse;
import lombok.Builder;

@Builder
public class Mapper {
    public static Product toEntity(ProductCreateRequest request){
        return  Product.builder()
                        .name(request.getName())
                .price(request.getPrice())
                .quantity(request.getQuantity())
                .build();
    }
    public static ProductResponse toResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        response.setQuantity(product.getQuantity());
        response.setCreateAt(product.getCreatedAt());
        return response;
    }
    public static void updateProductFromResponse(ProductResponse productResponse, Product product) {
        product.setName(productResponse.getName());
        product.setPrice(productResponse.getPrice());
        product.setQuantity(productResponse.getQuantity());
    }
}

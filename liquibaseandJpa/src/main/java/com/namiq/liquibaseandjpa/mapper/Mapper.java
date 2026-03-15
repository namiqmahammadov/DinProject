package com.namiq.liquibaseandjpa.mapper;

import com.namiq.liquibaseandjpa.dao.entity.Product;
import com.namiq.liquibaseandjpa.model.request.ProductCreateRequest;
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
}

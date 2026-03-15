package com.namiq.liquibaseandjpa.dao.repository;

import com.namiq.liquibaseandjpa.dao.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product,Integer> {
}

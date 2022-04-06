package com.project.shoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.shoes.entity.Product;
public interface ProductRepository extends JpaRepository<Product, Long>{
}

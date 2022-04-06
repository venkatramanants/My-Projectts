package com.project.shoes.jdbc;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}

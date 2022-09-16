package com.example.demo.dao;

import com.example.demo.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories,Integer> {
}

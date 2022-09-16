package com.example.demo.dao;

import com.example.demo.models.Stores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoresRepository extends JpaRepository<Stores,Integer> {
}

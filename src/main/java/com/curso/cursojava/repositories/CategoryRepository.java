package com.curso.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cursojava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

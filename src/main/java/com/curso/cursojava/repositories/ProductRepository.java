package com.curso.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cursojava.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}

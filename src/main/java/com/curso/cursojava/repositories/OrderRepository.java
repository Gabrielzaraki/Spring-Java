package com.curso.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cursojava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

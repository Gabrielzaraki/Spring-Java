package com.curso.cursojava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.cursojava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}

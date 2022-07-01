package com.homeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	

}

package com.homeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}

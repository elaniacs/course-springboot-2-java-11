package com.homeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}

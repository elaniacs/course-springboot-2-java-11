package com.homeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}

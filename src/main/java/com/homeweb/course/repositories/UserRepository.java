package com.homeweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}

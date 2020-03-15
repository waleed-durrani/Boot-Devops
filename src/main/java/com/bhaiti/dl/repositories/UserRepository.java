package com.bhaiti.dl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhaiti.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
}

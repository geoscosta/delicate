package com.dts.delicate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dts.delicate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}

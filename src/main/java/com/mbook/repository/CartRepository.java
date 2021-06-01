package com.mbook.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbook.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, UUID>{

	
}

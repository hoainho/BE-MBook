package com.mbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mbook.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long >{
	
}

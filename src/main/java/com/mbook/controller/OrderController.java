package com.mbook.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbook.entity.Orders;
import com.mbook.repository.OrderRepository;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderRepository repo;
//	@Autowired
//	private JwtUtil jwtUtil;

	@GetMapping("/get")
	public ResponseEntity<List<Orders>> list() {
		return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
	}

	@GetMapping("/details/{posterId}")
	public ResponseEntity<Orders> get(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(repo.getOne(id));
	}

}

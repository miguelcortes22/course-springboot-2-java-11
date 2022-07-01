package com.meucursoudemy.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meucursoudemy.course.entities.Order;
import com.meucursoudemy.course.services.OrderService;

@RestController // Rest controller
@RequestMapping(value = "/orders") // Nome do recurso
public class OrderResource { 
	
	@Autowired
	private OrderService service;
	
	@GetMapping // Método que responde a requisição do tipo get do http
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) { //PathVariable p/ o spring aceitar o parâmetro enviado na url
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

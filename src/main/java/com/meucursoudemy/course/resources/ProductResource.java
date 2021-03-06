package com.meucursoudemy.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meucursoudemy.course.entities.Product;
import com.meucursoudemy.course.services.ProductService;

@RestController // Rest controller
@RequestMapping(value = "/products") // Nome do recurso
public class ProductResource { 
	
	@Autowired
	private ProductService service;
	
	@GetMapping // Método que responde a requisição do tipo get do http
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) { //PathVariable p/ o spring aceitar o parâmetro enviado na url
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

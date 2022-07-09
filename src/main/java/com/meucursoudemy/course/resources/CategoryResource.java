package com.meucursoudemy.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meucursoudemy.course.entities.Category;
import com.meucursoudemy.course.services.CategoryService;

@RestController // Rest controller
@RequestMapping(value = "/categories") // Nome do recurso
public class CategoryResource { 
	
	@Autowired
	private CategoryService service;
	
	@GetMapping // Método que responde a requisição do tipo get do http
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) { //PathVariable p/ o spring aceitar o parâmetro enviado na url
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

package com.meucursoudemy.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meucursoudemy.course.entities.User;
import com.meucursoudemy.course.services.UserService;

@RestController // Rest controller
@RequestMapping(value = "/users") // Nome do recurso
public class UserResource { 
	
	@Autowired
	private UserService service;
	
	@GetMapping // Método que responde a requisição do tipo get do http
	public ResponseEntity<List<User>> findAll() {
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) { //PathVariable p/ o spring aceitar o parâmetro enviado na url
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}

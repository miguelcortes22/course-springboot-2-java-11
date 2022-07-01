package com.meucursoudemy.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meucursoudemy.course.entities.User;

@RestController // Rest controller
@RequestMapping(value = "/users") // Nome do recurso
public class UserResource { 
	
	@GetMapping // Método que responde a requisição do tipo get do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Miguel", "miguel@gmail.com", "999990000","12345");
		return ResponseEntity.ok().body(u);
	}
}

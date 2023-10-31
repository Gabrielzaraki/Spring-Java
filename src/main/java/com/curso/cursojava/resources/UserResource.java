package com.curso.cursojava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.cursojava.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findaAll(){
		User u = new User(1L, "Maria", "Mariamail.com", "999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}

package com.jayesh.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jayesh.model.Roles;
import com.jayesh.model.User;
import com.jayesh.services.RolesService;
import com.jayesh.services.UserService;

@RestController
public class MainController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RolesService rolesService;
	
	@PostMapping("/addRole")
	public String addRole(@RequestBody  Roles role) {
		rolesService.save(role);
		return "success!!";
	}
	
	@GetMapping("/getAllRoles")
	public ResponseEntity<?> getAllRoles() {
		return ResponseEntity.ok().body(rolesService.listAll());
	}
	
	@GetMapping("/getRole/{id}")
	public ResponseEntity<?> getRoleById(@PathVariable int id) {
		return ResponseEntity.ok().body(rolesService.get(id));
	}
	
	@DeleteMapping("/deleteRole/{id}")
	public ResponseEntity<?> deleteRoleId(@PathVariable int id) {
		Roles role = rolesService.get(id);
		role.setIsDeleted(1);
		rolesService.save(role);
		return ResponseEntity.ok().body("success");
	}
	
	@PostMapping("/addUser")
	public String addRole(@RequestBody  User user) {
		userService.save(user);
		return "success!!";
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<?> getAllUser() {
		return ResponseEntity.ok().body(userService.listAll());
	}
	
	@GetMapping("/getUser/{id}")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		return ResponseEntity.ok().body(userService.get(id));
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<?> deleteUserId(@PathVariable int id) {
		User user = userService.get(id);
		user.setIsDeleted(1);
		userService.save(user);
		return ResponseEntity.ok().body("success");
	}
	
}

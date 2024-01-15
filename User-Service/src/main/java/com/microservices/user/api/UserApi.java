package com.microservices.user.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.user.entity.UserMaster;
import com.microservices.user.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping(value = "/api/v1/user")
public class UserApi {

	private final UserService service;

	@PostMapping
	ResponseEntity<Map<Object, Object>> addUser(@RequestBody UserMaster master) {
		log.info("adding User ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", service.save(master));
		return new ResponseEntity<>(map, HttpStatus.CREATED);
	}

	@PutMapping
	ResponseEntity<Map<Object, Object>> updateUser(@RequestBody UserMaster master) {
		log.info("updating User ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", service.edit(master));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping
	ResponseEntity<Map<Object, Object>> getAllUser() {
		log.info("getting all User ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", service.getAll());
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/{userId}")
	ResponseEntity<Map<Object, Object>> getUserById(@PathVariable Integer userId) {
		log.info("getting User by id ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", service.getById(userId));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

}

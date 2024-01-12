package com.microservices.quiz.api;

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

import com.microservices.quiz.entity.QuizMaster;
import com.microservices.quiz.service.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping(value = "/api/v1/quiz")
public class QuizApi {

	private final QuizService quizService;

	@PostMapping
	ResponseEntity<Map<Object, Object>> addQuiz(@RequestBody QuizMaster master) {
		log.info("adding quiz ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", quizService.save(master));
		return new ResponseEntity<>(map, HttpStatus.CREATED);
	}

	@PutMapping
	ResponseEntity<Map<Object, Object>> updateQuiz(@RequestBody QuizMaster master) {
		log.info("updating quiz ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", quizService.edit(master));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping
	ResponseEntity<Map<Object, Object>> getAllQuiz() {
		log.info("getting all quiz ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", quizService.getAll());
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/{quizId}")
	ResponseEntity<Map<Object, Object>> getQuizById(@PathVariable Integer quizId) {
		log.info("getting quiz by id ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", quizService.getById(quizId));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}
}

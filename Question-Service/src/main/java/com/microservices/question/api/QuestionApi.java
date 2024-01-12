package com.microservices.question.api;

import java.util.HashMap;
import java.util.List;
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

import com.microservices.question.entity.QuestionMaster;
import com.microservices.question.service.QuestionService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping(value = "/api/v1/question")
public class QuestionApi {

	private final QuestionService questionService;

	@PostMapping
	ResponseEntity<Map<Object, Object>> addQuestion(@RequestBody QuestionMaster master) {
		log.info("adding question ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", questionService.save(master));
		return new ResponseEntity<>(map, HttpStatus.CREATED);
	}

	@PutMapping
	ResponseEntity<Map<Object, Object>> updateQuestion(@RequestBody QuestionMaster master) {
		log.info("updating question ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", questionService.edit(master));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping
	ResponseEntity<Map<Object, Object>> getAllQuestion() {
		log.info("getting all question ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", questionService.getAll());
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/{questionId}")
	ResponseEntity<Map<Object, Object>> getQuestionById(@PathVariable Integer questionId) {
		log.info("getting question by id ...");
		Map<Object, Object> map = new HashMap<>();
		map.put("SUCCESS", true);
		map.put("DATA", questionService.getById(questionId));
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/quiz/{quizId}")
	List<QuestionMaster> getByQuizId(@PathVariable Integer quizId) {
		log.info("getting question by id ...");
		return questionService.getByQuizId(quizId);
	}
}

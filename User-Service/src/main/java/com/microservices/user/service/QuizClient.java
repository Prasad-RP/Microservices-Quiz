package com.microservices.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.user.entity.QuizMaster;

@FeignClient(name = "QUIZ-SERVICE")
public interface QuizClient {

	@GetMapping("/api/v1/quiz/user/{userId}")
	List<QuizMaster> getQuizByUser(@PathVariable Integer userId);
}

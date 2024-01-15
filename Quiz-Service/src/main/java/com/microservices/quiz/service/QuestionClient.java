package com.microservices.quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.quiz.entity.QuestionMaster;

//@FeignClient(url = "http://localhost:9092/api/v1/question", value = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {

//	@GetMapping("/quiz/{quizId}")
//	List<QuestionMaster> getQuestionsOfQuiz(@PathVariable Integer quizId);

	@GetMapping("/api/v1/question/quiz/{quizId}")
	List<QuestionMaster> getQuestionsOfQuiz(@PathVariable Integer quizId);
}

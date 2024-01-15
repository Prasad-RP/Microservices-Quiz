package com.microservices.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.microservices.quiz.entity.QuizMaster;

@Transactional(readOnly = false)
public interface QuizService {

	Optional<QuizMaster> save(QuizMaster master);

	Optional<QuizMaster> edit(QuizMaster master);

	Optional<QuizMaster> getById(Integer quizId);

	List<QuizMaster> getAll();

	List<QuizMaster> getByUserId(Integer userId);

}

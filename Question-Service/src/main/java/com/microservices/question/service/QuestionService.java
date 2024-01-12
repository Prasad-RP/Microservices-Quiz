package com.microservices.question.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.microservices.question.entity.QuestionMaster;

@Transactional(readOnly = false)
public interface QuestionService {

	Optional<QuestionMaster> save(QuestionMaster master);

	Optional<QuestionMaster> edit(QuestionMaster master);

	Optional<QuestionMaster> getById(Integer questionId);

	List<QuestionMaster> getAll();

	List<QuestionMaster> getByQuizId(Integer quizId);
}

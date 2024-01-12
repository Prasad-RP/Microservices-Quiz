package com.microservices.question.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservices.question.entity.QuestionMaster;
import com.microservices.question.repository.QuestionRepository;
import com.microservices.question.service.QuestionService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

	private final QuestionRepository questionRepository;

	@Override
	public Optional<QuestionMaster> save(QuestionMaster master) {
		return Optional.of(questionRepository.save(master));
	}

	@Override
	public Optional<QuestionMaster> edit(QuestionMaster master) {
		return Optional.of(questionRepository.save(master));
	}

	@Override
	public Optional<QuestionMaster> getById(Integer questionId) {
		return questionRepository.findById(questionId);
	}

	@Override
	public List<QuestionMaster> getAll() {
		return questionRepository.findAll();
	}

	@Override
	public List<QuestionMaster> getByQuizId(Integer quizId) {
		return questionRepository.findByQuizId(quizId);
	}
}

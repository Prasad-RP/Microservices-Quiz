package com.microservices.quiz.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.microservices.quiz.entity.QuizMaster;
import com.microservices.quiz.repository.QuizRepository;
import com.microservices.quiz.service.QuestionClient;
import com.microservices.quiz.service.QuizService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

	private final QuizRepository quizRepository;
	private final QuestionClient client;

	@Override
	public Optional<QuizMaster> save(QuizMaster master) {
		return Optional.of(quizRepository.save(master));
	}

	@Override
	public Optional<QuizMaster> edit(QuizMaster master) {
		return Optional.of(quizRepository.save(master));
	}

	@Override
	public Optional<QuizMaster> getById(Integer quizId) {
		Optional<QuizMaster> quiz = quizRepository.findById(quizId);
		quiz.ifPresent(p -> {
			p.setQuestionMasters(client.getQuestionsOfQuiz(p.getQuizId()));
		});
		return quiz;
	}

	@Override
	public List<QuizMaster> getAll() {
		List<QuizMaster> quizs = quizRepository.findAll();
		quizs.forEach(p -> {
			p.setQuestionMasters(client.getQuestionsOfQuiz(p.getQuizId()));
		});
		return quizs;
	}

}

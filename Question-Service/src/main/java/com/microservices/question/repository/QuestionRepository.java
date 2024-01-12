package com.microservices.question.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.question.entity.QuestionMaster;

@Repository
public interface QuestionRepository extends JpaRepository<QuestionMaster, Integer> {

	List<QuestionMaster> findByQuizId(Integer quizId);
}

package com.microservices.quiz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.quiz.entity.QuizMaster;

@Repository
public interface QuizRepository extends JpaRepository<QuizMaster, Integer>{

	List<QuizMaster> findByUserId(Integer userId);
}

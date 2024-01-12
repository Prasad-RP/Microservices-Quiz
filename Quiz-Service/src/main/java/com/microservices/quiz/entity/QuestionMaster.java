package com.microservices.quiz.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuestionMaster implements Serializable{

	private static final long serialVersionUID = -2914140171341472757L;

	private Integer questionId;

	private String question;

	private Integer quizId;
}

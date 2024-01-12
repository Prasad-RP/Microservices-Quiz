package com.microservices.question.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "question_master")
@AllArgsConstructor
@NoArgsConstructor
public class QuestionMaster implements Serializable{
	private static final long serialVersionUID = -3523041949585590518L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private Integer questionId;

	private String question;

	@Column(name = "quiz_id")
	private Integer quizId;
}

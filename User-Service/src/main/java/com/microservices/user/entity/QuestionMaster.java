package com.microservices.user.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuestionMaster implements Serializable {

	private static final long serialVersionUID = -7384904045774030335L;

	private Integer questionId;

	private String question;
}

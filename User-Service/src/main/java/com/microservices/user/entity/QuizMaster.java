package com.microservices.user.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizMaster implements Serializable {

	private static final long serialVersionUID = 2230210308886759720L;

	private Integer quizId;

	private String title;

	private transient List<QuestionMaster> questionMasters = new ArrayList<>();
}

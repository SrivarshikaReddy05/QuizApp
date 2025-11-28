package com.quizapp.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class QuestionWrapper {
	
	public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3,
			String option4) {
		this.id = id;
		this.QuestionTitle = questionTitle;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
	}
	private Integer id;
	private String QuestionTitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
}

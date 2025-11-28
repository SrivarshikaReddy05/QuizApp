package com.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.quizapp.model.Question;
import com.quizapp.model.QuestionDao;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionDao.findAll();
	}
	public List<Question> getAllQuestionsByCategory(String category) {
		// TODO Auto-generated method stub
		return questionDao.findByCategory(category);
	}
	public String addQuestion(Question question) {
		// TODO Auto-generated method stub
		questionDao.save(question);
		return "success";
	}
	
	
}

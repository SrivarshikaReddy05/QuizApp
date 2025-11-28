package com.quizapp.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{

	public List<Question> findByCategory(String category);
	
	@Query(value="SELECT * FROM question q WHERER q.category=:category ORDER BY RANDOM() LIMIT :numQ" , nativeQuery = true)
	List<Question> findRandomQuestionsByCategory(String category,
			int numQ);

}

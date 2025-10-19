package com.microservices.quiz_service.Dao;

import com.microservices.quiz_service.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoQuiz extends JpaRepository<Quiz,Integer> {
}

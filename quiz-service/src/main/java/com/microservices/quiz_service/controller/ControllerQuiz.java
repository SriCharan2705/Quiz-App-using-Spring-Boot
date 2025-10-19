package com.microservices.quiz_service.controller;

import com.microservices.quiz_service.model.QuestionWrapper;
import com.microservices.quiz_service.model.Quiz;
import com.microservices.quiz_service.model.QuizDto;
import com.microservices.quiz_service.model.Sheet;
import com.microservices.quiz_service.service.ServiceQuiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryConfigurationSource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class ControllerQuiz {

    @Autowired
    private ServiceQuiz serviceQuiz;

    @GetMapping("/allQuizzes")
    public ResponseEntity<List<Quiz>> getAllQuizzes(){
        return serviceQuiz.getAllQuizzes();
    }
    @GetMapping("/getQuizById")
    public ResponseEntity<Quiz> getQuizById(@RequestParam int id){
        return serviceQuiz.getQuizById(id);
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
        return serviceQuiz.getQuizQuestion(id);
    }
    @PostMapping("/createQuiz")
   public ResponseEntity<String> createQuiz(@RequestBody QuizDto quizDto){
        return serviceQuiz.createQuiz(quizDto);
    }
    @PostMapping("/submit/{id}")
    public ResponseEntity<Integer> submitQuiz(@PathVariable Integer id, @RequestBody List<Sheet> response){
        return serviceQuiz.calculateResult(id,response);
    }

    //questions in quiz
}

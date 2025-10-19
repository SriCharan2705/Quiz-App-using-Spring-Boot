package com.microservices.quiz_service.service;

import com.microservices.quiz_service.Dao.RepoQuiz;
import com.microservices.quiz_service.feign.QuizInterface;
import com.microservices.quiz_service.model.QuestionWrapper;
import com.microservices.quiz_service.model.Quiz;
import com.microservices.quiz_service.model.QuizDto;
import com.microservices.quiz_service.model.Sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceQuiz {

    @Autowired
    private RepoQuiz repoQuiz;

    @Autowired
    QuizInterface quizInterface;

    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        return new ResponseEntity<>(repoQuiz.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Quiz> getQuizById(int id) {
        return new ResponseEntity<>(repoQuiz.findById(id).get(), HttpStatus.OK);
    }

    public ResponseEntity<String> createQuiz(QuizDto quizDto) {
        List<Integer> questions = quizInterface.getQuestionsForQuiz(quizDto.getCategory(), quizDto.getNumQues()).getBody();
        Quiz quiz = new Quiz();
        quiz.setTitle(quizDto.getTitle());
        quiz.setQIds(questions);
        repoQuiz.save(quiz);

        return new ResponseEntity<>("Sucess",HttpStatus.CREATED);
    }

    public ResponseEntity<List<QuestionWrapper>> getQuizQuestion(Integer id){
        Quiz quiz = repoQuiz.findById(id).get();
        List<Integer> questionIds = quiz.getQIds();

        ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionFromId(questionIds);
        return questions;
    }

    public ResponseEntity<Integer> calculateResult(Integer id, List<Sheet> response){
        ResponseEntity<Integer> score = quizInterface.getScore(response);
        return score;
    }
}

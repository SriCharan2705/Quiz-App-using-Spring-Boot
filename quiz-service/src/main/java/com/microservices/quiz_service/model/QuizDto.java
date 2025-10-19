package com.microservices.quiz_service.model;

import lombok.Data;

@Data
public class QuizDto {
    private String category;
    private int numQues;
    private String title;

}

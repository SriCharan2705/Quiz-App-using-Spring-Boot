package com.microservices.quiz_service.model;

import lombok.Data;

@Data
public class Sheet {
    private int quizId;
    private int qId;
    private Character answer;
}

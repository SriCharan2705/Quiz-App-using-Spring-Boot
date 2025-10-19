package com.microservices.quiz_service.model;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class QuestionWrapper {

    @Id
    private int qId;
    private String question;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;

}

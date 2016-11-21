package com.agroho.services;

import com.agroho.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 21-Nov-16.
 */
@Service
public interface QuestionServices {

    List<Question> getQuestionList();

    Question getQuestionById(int questionId);

    void submitQuestionList(List<Question> questions);

    void submitQuestion(Question question);

    }

package com.agroho.services;

import com.agroho.domain.Question;
import com.agroho.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by USER on 21-Nov-16.
 */
@Service
public class QuestionServicesImpl implements QuestionServices{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionList() {
        return questionRepository.findAll();
    }

    @Override
    public Question getQuestionById(int questionId) {
        return null;
    }

    @Override
    public void submitQuestionList(List<Question> questions) {
        questionRepository.save(questions);
    }

    @Override
    public void submitQuestion(Question question) {
        questionRepository.saveAndFlush(question);
    }
}

package com.agroho.rest;

import com.agroho.domain.Question;
import com.agroho.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Author: Rezaul - Date: 21-Nov-16.
 */

@RestController
public class QuestionRestController {

    @Autowired
    QuestionServices questionServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<Question> getQuestionList(){
        return questionServices.getQuestionList();
    }

    @RequestMapping(value = "/question/all", method = RequestMethod.POST)
    public void submitQuestionnairesReport(@RequestBody List<Question> questions) {
        questionServices.submitQuestionList(questions);
    }

    @RequestMapping(value = "/question", method = RequestMethod.POST)
    public void addQuestion(@RequestBody Question question) {
        questionServices.submitQuestion(question);
    }

}

package com.agroho.rest;

import com.agroho.domain.Question;
import com.agroho.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Rezaul - Date: 21-Nov-16.
 */

@RestController
public class QuestionRestController {

    @Autowired
    QuestionServices questionServices;

    @CrossOrigin
    @RequestMapping(value = "/question/all", method = RequestMethod.GET)
    List<Question> getQuestionList(){
        return questionServices.getQuestionList();
    }

    @CrossOrigin
    @RequestMapping(value = "/question/all", method = RequestMethod.POST)
    public void submitQuestionnairesReport(@RequestBody List<Question> questions) {
        questionServices.submitQuestionList(questions);
    }

    @CrossOrigin
    @RequestMapping(value = "/question", method = RequestMethod.POST)
    public void addQuestion(@RequestBody Question question) {
        questionServices.submitQuestion(question);
    }

}

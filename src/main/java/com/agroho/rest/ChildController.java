package com.agroho.rest;

import com.agroho.domain.Child;
import com.agroho.domain.Parent;
import com.agroho.domain.AutismCenter;
import com.agroho.services.AutismCenterService;
import com.agroho.services.ChildService;
import com.agroho.services.ParentService;
import com.agroho.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@RestController
public class ChildController {

    @Autowired
    ChildService childService;

    @Autowired
    ParentService parentService;

    @Autowired
    AutismCenterService autismCenterService;

    @Autowired
    QuestionServices questionServices;

    @RequestMapping(value = "/api/parent/{parentId}", method = RequestMethod.GET)
    List<Child> getChildResultByParentId(@PathVariable("parentId") Long parentId){

        return parentService.getAllChildResultByParentId(parentId);

    }

    @RequestMapping(value="/api/parent", method = RequestMethod.POST)
    public void addParent(@RequestBody Parent parent){
        parentService.addParent(parent);
    }

    @RequestMapping(value = "/api/autismcenter", method = RequestMethod.POST)
    public void addAutismCenter(AutismCenter autismCenter){
        autismCenterService.addAutismCenter(autismCenter);
    }


    @RequestMapping(value = "/api/child/submit", method = RequestMethod.POST)
    public void submitChildResult(@RequestBody Child child){

        System.out.println("Child Name: "+child.getName());
        Parent parent = parentService.getParentById(child.getParent().getId());
        System.out.println("Parent Name: "+parent.getName());

    /*    System.out.println("Question 1: Title -> "+child.getQuestionList().get(0).getName());*/
        childService.submitChildResultFromApp(child);


    /*    List<Question> questions = child.getQuestionList();
        questionServices.submitQuestionList(questions);
        childService.submitChildResultFromApp(child);
        Long parentId = child.getParent().getId();
        Parent parent = parentService.getParentById(parentId);
        System.out.println(parent.getName());*/
      /*    Parent parent = child.getParent().getId();
        AutismCenter autismCenter = parent.getAutismCenter();
        childService.submitChildResultFromApp(child);
      parentService.addParent(parent);
        autismCenterService.addAutismCenter(autismCenter);
        questionServices.submitQuestionList(questions);*/
    }



    @RequestMapping(value = "/api/child/status", method = RequestMethod.GET)
    public String getChildStatus(){
        return "Hello, all child are ready!";
    }
}

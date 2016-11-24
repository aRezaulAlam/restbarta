package com.agroho.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author: rezaul || Date: 11/22/16.
 */

@Entity
public class Child extends BaseEntity{

    private String name;
    private float age;
    private Date birthDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChildResponseQuestion> childResponseQuestions;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    @JsonBackReference
    private Parent parent;
    private boolean appResult;
    private String doctorNote;
    private boolean doctorResult;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<ChildResponseQuestion> getChildResponseQuestions() {
        return childResponseQuestions;
    }

    public void setChildResponseQuestions(List<ChildResponseQuestion> childResponseQuestions) {
        this.childResponseQuestions = childResponseQuestions;
    }

    /* public List<Question> getQuestionList() {
            return questionList;
        }

        public void setQuestionList(List<Question> questionList) {
            this.questionList = questionList;
        }
    */
    /*  public List<Question> getQuestionList() {
                return questionList;
            }

            public void setQuestionList(List<Question> questionList) {
                this.questionList = questionList;
            }
        */
    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public boolean isAppResult() {
        return appResult;
    }

    public void setAppResult(boolean appResult) {
        this.appResult = appResult;
    }

    public String getDoctorNote() {
        return doctorNote;
    }

    public void setDoctorNote(String doctorNote) {
        this.doctorNote = doctorNote;
    }

    public boolean isDoctorResult() {
        return doctorResult;
    }

    public void setDoctorResult(boolean doctorResult) {
        this.doctorResult = doctorResult;
    }
}

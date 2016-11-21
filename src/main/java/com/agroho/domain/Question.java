package com.agroho.domain;

import javax.persistence.Entity;
import javax.persistence.Lob;
import java.util.Arrays;

/**
 * Created by sayemkcn on 11/9/16.
 */
@Entity
public class Question extends BaseEntity {

    private String name;
    private int questionId;
    @Lob
    private byte[] file;
    private boolean result;
    private String positiveText;
    private String negativeText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getPositiveText() {
        return positiveText;
    }

    public void setPositiveText(String positiveText) {
        this.positiveText = positiveText;
    }

    public String getNegativeText() {
        return negativeText;
    }

    public void setNegativeText(String negativeText) {
        this.negativeText = negativeText;
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", questionId=" + questionId +
                ", file=" + Arrays.toString(file) +
                ", result=" + result +
                ", positiveText='" + positiveText + '\'' +
                ", negativeText='" + negativeText + '\'' +
                '}';
    }
}
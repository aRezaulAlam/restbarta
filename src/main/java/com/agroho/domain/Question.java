package com.agroho.domain;

import javax.persistence.*;
import java.util.Arrays;
@Entity
public class Question extends BaseEntity {
    private String name;
    private int questionId;
    @Column(length = 10000000)
    @Basic(fetch = FetchType.LAZY, optional = true)
    private byte[] file;
    private String trueText;
    private String falseText;
    private boolean autismDetectionValue;
    private boolean critical;

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

    public String getTrueText() {
        return trueText;
    }

    public void setTrueText(String trueText) {
        this.trueText = trueText;
    }

    public String getFalseText() {
        return falseText;
    }

    public void setFalseText(String falseText) {
        this.falseText = falseText;
    }


    public boolean isAutismDetectionValue() {
        return autismDetectionValue;
    }

    public void setAutismDetectionValue(boolean autismDetectionValue) {
        this.autismDetectionValue = autismDetectionValue;
    }

    public boolean isCritical() {
        return critical;
    }

    public void setCritical(boolean critical) {
        this.critical = critical;
    }
}
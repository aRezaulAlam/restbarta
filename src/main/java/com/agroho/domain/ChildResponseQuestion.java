package com.agroho.domain;

import javax.persistence.Entity;

/**
 * Author: rezaul || Date: 11/23/16.
 */

@Entity
public class ChildResponseQuestion extends BaseEntity{

    private int respondedQuestionId;

    private boolean userResponse;

    public int getRespondedQuestionId() {
        return respondedQuestionId;
    }

    public void setRespondedQuestionId(int respondedQuestionId) {
        this.respondedQuestionId = respondedQuestionId;
    }

    public boolean isUserResponse() {
        return userResponse;
    }

    public void setUserResponse(boolean userResponse) {
        this.userResponse = userResponse;
    }
}

package com.agroho.domain;

import com.agroho.domain.pogo.AutismCenter;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * Author: Rezaul - Date: 21-Nov-16.
 */
public class Parent extends User {

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Child> childList;
    @OneToOne
    private AutismCenter autismCenter;

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public AutismCenter getAutismCenter() {
        return autismCenter;
    }

    public void setAutismCenter(AutismCenter autismCenter) {
        this.autismCenter = autismCenter;
    }
}

package com.agroho.services;

import com.agroho.domain.Child;
import com.agroho.domain.Parent;
import com.agroho.repositories.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: rezaul || Date: 11/22/16.
 */

@Service
public class ChildServiceImpl implements ChildService {

    @Autowired
    ChildRepository childRepository;

    @Override
    public void submitChildResultFromApp(Child child) {

        childRepository.saveAndFlush(child);
    }

    @Override
    public List<Child> getAllChildResult() {
        return null;
    }

    @Override
    public List<Child> getAllChildResultByParentId(Parent parent) {
        return null;
    }
}

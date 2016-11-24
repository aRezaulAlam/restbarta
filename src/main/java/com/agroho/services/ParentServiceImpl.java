package com.agroho.services;

import com.agroho.domain.Child;
import com.agroho.domain.Parent;
import com.agroho.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Service
public class ParentServiceImpl implements ParentService {

    @Autowired
    ParentRepository parentRepository;

    @Override
    public void addParent(Parent parent) {
        parentRepository.saveAndFlush(parent);
    }

    @Override
    public Parent getParentById(Long id) {
        return parentRepository.findOne(id);
    }

    @Override
    public List<Child> getAllChildResultByParentId(Long parentId) {

        Parent parent = parentRepository.findOne(parentId);
        List<Child> children = parent.getChildren();

        System.out.println("No of Child: "+children.size());

        return children;
    }
}

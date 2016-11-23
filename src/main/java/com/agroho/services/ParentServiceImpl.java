package com.agroho.services;

import com.agroho.domain.Parent;
import com.agroho.repositories.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

package com.agroho.services;

import com.agroho.domain.AutismCenter;
import com.agroho.repositories.AutismCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: rezaul || Date: 11/22/16.
 */

@Service
public class AutismCenterServiceImpl implements AutismCenterService {

    @Autowired
    AutismCenterRepository autismCenterRepository;

    @Override
    public void addAutismCenter(AutismCenter autismCenter) {

        autismCenterRepository.saveAndFlush(autismCenter);
    }

    @Override
    public AutismCenter getAutismCenterById(Long id) {
        return autismCenterRepository.findOne(id);
    }
}

package com.agroho.services;

import com.agroho.domain.AutismCenter;
import org.springframework.stereotype.Service;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Service
public interface AutismCenterService {

    void addAutismCenter(AutismCenter autismCenter);

    AutismCenter getAutismCenterById(Long id);
}

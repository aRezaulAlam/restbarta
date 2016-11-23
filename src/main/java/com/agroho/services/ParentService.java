package com.agroho.services;

import com.agroho.domain.Parent;
import org.springframework.stereotype.Service;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Service
public interface ParentService {

    void addParent(Parent parent);

    Parent getParentById(Long id);

}

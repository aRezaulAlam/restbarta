package com.agroho.services;

import com.agroho.domain.Child;
import com.agroho.domain.Parent;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Service
public interface ChildService {

    void submitChildResultFromApp(Child child);

    List<Child> getAllChildResult();

}

package com.agroho.repositories;

import com.agroho.domain.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}

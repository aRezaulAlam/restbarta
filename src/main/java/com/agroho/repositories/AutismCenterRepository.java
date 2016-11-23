package com.agroho.repositories;

import com.agroho.domain.AutismCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: rezaul || Date: 11/22/16.
 */
@Repository
public interface AutismCenterRepository extends JpaRepository<AutismCenter, Long> {
}

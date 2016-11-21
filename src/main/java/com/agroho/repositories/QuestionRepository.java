package com.agroho.repositories;

import com.agroho.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by USER on 21-Nov-16.
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


}

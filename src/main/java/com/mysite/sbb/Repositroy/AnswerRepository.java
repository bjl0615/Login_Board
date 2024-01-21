package com.mysite.sbb.Repositroy;

import com.mysite.sbb.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer , Integer> {
}

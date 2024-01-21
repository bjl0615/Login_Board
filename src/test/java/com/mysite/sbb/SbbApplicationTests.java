package com.mysite.sbb;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import com.mysite.sbb.Entity.Answer;
import com.mysite.sbb.Entity.Question;
import com.mysite.sbb.Repositroy.AnswerRepository;
import com.mysite.sbb.Repositroy.QuestionRepository;
import com.mysite.sbb.Service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
class SbbApplicationTests {

	@Autowired
	QuestionService questionService;

	@Test
	void testJpa() {
		for(int i = 0 ; i<=300 ; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]" , i);
			String content = "내용 무";
			this.questionService.create(subject , content , null);
		}
	}
}


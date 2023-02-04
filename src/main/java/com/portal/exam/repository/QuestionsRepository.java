package com.portal.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.exam.model.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Integer> {

}

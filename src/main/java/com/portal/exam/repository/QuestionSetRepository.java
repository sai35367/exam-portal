package com.portal.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.exam.model.QuestionSet;

public interface QuestionSetRepository extends JpaRepository<QuestionSet, Integer> {

}

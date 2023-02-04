package com.portal.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.exam.model.Topics;

public interface TopicsRepository extends JpaRepository<Topics, Integer> {

}

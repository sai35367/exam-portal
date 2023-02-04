package com.portal.exam.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.portal.exam.dto.QuestionSetRequestDto;
import com.portal.exam.dto.TopicRequestDto;
import com.portal.exam.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping("/topic")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addTopic(TopicRequestDto topicRequestDto) {
        questionService.addTopic(topicRequestDto);
    }

    @PostMapping("/question")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addQuestions(QuestionSetRequestDto dto) {
        questionService.addQuestionSet(dto);
    }
}

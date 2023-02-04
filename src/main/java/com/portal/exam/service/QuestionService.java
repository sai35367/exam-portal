package com.portal.exam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.portal.exam.dto.QuestionSetRequestDto;
import com.portal.exam.dto.TopicRequestDto;
import com.portal.exam.model.Options;
import com.portal.exam.model.QuestionSet;
import com.portal.exam.model.Questions;
import com.portal.exam.model.Topics;
import com.portal.exam.repository.TopicsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final TopicsRepository topicsRepository;

    public void addTopic(TopicRequestDto dto) {
        Topics topics = new Topics();
        topics.setTopicName(dto.topicName());

        topicsRepository.save(topics);
    }

    public void addQuestionSet(QuestionSetRequestDto dto) {
        QuestionSet questionSet = new QuestionSet();

        List<Questions> questionList = new ArrayList<>();
        dto.questions().forEach(question -> {
            Questions questions = new Questions();
            questions.setQuestion(question.question()); // Question name

            List<Options> optionList = new ArrayList<>();
            question.Options().forEach(option -> {
                Options options = new Options();
                options.setOption(option.Option()); // Option name
                optionList.add(options);
            });

            questions.setOptions(optionList);

        });

        questionSet.setQuestions(questionList);
    }
}

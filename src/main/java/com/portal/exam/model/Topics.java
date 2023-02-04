package com.portal.exam.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Topics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;
    private String topicName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<QuestionSet> questionSets;
}

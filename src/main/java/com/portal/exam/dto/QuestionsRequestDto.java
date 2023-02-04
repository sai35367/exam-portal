package com.portal.exam.dto;

import java.util.List;

public record QuestionsRequestDto(String question, List<OptionsRequestDto> Options, String answer) {

}

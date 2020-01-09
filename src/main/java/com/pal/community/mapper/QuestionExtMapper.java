package com.pal.community.mapper;

import com.pal.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incComment(Question record);
}
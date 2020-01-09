package com.pal.community.dto;

import com.pal.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tags;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer commentCount;
    private Integer likeCount;
    private Integer viewCount;
    private Long creator;
    private User user;
}

package com.pal.community.dto;

import lombok.Data;

/**
 * @Author pal
 * @Date Created in 2019/12/17 17:35
 * @Version: 1.0
 */
@Data
public class CommentCreatorDTO {
    private Long parentId;
    private String content;
    private Integer type;
}

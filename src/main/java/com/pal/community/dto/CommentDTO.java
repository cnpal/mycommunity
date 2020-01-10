package com.pal.community.dto;

import com.pal.community.model.User;
import lombok.Data;

/**
 * @Author pal
 * @Date Created in 2019/12/17 17:35
 * @Version: 1.0
 */
@Data
public class CommentDTO {
    private Long id;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Long parentId;
    private String content;
    private Integer type;
    private Integer commentCount;
    private User user;
}

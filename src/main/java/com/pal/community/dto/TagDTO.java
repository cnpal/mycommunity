package com.pal.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author pal
 * @Date Created in 2020/8/2 10:30
 * @Version: 1.0
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}

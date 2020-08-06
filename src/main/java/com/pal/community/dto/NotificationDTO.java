package com.pal.community.dto;

import lombok.Data;

/**
 * @Author pal
 * @Date Created in 2020/8/3 12:07
 * @Version: 1.0
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}

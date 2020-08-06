package com.pal.community.enums;

/**
 * @Author pal
 * @Date Created in 2020/8/3 11:19
 * @Version: 1.0
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1)
    ;
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}

package com.pal.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你找的问题不在了，要不要换一个试试！！！"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或问题不存在"),
    NOT_LOGIN(2003,"未登录，请先登录"),
    SYSTEM_ERROR(2004,"服务器燥起来了，让它冷静下再试试~~~"),
    TYPE_PARAM_WRONG(2005,"评论类型不存在或错误"),
    COMMENT_NOT_FOUND(2006,"你回复的评论不在了"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }
}

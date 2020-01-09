package com.pal.community.enums;

/**
 * @Author pal
 * @Date Created in 2019/12/24 14:45
 * @Version: 1.0
 */
public enum  CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type){
        this.type = type;
    }
}

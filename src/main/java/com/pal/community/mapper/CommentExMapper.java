package com.pal.community.mapper;

import com.pal.community.model.Comment;
import com.pal.community.model.CommentExample;
import com.pal.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExMapper {
   int incCommentCount(Comment record);
}
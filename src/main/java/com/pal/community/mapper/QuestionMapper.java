package com.pal.community.mapper;

import com.pal.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface QuestionMapper {
    @Insert("insert into question(title,description,gmt_create,gmt_modified,creator,comment_count,view_count,like_count,tags) values(#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{commentCount},#{viewCount},#{likeCount},#{tags})")
    void insert(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(Integer offset, Integer size);

    @Select("select count(1) from question")
    Integer count();
    @Select("select * from question where creator = #{userId} limit #{offset},#{size}")
    List<Question> listByUserId(Integer userId, Integer offset, Integer size);
    @Select("select count(1) from question where creator = #{userId}")
    Integer countByUserId(Integer userId);
    @Select("select * from question where id = #{id}")
    Question getById(Integer id);

    @Update("update question set title = #{title},gmt_modified = #{gmtModified} , description = #{description}, tags = #{tags} where id = #{id} ")
    void update(Question question);
}


package com.pal.community.controller;

import com.pal.community.dto.CommentCreatorDTO;
import com.pal.community.dto.CommentDTO;
import com.pal.community.dto.ResultDTO;
import com.pal.community.enums.CommentTypeEnum;
import com.pal.community.exception.CustomizeErrorCode;
import com.pal.community.model.Comment;
import com.pal.community.model.User;
import com.pal.community.service.CommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author pal
 * @Date Created in 2019/12/17 17:21
 * @Version: 1.0
 */
@Controller
public class CommentController {


    @Autowired
    private CommentService commentService;
    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommentCreatorDTO commentCreatorDTO,
                       HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if (user == null){
            return ResultDTO.errorOf(CustomizeErrorCode.NOT_LOGIN);
        }
        if (commentCreatorDTO == null || StringUtils.isBlank(commentCreatorDTO.getContent())){
            return ResultDTO.errorOf(CustomizeErrorCode.CONTENT_IS_EMPTY);
        }
        Comment comment = new Comment();
        comment.setParentId(commentCreatorDTO.getParentId());
        comment.setContent(commentCreatorDTO.getContent());
        comment.setType(commentCreatorDTO.getType());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(comment.getGmtCreate());
        comment.setCommentator(user.getId());
        comment.setLikeCount(0l);
        comment.setCommentCount(0);
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
    @ResponseBody
    @RequestMapping(value = "/comment/{id}",method = RequestMethod.GET)
    public ResultDTO<List> comments(@PathVariable(name = "id") Long id){

        List<CommentDTO> commentDTOS = commentService.listByTargetId(id, CommentTypeEnum.COMMENT);
        return ResultDTO.okOf(commentDTOS);
    }
}

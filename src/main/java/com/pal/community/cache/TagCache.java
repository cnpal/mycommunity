package com.pal.community.cache;

import com.pal.community.dto.TagDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author pal
 * @Date Created in 2020/8/2 10:29
 * @Version: 1.0
 */
public class TagCache {
public static List<TagDTO> get(){
    ArrayList<TagDTO> tagDTOS = new ArrayList<>();
    TagDTO programe = new TagDTO();
    programe.setCategoryName("开发语言");
    programe.setTags(Arrays.asList("js","php","css","html","java","node","python","c++","c","golang","objective-c","typescript","shell","swift","c#","sass","ruby","bash","less","asp.net","lua","scala","coffeescript","actionscript","rust","erlang","pert"));
    tagDTOS.add(programe);
    TagDTO framework = new TagDTO();
    framework.setCategoryName("平台框架");
    framework.setTags(Arrays.asList("laravel","spring","express","django","flask","yil","ruby-on-rails","torado","koa","struts"));
    tagDTOS.add(framework);
    return tagDTOS;
}
public static String filterInvalid(String tags){
    String[] split = StringUtils.split(tags, ",");
    List<TagDTO> tagDTOS = get();
    List<String> tagList = tagDTOS.stream().flatMap(tag -> tag.getTags().stream()).collect(Collectors.toList());
    String invalid = Arrays.stream(split).filter(t -> !tagList.contains(t)).collect(Collectors.joining(","));
    System.out.println(invalid);
    return invalid;
}
}

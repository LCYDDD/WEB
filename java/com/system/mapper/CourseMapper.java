package com.system.mapper;

import com.system.po.Course;
import com.system.po.CourseCustom;
import com.system.po.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//操作Course表的映射器
public interface CourseMapper {
    int countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer courseid);

    List<Course> selectByPlace(String classRoom);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    

}
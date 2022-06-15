package com.system.mapper;

import com.system.po.PagingVO;
import com.system.po.StudentCustom;

import java.util.List;

//拓展了一些功能 比如按页来查询学生信息	还有把学生和所选课程联系起来的信息
public interface StudentMapperCustom {

    //分页查询学生信息
    List<StudentCustom> findByPaging(PagingVO pagingVO) throws Exception;

    //查询学生信息，和其选课信息
    StudentCustom findStudentAndSelectCourseListById(Integer id) throws Exception;

}

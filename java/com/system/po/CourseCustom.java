package com.system.po;

/**
 * Course扩展类    课程
 * 新增了系名的属性 分成扩展类其实没必要 改的不是很好
 */
public class CourseCustom extends Course {

    //所属院系名
    private String collegeName;

    public void setcollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getcollegeName() {
        return collegeName;
    }

}

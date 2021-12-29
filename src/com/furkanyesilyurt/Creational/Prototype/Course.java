package com.furkanyesilyurt.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Course implements Cloneable{

    private List<String> courseList;

    public Course(){
        courseList = new ArrayList<String>();
    }

    public Course(List<String> courseList) {
        this.courseList = courseList;
    }

    public void addCourse(){
        courseList.add("Math");
        courseList.add("Geo");
        courseList.add("physics");
    }

    public List<String> getCourseList(){
        return courseList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        List<String> courseList = new ArrayList<String>();
        for (String s : this.getCourseList()) {
            courseList.add(s);
        }

        return new Course(courseList);
    }
}

package com.furkanyesilyurt.Prototype;

import java.util.List;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException{
        Course courses = new Course();
        courses.addCourse();

        Course course1 = (Course) courses.clone();
        Course course2 = (Course) courses.clone();

        List<String> list1 = course1.getCourseList();
        list1.add("Bio");

        List<String> list2 = course2.getCourseList();
        list2.remove("Math");

        System.out.println(courses.getCourseList());
        System.out.println(course1.getCourseList());
        System.out.println(course2.getCourseList());

    }

}

package com.restapi.practice1.services;

import com.restapi.practice1.models.Course;

import java.util.List;

public interface CourseService {
    //read Courses
    public List<Course> getCourses();

    //read single course
    public Course getCourse(long courseId);

    //add course
    public Course addCourse(Course course);

    //update course
    public Course updateCourse(Course course);

    //delete course
    public void deleteCourse(long parseLong);
}

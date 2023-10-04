package com.restapi.practice1.services;

import com.restapi.practice1.dao.CourseDao;
import com.restapi.practice1.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

//    List<Course> list;

    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145, "Java Core Course", "This is the basic java course"));
//        list.add(new Course(4343, "SpringBoot Course", "This is the SpringBoot course"));
//        list.add(new Course(101, "React", "This is the React course"));
    }

    //get all courses from DataBase
    @Override
    public List<Course> getCourses() {
//        return list;
        return courseDao.findAll();
    }

    //get single course from DataBase
    @Override
    public Course getCourse(long courseId) {
//        Course course = null;
//
//        for(Course c : list){
//            if(c.getId() == courseId){
//                course = c;
//                break;
//            }
//        }
//        return course;

//        return courseDao.getOne(courseId);
        return courseDao.findById(courseId)
                .orElse(null);
    }

    //save course to DataBase
    @Override
    public Course addCourse(Course course) {
//        list.add(course);
//        return course;
        courseDao.save(course);
        return course;
    }

    //Update Course to Database
    @Override
    public Course updateCourse(Course course) {
//        list.forEach(e ->{
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
//        return course;

        courseDao.save(course);
        return course;
    }

    //Delete course
    @Override
    public void deleteCourse(long parseLong) {
//        list = this.list
//                .stream()
//                .filter(e->e.getId()!=parseLong)
//                .collect(Collectors.toList());


        Course entity = courseDao.getOne(parseLong);
        courseDao.delete(entity);
    }
}

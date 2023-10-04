package com.restapi.practice1.dao;

import com.restapi.practice1.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {


}

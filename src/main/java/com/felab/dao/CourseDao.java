package com.felab.dao;

import com.felab.entity.Course;
import org.springframework.stereotype.Repository;

/**
 * Created by azheng on 10/21/2015.
 */
@Repository
public class CourseDao {

    public Course findCourseById(int id) {
        Course course = new Course();
        course.setId(id);
        course.setName("course1");
        return course;
    }
}

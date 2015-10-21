package com.felab.service;

import com.felab.dao.CourseDao;
import com.felab.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by azheng on 10/21/2015.
 */
@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public Course findCourseById(int id) {
        return courseDao.findCourseById(id);
    }
}

package com.felab.controller;

import com.felab.entity.Course;
import com.felab.service.CourseService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by azheng on 10/21/2015.
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    private static Logger log = LoggerFactory.getLogger(CourseController.class);

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String viewCourse(@RequestParam("id") int id, Model model) {
        log.debug("In viewCourse, courseId={}", id);
        Course course = courseService.findCourseById(id);
        model.addAttribute(course);
        return "course_overview";
    }

    @RequestMapping(value = "/view2/{courseId}")
    public String view2Course(@PathVariable("courseId") int id, Map<String, Object> model) {
        log.debug("In viewCourse, courseId={}", id);
        Course course = courseService.findCourseById(id);
        model.put("course", course);
        return  "course_overview";
    }

    @RequestMapping("/upload")
    public String viewUploadPage() {
        return "upload";
    }

    @RequestMapping(value = "/upload/doUpload", method = RequestMethod.POST)
    public String doUpload(@RequestParam MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            log.debug("File name is {}", file.getOriginalFilename());
            FileUtils.copyInputStreamToFile(file.getInputStream(), new File("D:\\" + System.currentTimeMillis() + file.getOriginalFilename()));
        }

        return "success";
    }


}

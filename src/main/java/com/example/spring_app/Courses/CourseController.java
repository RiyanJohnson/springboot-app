package com.example.spring_app.Courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_app.CourseApi.Topic;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public String addCourse(@RequestBody Course course, @PathVariable String topicId){
        try{
            course.setTopic(new Topic(topicId,"","")); //creating an instance of topic
            courseService.addCourse(course);
            return "Added successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public String updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicId){
        try{
            course.setTopic(new Topic(topicId,"",""));
            courseService.updateCourse(course);
            return "Updated successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public String deleteCourse(@PathVariable String id){
        try{
            courseService.deleteCourse(id);
            return "Deleted successfully";
        }
        catch(Exception e){
            return e.toString();
        }
    }
}

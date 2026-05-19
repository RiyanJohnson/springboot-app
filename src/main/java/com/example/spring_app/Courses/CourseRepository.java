package com.example.spring_app.Courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
    
    public List<Course> findByName(String name); //it automatically figures out that you want to find name (again crazy, ik)
    public List<Course> findByDescription(String description);
    public List<Course> findByTopicId(String topicId);
    
}

package com.example.spring_app.CourseApi;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    /*private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring","spring framework","description"),
            new Topic("wassup","gang","wassup description"),
            new Topic("hello","world","hello description")
        ));*/

    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
            .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id){
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        Topic topic = topicRepository.findById(id).get();
        return topic;
    }

    public void addTopic(Topic topic){
        // topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic){
        /* for(int i=0; i<topics.size(); i++){
            Topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i, topic);
                return;
            }
        } */
        topicRepository.save(topic); //use the save topic for update itself (can both update and save)
    }

    public void deleteTopic(String id){
        // topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}

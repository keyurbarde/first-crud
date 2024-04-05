package io.practice.courseapi.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    // private List<Topic> topics = new ArrayList<>(Arrays.asList(
    //         new Topic("1", "Spring", "Spring description"),
    //         new Topic("2", "Java", "Java description"),
    //         new Topic("3", "React", "React description")
    //     ));

    public List<Topic> getAllTopics(){
        // return topics;
        List<Topic> topics = new ArrayList<>();
        for(Topic t : topicRepository.findAll()){
            topics.add(t);
        }
        return topics;
    }

    public Topic getTopic(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        // for(int i = 0; i < topics.size(); i++){
        //     Topic t = topics.get(i);

        //     if(t.getId().equals(id)){
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        // for(Topic t : topics){
        //     if(t.getId().equals(id)){
        //         topics.remove(t);
        //         return;
        //     }
        // }
        topicRepository.deleteById(id);
    }
}

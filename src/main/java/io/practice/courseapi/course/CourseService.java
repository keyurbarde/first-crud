package io.practice.courseapi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String id){
        // return topics;
        return courseRepository.findCoursesByTopicId(id);

    }

    public Course getCourse(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        // for(int i = 0; i < topics.size(); i++){
        //     Topic t = topics.get(i);

        //     if(t.getId().equals(id)){
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        // for(Topic t : topics){
        //     if(t.getId().equals(id)){
        //         topics.remove(t);
        //         return;
        //     }
        // }
        courseRepository.deleteById(id);
    }
}

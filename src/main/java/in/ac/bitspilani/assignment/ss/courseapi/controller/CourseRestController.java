package in.ac.bitspilani.assignment.ss.courseapi.controller;

import in.ac.bitspilani.assignment.ss.courseapi.CourseapiApplication;
import in.ac.bitspilani.assignment.ss.courseapi.model.Course;
import in.ac.bitspilani.assignment.ss.courseapi.model.Subject;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseRestController {

    private final RabbitTemplate rabbitTemplate;

    public CourseRestController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/course/{courseId}")
    public String getCourseDetails(@PathVariable(value="courseId") String id){
        rabbitTemplate.convertAndSend(CourseapiApplication.topicExchangeName, "course.details.request",  id);
        return  "Message Posted Successfully";
    }
}

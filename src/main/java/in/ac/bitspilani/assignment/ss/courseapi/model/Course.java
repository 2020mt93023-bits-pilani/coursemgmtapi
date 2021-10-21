package in.ac.bitspilani.assignment.ss.courseapi.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Course {
    private String Id;
    private String name;
    List<Subject> subjects;

    public Course() {
    }
    public Course(String id, String name) {
        Id = id;
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

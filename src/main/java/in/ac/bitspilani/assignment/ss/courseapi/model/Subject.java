package in.ac.bitspilani.assignment.ss.courseapi.model;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    private String Id;
    private String name;
    private boolean core;
    private boolean scheduled;
    private int semesterOffered;
    private int units;

    public Subject() {
    }

    public Subject(String id, String name, int units) {
        Id = id;
        this.name = name;
        this.units = units;
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

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
}

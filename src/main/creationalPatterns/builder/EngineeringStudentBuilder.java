package main.creationalPatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Data Structures & Algorithms");
        subs.add("Computer Networks");
        subs.add("Operating System");

        this.subjects = subs;
        return this;
    }
}

package main.creationalPatterns.builder;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    private Student createEngStudent() {
        return studentBuilder.setId(1).setName("Rahul").setAge(24).setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setId(4).setName("Priya").setAge(23).setSubjects().build();
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder)
            return createEngStudent();
        else if (studentBuilder instanceof MBAStudentBuilder)
            return createMBAStudent();
        return null;
    }
}

package module19.exercicio2.domain;

import java.util.List;

public class Course {
    private String course;
    private int students;

    public Course(String course, int students) {
        this.course = course;
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return students == course.students;
    }

    @Override
    public int hashCode() {
        return students;
    }
}

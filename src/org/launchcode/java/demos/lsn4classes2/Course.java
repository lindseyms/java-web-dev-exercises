package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    @Override
    public boolean equals(Object o) {
        //performs the reference check on the object o
        if (this == o) return true;
        //performs the null check and class check on o
        if (o == null || getClass() != o.getClass()) return false;
        //casts o as a Course object
        Course course = (Course) o;

        if (!topic.equals(course.topic)) return false;
        //compares the topic and instructor fields of the two objects
        return topic.equals(course.topic) && instructor.equals(course.instructor);
    }

    @Override
    public int hashCode() {
        int result = topic.hashCode();
        result = 31 * result + instructor.hashCode();
        return result;
    }

}

package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private Teacher teacher;
    private int roomNumber;
    private ArrayList<Student> roster;

    public Course(Teacher teacher, int roomNumber, ArrayList<Student> roster) {
        this.teacher = teacher;
        this.roomNumber = roomNumber;
        this.roster = roster;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoster() {
        String students ="";
        for(Student student : roster){
            students += " " +student;
        }
        return students;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }
}

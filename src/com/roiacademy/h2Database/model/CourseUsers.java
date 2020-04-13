package com.roiacademy.h2Database.model;

import java.sql.ResultSet;

public class CourseUsers implements BaseModel<CourseUsers> {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    //private UserType userType;

    public CourseUsers(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName =lastName;
        this.age = age;
    }

    public CourseUsers () {

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CourseUsers{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", age=" + age +
                '}';
    }

    @Override
    public CourseUsers mapToObject(ResultSet rs) {

        return null;
    }
}

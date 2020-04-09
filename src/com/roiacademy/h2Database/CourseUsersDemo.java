package com.roiacademy.h2Database;

import com.roiacademy.h2Database.model.CourseUsers;
import com.roiacademy.h2Database.service.CourseUsersService;

public class CourseUsersDemo {
    public static void main(String[] args) {
        CourseUsers courseUsers = new CourseUsers();
        courseUsers.setFirstName("Albnor");
        courseUsers.setLastName("Leku");
        courseUsers.setAge(24);

        try {
            CourseUsersService courseUsersService = new CourseUsersService();
            courseUsersService.createUserService(courseUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

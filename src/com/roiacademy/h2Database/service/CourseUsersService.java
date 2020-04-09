package com.roiacademy.h2Database.service;

import com.roiacademy.h2Database.model.CourseUsers;
import com.roiacademy.h2Database.repository.CourseUsersRepo;

public class CourseUsersService {
    private CourseUsersRepo courseUsersRepo;

    public CourseUsersService() {
        courseUsersRepo = new CourseUsersRepo();
    }

    public void createUserService(CourseUsers courseUsers) throws Exception{
        if ( courseUsers == null) {
            throw new Exception("User is null!");
        }
        courseUsersRepo.createCourseUser(courseUsers);
    }
}

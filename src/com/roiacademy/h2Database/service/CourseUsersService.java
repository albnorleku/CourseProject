package com.roiacademy.h2Database.service;

import com.roiacademy.h2Database.model.CourseUsers;
import com.roiacademy.h2Database.repository.CourseUsersRepo;

import java.util.List;
import java.util.Optional;

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

    public Optional<CourseUsers> getCourseUserByName(String name) throws Exception { //""
        if (name == null || name.isEmpty()) {
            throw new Exception("Name can not be null");
        }
        return courseUsersRepo.readCourseUserByName(name);
    }

    public Optional<CourseUsers> getCourseUserById(int id) throws Exception { //""
        return courseUsersRepo.readCourseUserById(id);
    }

    public List<CourseUsers> getAllUsersUnder25(int age) throws Exception {
        return courseUsersRepo.readUsersYoungerThen(age);
    }

    public Optional<CourseUsers> updateCourseUser(CourseUsers courseUsers) throws Exception {
        if ( courseUsers == null) {
            throw new Exception("User is null!");
        }
        return courseUsersRepo.updateCourseUser(courseUsers);
    }

    public void deleteCourseUser(int id) throws Exception {
        courseUsersRepo.deleteCourseUserById(id);
    }
}

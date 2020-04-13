package com.roiacademy.h2Database;

import com.roiacademy.h2Database.model.CourseUsers;
import com.roiacademy.h2Database.service.CourseUsersService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CourseUsersDemo {
    public static void main(String[] args) {
        /*CourseUsers courseUsers = new CourseUsers();
        courseUsers.setFirstName("Albnor");
        courseUsers.setLastName("Leku");
        courseUsers.setAge(24);*/

        try {
            CourseUsersService courseUsersService = new CourseUsersService();
            //courseUsersService.createUserService(courseUsers);
            Optional<CourseUsers> userFromDB = courseUsersService.getCourseUserByName("Filaninho");
            userFromDB.ifPresentOrElse(u -> System.out.println(u.toString()), () -> System.out.println("No User Found!"));

            //Read course users under 25
            List<CourseUsers> users = courseUsersService.getAllUsersUnder25(25);
            System.out.println("Users under 25 below:");
            users.forEach(user ->
                System.out.println(user.toString())
            );

            String names = users.stream().map(user -> user.getFirstName()).collect(Collectors.joining(", "));
            System.out.println(names);

            Optional<CourseUsers> courseUsers = users.stream().findFirst();
            courseUsers.ifPresent(user -> System.out.println(user));

            //update user
            if (userFromDB.isPresent()) {
                CourseUsers userToUpdate = userFromDB.get();
                userToUpdate.setFirstName("Filaninho");
                Optional<CourseUsers> updatedUser = courseUsersService.updateCourseUser(userToUpdate);
                updatedUser.ifPresent(u -> System.out.println("Updated user:" + u));
            }

            //delete user
            courseUsersService.deleteCourseUser(2);
            Optional<CourseUsers> deletedUser = courseUsersService.getCourseUserById(2);
            deletedUser.ifPresentOrElse(u -> System.out.println(u), () -> System.out.println("User is deleted"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

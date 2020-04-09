package com.roiacademy.h2Database.repository;

import com.roiacademy.h2Database.DatabaseConnection;
import com.roiacademy.h2Database.model.CourseUsers;

import java.sql.SQLException;
import java.sql.Statement;

public class CourseUsersRepo {
    private DatabaseConnection databaseConnection;

    public CourseUsersRepo() {
        this.databaseConnection = DatabaseConnection.init();
    }

    public void createCourseUser(CourseUsers courseUsers) throws SQLException {
        Statement statement = databaseConnection.getDBConnection().createStatement();

        StringBuilder stringBuilder = new StringBuilder("INSERT INTO course_users (first_name, last_name, age) VALUES ");
        stringBuilder.append("('").append(courseUsers.getFirstName()).append("'")
                .append(", '").append(courseUsers.getLastName()).append("'")
                .append(", '").append(courseUsers.getAge()).append("')");

        statement.execute(stringBuilder.toString());
        statement.close();
    }
}

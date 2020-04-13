package com.roiacademy.h2Database.repository;

import com.roiacademy.h2Database.DatabaseConnection;
import com.roiacademy.h2Database.model.CourseUsers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class CourseUsersRepo extends BaseRepoImpl<Integer>{
    private static Logger logger = Logger.getLogger(CourseUsersRepo.class.getName());
    private DatabaseConnection databaseConnection;

    public CourseUsersRepo() {
        this.databaseConnection = DatabaseConnection.init();
    }

    public Optional<CourseUsers> createCourseUser(CourseUsers courseUsers) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder("INSERT INTO course_users (first_name, last_name, age) VALUES ")
                .append("('").append(courseUsers.getFirstName()).append("'")
                .append(", '").append(courseUsers.getLastName()).append("'")
                .append(", '").append(courseUsers.getAge()).append("')");
        this.create(stringBuilder.toString());
        Optional<CourseUsers> userCreated = readCourseUserByName(courseUsers.getFirstName());
        return userCreated;
    }

    /**
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public Optional<CourseUsers> readCourseUserByName(String name) throws SQLException {
        logger.info("Reading user " + name);
        String query = "SELECT * FROM course_users WHERE first_name = '" + name + "'";
        ResultSet rs = this.read(query);
        CourseUsers courseUsers;
        if (rs.next()) {
            courseUsers = new CourseUsers(rs.getInt("Id"),
                    rs.getString("FIRST_NAME"),
                    rs.getString("LAST_NAME"),
                    rs.getInt("AGE"));
            return Optional.of(courseUsers);
        }
        return Optional.empty();
    }

    public Optional<CourseUsers> readCourseUserById(int id) throws SQLException {
        logger.info("Reading user " + id);
        String query = "SELECT * FROM course_users WHERE id =" + id;
        ResultSet rs = this.read(query);
        CourseUsers courseUsers;
        if (rs.next()) {
            courseUsers = new CourseUsers(rs.getInt("Id"),
                    rs.getString("FIRST_NAME"),
                    rs.getString("LAST_NAME"),
                    rs.getInt("AGE"));
            return Optional.of(courseUsers);
        }
        return Optional.empty();
    }

    public List<CourseUsers> readUsersYoungerThen(int age) throws SQLException {
        String query = "SELECT * FROM course_users WHERE age < "+ age;
        List<CourseUsers> listOfCourseUsers = new ArrayList<>();
        for (ResultSet rs = this.read(query); rs.next();) {
            CourseUsers courseUsers = new CourseUsers(rs.getInt("Id"),
                    rs.getString("FIRST_NAME"),
                    rs.getString("LAST_NAME"),
                    rs.getInt("AGE"));
            listOfCourseUsers.add(courseUsers);
        }
        return listOfCourseUsers;
    }

    public Optional<CourseUsers> updateCourseUser(CourseUsers courseUsers) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder("UPDATE course_users SET ")
                .append(" first_name='").append(courseUsers.getFirstName()).append("'")
                .append(", last_name='").append(courseUsers.getLastName()).append("'")
                .append(", age=").append(courseUsers.getAge())
                .append(" WHERE id = ").append(courseUsers.getId());

        this.update(stringBuilder.toString(), courseUsers.getId());
        Optional<CourseUsers> updatedCourseUser = readCourseUserById(courseUsers.getId());
        return updatedCourseUser;
    }

    public void deleteCourseUserById(int id) throws SQLException {
        String query = "DELETE FROM course_users WHERE id = " + id;
        this.delete(query);
    }
}

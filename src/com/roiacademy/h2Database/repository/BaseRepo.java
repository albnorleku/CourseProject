package com.roiacademy.h2Database.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface BaseRepo<D> {
    ResultSet read(String query) throws SQLException;

    void create(String query) throws SQLException;

    void update(String query, int id)throws SQLException;

    void delete(String query)throws SQLException;
}

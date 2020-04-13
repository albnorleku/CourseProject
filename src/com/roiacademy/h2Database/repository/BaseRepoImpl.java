package com.roiacademy.h2Database.repository;

import com.roiacademy.h2Database.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseRepoImpl<D> implements BaseRepo<D> {
    private DatabaseConnection databaseConnection;

    public BaseRepoImpl() {
        this.databaseConnection = DatabaseConnection.init();
    }

    @Override
    public ResultSet read(String query) throws SQLException {
        Statement statement = databaseConnection.getDBConnection().createStatement();
        ResultSet rs = statement.executeQuery(query);
        return rs;
    }

    @Override
    public void create(String query) throws SQLException {
        this.executeStatment(query);
    }

    @Override
    public void update(String query, int id) throws SQLException {
        this.executeStatment(query);
    }

    @Override
    public void delete(String query) throws SQLException{
        this.executeStatment(query);
    }

    private void executeStatment(String query) throws SQLException{
        Statement statement = databaseConnection.getDBConnection().createStatement();
        statement.execute(query);
        statement.close();
    }
}

package com.trucklagbe.managers;

import org.javalite.activejdbc.Base;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    public DatabaseManager() {
        if (!Base.hasConnection()) {
            Base.open("com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3307/trucklagbe_qa",
                    "root", "password");
        }
    }

    public void openDatabase() {
        if (!Base.hasConnection()) {
            Base.open("com.mysql.jdbc.Driver",
                    "jdbc:mysql://localhost:3307/trucklagbe_qa",
                    "root", "password");
        }
    }

    public Connection getConnection() {
        return Base.connection();
    }

    public Statement getStatement() {
        try {
            Connection connection = Base.connection();
            return connection.createStatement();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public void closeDatabase() {
        Base.close();
    }
}

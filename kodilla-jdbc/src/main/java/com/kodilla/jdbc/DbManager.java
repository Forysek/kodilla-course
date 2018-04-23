package com.kodilla.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection connKodillaCourse;
    private Connection connStoredProcedures;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "kodilla_user");
        connectionProps.put("password", "kodilla_password");
        connKodillaCourse = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kodilla_course?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
        connStoredProcedures = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/stored_procedures?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);

    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnectionKodillaCourse() {
        return connKodillaCourse;
    }

    public Connection getConnectionStoredProcedures() {
        return connStoredProcedures;
    }
}
package org.example;

import java.sql.*;

public class Database {
    private static Database INSTANCE;
    private Connection connection;

    private Database() {
        connect();
    }

    public static synchronized Database getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Database();
        }
        return INSTANCE;
    }

    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connect();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    private void connect() {
        try {
            String connURL = "jdbc:h2:./database/tests1;AUTO_SERVER=TRUE";
            connection = DriverManager.getConnection(connURL, "sa", "");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

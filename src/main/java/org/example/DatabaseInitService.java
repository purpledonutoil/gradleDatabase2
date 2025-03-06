package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseInitService{

    public static void main(String[] args) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String initDB = Files.readString(Path.of("app/sql/init_db.sql"), StandardCharsets.UTF_8);

            try {
                PreparedStatement prst = conn.prepareStatement(initDB);
                prst.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}


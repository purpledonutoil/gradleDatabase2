package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class DatabasePopulateService {

    public static void main(String[] args) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String populateDB = Files.readString(Path.of("app/sql/populate_db.sql"), StandardCharsets.UTF_8);

            try {
                PreparedStatement prst = conn.prepareStatement(populateDB);
                prst.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            e.getMessage();
        }
    }
}


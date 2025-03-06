package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    Connection conn = Database.getInstance().getConnection();

    public List<MaxProjectCountClient> findMaxProjectsClient(){
        List<MaxProjectCountClient> listOfMaxProjectCountClient = new ArrayList<>();
        try {
            String request = Files.readString(Path.of("app/sql/find_max_projects_client.sql"), StandardCharsets.UTF_8);
            try {
                PreparedStatement prst = conn.prepareStatement(request);
                ResultSet rs = prst.executeQuery();
                while(rs.next()) {
                    MaxProjectCountClient maxProjectCountClient = new MaxProjectCountClient();
                    maxProjectCountClient.setName(rs.getString("name"));
                    maxProjectCountClient.setProjectCount(rs.getInt("projectCount"));
                    listOfMaxProjectCountClient.add(maxProjectCountClient);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return listOfMaxProjectCountClient;
    }


    public List<LongestProject> findLongestProject(){
        List<LongestProject> listOfLongestProject = new ArrayList<>();
        try {
            String request = Files.readString(Path.of("app/sql/find_longest_project.sql"), StandardCharsets.UTF_8);
            try {
                PreparedStatement prst = conn.prepareStatement(request);
                ResultSet rs = prst.executeQuery();
                while(rs.next()) {
                    LongestProject longestProject = new LongestProject();
                    longestProject.setId(rs.getLong("id"));
                    longestProject.setMonthCount(rs.getInt("month_count"));
                    listOfLongestProject.add(longestProject);

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }
        return listOfLongestProject;
    }


    public List<FindMaxSalaryWorker> findMaxSalaryWorker(){
        List<FindMaxSalaryWorker> listOfFindMaxSalaryWorker = new ArrayList<>();
        try {
            String request = Files.readString(Path.of("app/sql/find_max_salary_worker.sql"), StandardCharsets.UTF_8);
            try {
                PreparedStatement prst = conn.prepareStatement(request);
                ResultSet rs = prst.executeQuery();
                while(rs.next()) {
                    FindMaxSalaryWorker findMaxSalaryWorker = new FindMaxSalaryWorker();
                    findMaxSalaryWorker.setName(rs.getString("name"));
                    findMaxSalaryWorker.setSalary(rs.getInt("salary"));
                    listOfFindMaxSalaryWorker.add(findMaxSalaryWorker);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return listOfFindMaxSalaryWorker;
    }


    public List<FindYoungestEldestWorkers> findYoungestEldestWorkers(){
        List<FindYoungestEldestWorkers> listOfFindYoungestEldestWorkers = new ArrayList<>();
        try {
            String request = Files.readString(Path.of("app/sql/find_youngest_eldest_workers.sql"), StandardCharsets.UTF_8);
            try {
                PreparedStatement prst = conn.prepareStatement(request);
                ResultSet rs = prst.executeQuery();
                while(rs.next()) {
                    FindYoungestEldestWorkers findYoungestEldestWorkers = new FindYoungestEldestWorkers();
                    findYoungestEldestWorkers.setType(rs.getString("type"));
                    findYoungestEldestWorkers.setName(rs.getString("name"));
                    findYoungestEldestWorkers.setBirthday(LocalDate.parse(rs.getString("birthday")));
                    listOfFindYoungestEldestWorkers.add(findYoungestEldestWorkers);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return listOfFindYoungestEldestWorkers;
    }


    public List<PrintProjectPrices> printProjectPrices(){
        List<PrintProjectPrices> listOfPrintProjectPrices = new ArrayList<>();
        try {
            String request = Files.readString(Path.of("app/sql/print_project_prices.sql"), StandardCharsets.UTF_8);
            try {
                PreparedStatement prst = conn.prepareStatement(request);
                ResultSet rs = prst.executeQuery();
                while(rs.next()) {
                    PrintProjectPrices printProjectPrices = new PrintProjectPrices();
                    printProjectPrices.setProjectId(rs.getLong("project_id"));
                    printProjectPrices.setPrice(rs.getInt("price"));
                    listOfPrintProjectPrices.add(printProjectPrices);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return listOfPrintProjectPrices;
    }


    public static void main(String[] args) {
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        System.out.println(databaseQueryService.findMaxProjectsClient());
        System.out.println(databaseQueryService.findLongestProject());
        System.out.println(databaseQueryService.findMaxSalaryWorker());
        System.out.println(databaseQueryService.findYoungestEldestWorkers());
        System.out.println(databaseQueryService.printProjectPrices());
    }
}


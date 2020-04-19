package com.zenca.iserver.config.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Repository {

    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://127.0.0.1:3306/zenca_repo";
    private static final String USER = "admin";
    private static final String PW = "admin";

    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PW);
            Statement statement = conn.createStatement();

            String query = "INSERT INTO TEST VALUES ('A001', 'A002')";
            statement.executeUpdate(query);

            System.out.println("DATABASE CONNECT");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            conn.close();

            System.out.println("DATABASE DISCONNECT");
        }
    }

}


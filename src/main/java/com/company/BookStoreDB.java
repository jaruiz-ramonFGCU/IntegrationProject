package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// just to check if these are found

public class BookStoreDB {

    private String author_name;
    private String author_url;
    private String author_email;

    final String JDBC_DRIVER = "org.sqlite.JDBC";
    final String DB_URL = "jdbc:sqlite:src/Data/BookStore.db";

    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:src4/data/(BookStoreDB)";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }






}

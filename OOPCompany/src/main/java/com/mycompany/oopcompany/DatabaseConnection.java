/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopcompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author WONG-PC
 */
public class DatabaseConnection {
    Connection conn;
    Statement statement;

    public void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Load driver error");
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop2567", "root", "12345678");
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println("connect database error");
        }
    }
}

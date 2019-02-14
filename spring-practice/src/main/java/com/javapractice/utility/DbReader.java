package com.javapractice.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DbReader {

    private Connection conn;

    private HashMap<String, Integer> data = new HashMap<String,Integer>();

    private DbReader() {
        //try {
            //init();
        //} catch (SQLException e) {
        //    System.out.println(e);
        //}
        System.out.println("DbReader initialized");
    }

    private static class DbHolder {
        private static final DbReader INSTANCE = new DbReader();
    }

    public static DbReader getInstance()
    {
        return DbReader.DbHolder.INSTANCE;
    }

    public void init() throws SQLException {
        this.connection();
        this.initialize();
        this.load();
        }

    public void connection() throws SQLException {
        // -------------------------------------------
        // URL format is
        // jdbc:derby:<local directory to save data>
        // -------------------------------------------
        String dbUrl = "jdbc:derby:demoDB;create=true";
        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        conn = DriverManager.getConnection(dbUrl);
    }

    public void initialize() throws SQLException {
        Statement stmt = conn.createStatement();

        // drop table
        stmt.executeUpdate("Drop Table rentalfees");

        // create table
        stmt.executeUpdate("Create table rentalfees (name varchar(30) primary key, value int)");

        // insert 2 rows
        stmt.executeUpdate("insert into rentalfees values ('bike.hour'  , 5)");
        stmt.executeUpdate("insert into rentalfees values ('bike.day'   , 20)");
        stmt.executeUpdate("insert into rentalfees values ('bike.week'  ,60)");
        stmt.executeUpdate("insert into rentalfees values ('car.hour'   ,20)");
        stmt.executeUpdate("insert into rentalfees values ('car.day'    ,80)");
        stmt.executeUpdate("insert into rentalfees values ('car.week'   ,300)");

        // query
        ResultSet rs = stmt.executeQuery("SELECT * FROM rentalfees");

        // print out query result
        while (rs.next()) {
            System.out.printf("%s\t%d\n", rs.getString("name"), rs.getInt("value"));
        }
    }

    public void load() throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM rentalfees");
        String name;
        Integer value;
        while (rs.next()) {
            name = rs.getString("name");
            value = rs.getInt("value");
            data.put(name,value);
        }
    }

    public void createTable() throws SQLException {
        Statement stmt = conn.createStatement();
        // create table
        stmt.executeUpdate("Create table rentalfees (name varchar(30) primary key, value int)");
    }

    public Integer getProperty(String name) {
        return data.get(name);
    }
}

package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbFunctions
{
    public Connection connect_to_db(String dbname, String user, String pass){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+dbname, user, pass);
            if(conn!=null){
                System.out.println("Conectado com sucesso");
            }else {
                System.out.println("Conexão falhou");
            }
        }catch (Exception e ){
            System.out.println(e);
        }
        return  conn;
    }
    public void createTable(Connection conn, String table_name){
        Statement statement;
        try {
            String query="create table " + table_name + "(empid SERIAL, name VARCHAR(200), address VARCHAR (200), PRIMARY KEY(empid) );";
            statement=conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void insert_row(Connection conn,String table_name ,String name, String addres){
        Statement statement;
        try {
            String query= String.format("insert into %s(name, address) values ('%s', '%s');", table_name, name, addres);
            statement= conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("row insert");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

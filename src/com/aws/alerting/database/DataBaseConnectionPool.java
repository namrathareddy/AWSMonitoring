package com.aws.alerting.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DataBaseConnectionPool {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/aws";

	//  Database credentials
	static final String USER = "root";
	static final String PASS = "root";

	private static LinkedList<Connection> dbConnection = new LinkedList<Connection>();

	public static List<Connection> getDbConnection() {
		return dbConnection;
	}

	public static void setDbConnection(List<Connection> dbConnectionList) {
		dbConnectionList = dbConnection;
	}

	
	/**
	 * this method returns connection from the 
	 * connection pool list and removes it
	 * @return
	 */
	public static Connection getConnection()
	{
		if(getDbConnection()==null || getDbConnection().size()==0)
		{
			initConnectionPool();
			return dbConnection.remove();
		}
		else
		{
			return dbConnection.remove();
		}
	}
	

	/**
	 * this method creates a connection pool 
	 * of 10 connections 
	 */
	private static void initConnectionPool()
	{
		Connection conn = null;
		for(int i = 1 ; i <=10; i++)
		{
			try
			{

				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				dbConnection.add(conn);
			}
			catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("completed creating connection pool");
	}
	
	


}

package org.tnsif.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//this layer contains the necessary database information
public class StudentDao {
	/*A connection (session) with a specific database. 
	 * SQL statements are executed and results are 
	 * returned within the context of a connection. */
	public Connection createConnection()
	{
		//to connect with the database
		String url="jdbc:mysql://localhost:3306/tomandjerry";
		String username="root";
		String password="Vaish";
		
		try {
			/*if driver class name is an incorrect then
			 * it will be handle by using catch block
			 */
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver class Name");
		}
		Connection connection;
		try {
			connection=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("Invalid Credentials");
			connection=null;
			
		}
		return connection;
	}

}

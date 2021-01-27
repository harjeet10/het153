package mad322;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysqlconnection {
	private String dbName="midterm";
	private String dbuserName="admin";
	private String dbPass="mad322cegep";
	private String hostName="database-2.c09o7cytzzre.us-east-2.rds.amazonaws.com\r\n";
	private String dbport="3306";

	private String jdcurl="jdbc:mysql://"+hostName+":"+dbport+"/"+dbName+"?user="+dbuserName+"&password="+dbPass;

	private Connection con = null;

	public Connection getConnection() {
		try
		{
			System.out.println("Load Driver");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
	         
			System.out.println("Make connection To Mysql");
			
			con= DriverManager.getConnection(jdcurl);
			
			return con;
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Connection Not Found error : "+ e.getMessage());
			
		}
		catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
			
		}
		return con;
	}
}

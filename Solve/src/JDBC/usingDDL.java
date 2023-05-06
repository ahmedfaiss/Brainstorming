package JDBC;
import java.sql.*;
import java.util.Scanner;


public class usingDDL {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ","root","MySQL");
		
		Statement st = con.createStatement();
		
		st.executeUpdate("create table temp1(val Integer, val1 float)");//to create new table
		
		st.executeUpdate("drop table temp");//to delete the table
		//for DML and DDL we have to useexecuteUpdate
		
		st.close();
		con.close();
		//this is the last program
		
	}

}
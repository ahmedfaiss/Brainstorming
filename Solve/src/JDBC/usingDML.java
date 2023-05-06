package JDBC;
import java.sql.*;
import java.util.Scanner;

public class usingDML {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ","root","MySQL");
		
		Statement st = con.createStatement();
		
		st.executeUpdate("insert into student values(17,'Ahmedaa','Mangalore',40)");//for inserting
		
		st.executeUpdate("delete from student where sname='Ahmed'");//for deleting
		
		st.executeUpdate("update student set sname='Lulu' where sname='Ahmedaa'"); 
		
		st.close();
		con.close();
		
	}

}

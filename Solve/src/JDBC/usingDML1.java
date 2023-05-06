package JDBC;
import java.sql.*;
import java.util.Scanner;


public class usingDML1 {
	public static void main(String [] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ","root","MySQL");
		
		PreparedStatement ps = con.prepareStatement("insert into student value(?,?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Data ");
		
		int rollno = sc.nextInt();
		String sname = sc.next();
		String city = sc.next();
		int deptno = sc.nextInt();
		
		ps.setInt(1,rollno);
		ps.setString(2,sname);
		ps.setString(3, city);
		ps.setInt(4, deptno);
		
		ps.executeUpdate();
		
		sc.close();
		ps.close();
		con.close();
		
		
	}

}

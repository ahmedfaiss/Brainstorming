package JDBC;
import java.sql.*;
import java.util.Scanner;

public class preparedStatement {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");//This si the method for invoking JDBC method for mySQL
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ","root","MySQL");//with the help of DriverManager establish
		//the connection by using URL of the database
		
		PreparedStatement ps = con.prepareStatement("select * from student where deptno=?");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the department Number ");
		
		//@SuppressWarnings("unused")
		int dno = sc.nextInt();	
		ps.setInt(1, dno);
		
		ResultSet rs = ps.executeQuery();
		
		int deptno, rollno;
		String sname, city;
		
		while(rs.next())
		{
			rollno = rs.getInt("rollno");
			sname = rs.getString("sname");
			city = rs.getString("city");
			deptno = rs.getInt("deptno");
			
			System.out.println(rollno+"  "+sname+"  "+city+"  "+deptno);
		}
		
		//This is Brainstroming session
				//on may 18th
				//Ahmed Faisal
		//github
		
		con.close();
		sc.close();
		rs.close();
		
		
	}

}

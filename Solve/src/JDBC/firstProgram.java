package JDBC;
import java.sql.*;

public class firstProgram {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/univ","root","MySQL");
		
		Statement st = con.createStatement();
		
		
		ResultSet rs1 = st.executeQuery("Select * from student");
		
		int rollno;
		String sname;
		String city;
		int deptno;
		
		int deptno1;
		String dname;
		
		
		while(rs1.next())
		{
			rollno = rs1.getInt("rollno");
			sname = rs1.getString("sname");
			city = rs1.getString("city");
			deptno = rs1.getInt("deptno");
			
			
			System.out.println(rollno+"  "+sname+"  "+city+"  "+deptno);
		}
		st.close();
		con.close();
	}
}

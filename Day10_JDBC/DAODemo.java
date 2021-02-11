package Day10_JDBC;
import java.sql.*;
public class DAODemo 
{
	public static void main(String[] args) throws Exception
	{
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudentDetails(8);
		System.out.println(s1.id+":"+s1.name+" "+"Mobile:"+s1.mobile);
	}
	
}

class StudentDAO
{
	public Student getStudentDetails(int id) throws Exception
	{
		Student s = new Student();
		String query = "select * from sample where id = "+id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emsdatabase","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		s.id = id;
		s.name = rs.getString(2);
		s.mobile = rs.getString(3);
		
		return s;
	}

}

class Student
{
	int id;
	String name;
	String mobile;
}
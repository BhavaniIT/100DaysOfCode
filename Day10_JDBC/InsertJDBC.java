package Day10_JDBC;
import java.sql.*;
public class InsertJDBC 
{
	public static void main(String[] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/emsdatabase";
		String uname = "root";
		String pass = "root";
		String query = "insert into sample values(11,'geek','6383974004')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count+" rows affected and statement");
		
		//Use of PreparedStatement to update user defined value in the query
		
		int id = 15;
		String name = "travel";
		String number = "9486291668";
		
		String query1 = "insert into sample values (?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(query1);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, number);
		
		count = pst.executeUpdate();
		
		System.out.println(count+" rows affected and prepared statement");
		
		
		
	}

}

package Day10_JDBC;
import java.sql.*;

/* Java jdbc connnectivity steps
 * 1. import the package  ---> java.sql.*;
 * 2. Load and Register the driver ---> com.mysql.jdbc.Driver
 * 3. Create connection  ---> Connection interface
 * 4. Create statement	 ---> Statement interface
 * 5. execute query		 ---> executeUpdate() and executeQuery() methods
 * 6. Result set		---> ResultSet
 * 7. close the connection
 */

public class SampleJDBC {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/emsdatabase";
		String uname="root";
		String pass = "root";
		String query = "select * from sample";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st =  con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next();
		int a = rs.getInt(1);
		System.out.println(a);
	}
}

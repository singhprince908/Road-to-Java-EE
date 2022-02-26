package Training;
//1		
import java.sql.*;
public class jdbcDemo {
	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/register";
		String uname="root";
		String pass="bhindi@1234";
		
		String query="select * from stud_info";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		System.out.println(rs.getInt("userid")+"--"+rs.getString("username"));
		
		st.close();
		con.close();
		
	}

}

package Training;
//1
import java.sql.*;
public class jdbcdemo2 {
	public static void main(String[] args) throws Exception{
		
		//2b
		Class.forName("com.mysql.jdbc.Driver");
		
		//3
		String url="jdbc:mysql://localhost/register";
		Connection con= DriverManager.getConnection(url,"root","bhindi@1234");
		
		//4
		int userid=5;
		String username="Mehta";		
		String query="insert into stud_info values(?,?)";
		PreparedStatement st=con.prepareStatement(query);
		
		st.setInt(1,userid);
		st.setString(2,username);
		
		//5
		int count=st.executeUpdate();
		
		//6
		System.out.println(count+" row/s effected");
			
	}
	
}
	
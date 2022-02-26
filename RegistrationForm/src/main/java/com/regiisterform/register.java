package com.regiisterform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class register
 */
@WebServlet("/regi")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		
		try {
			
			Thread.sleep(3000);
			//2b
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/register";
			//3
			Connection con=DriverManager.getConnection(url,"root","bhindi@1234");
			//4
			String query="insert into user2(name,password,email) values(?,?,?)";
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1,name);
			st.setString(2,password);
			st.setString(3,email);
			//5
			st.executeUpdate();
			out.println("done");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
		
		
		
	}

}

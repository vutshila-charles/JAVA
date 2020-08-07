package database;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

//import intermediateJava.Hospital;

/**
 * Servlet implementation class LetsTryDatabase
 */
@WebServlet("/LetsTryDatabase")
public class LetsTryDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LetsTryDatabase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
			//here sono is database name, root is user name and password 
			
			String query ="insert into patientlogindetails  (password, username) "+ "values (?,?)";
			
			 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
			 String name = request.getParameter("usernamebar");
			    String pass = request.getParameter("Userpass");
			 preparedStmt.setString(1,name);
			 preparedStmt.setString(2,pass);
			 //preparedStmt.execute();
			
				response.sendRedirect("NewDetails.html");
				
				JOptionPane.showMessageDialog(null, "Registered");
				
		        con.close();	
		 
			
		}
		catch(Exception exception)
		{
			System.out.println(exception);
			
			
		}
		
		
		}

		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
		String name = request.getParameter("usernamebar");
	    String pass = request.getParameter("Userpass");
	    try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test","root","zero72494936ZERO");  
			//here sono is database name, root is user name and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from LoginDetails where username='"+name+"' and password='"+pass+"'"); 
			
				
			
			if(rs.next())
			{
				
				System.out.println("Welcome");
				response.sendRedirect("success.html");
				
				
			}
			
			else //if (!rs.next())
			{
				System.out.println("Wrong username or passwword");
				response.sendRedirect("error.html");
				
				//atempt +=1;
				//if(atempt==3)
				//{
					//System.exit(0);
				//}
			}
			
		 con.close();	
			
		}
		catch(Exception exception)
		{
			System.out.println(exception);
	}
	
}
	}

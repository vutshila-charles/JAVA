package database;
//217135994HLONGWANE RC
//mysql> create table borrowerdetails(Tittle varchar(4),Name varchar(15),Surname varchar(17)
//,PhoneNo varchar(10),MonthlySalry varchar(13),MonthlyExpense varchar(12),
//Suburb varchar(10),SA_ID varchar(13),Username varchar(7));
import java.sql.*;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
/**
 * Servlet implementation class DaytabaseCon
 */
@WebServlet("/DaytabaseCon")
public class DaytabaseCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DaytabaseCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //respond to check status 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try
		{
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","zero72494936ZERO");  
			
			
			 String title = request.getParameter("Titletab");
			 String name = request.getParameter("nametab");
			 String surname = request.getParameter("surnametab");
			 String phone = request.getParameter("phonenumbertab");
			 String MonthlySalry = request.getParameter("monthlyincome");
			 String MonthlyExp = request.getParameter("monthlyexpnses");
			 String surburb = request.getParameter("suburbtab");
			 String SaID = request.getParameter("SAIDTab");
			 
			 
			 Random dice = new Random();
			 
			// String numbers=Integer.parseInt();
			 int numbe = 1+dice.nextInt(99);
			
			
			 
			 String usernum=name.substring(0, 3)+surname.substring(0, 2);
			 
			 String query ="insert into applications  (Tittle, Name,Surname,PhoneNo,MonthlySalry,MonthlyExpense,Suburb,SA_ID,Username) "+ "values (?,?,?,?,?,?,?,?,?)";
			 //PreparedStatement preparedStmt = con.prepareStatement(query);
			 PreparedStatement preparedStmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			 ResultSet tablekeys = preparedStmt.getGeneratedKeys();
			 //tablekeys.next();
			 int autogenId = tablekeys.getInt(1);
			 
				 
			 preparedStmt.setString(1,title);
			 preparedStmt.setString(2,name);
			 preparedStmt.setString(3,surname);
			 preparedStmt.setString(4,phone);
			 preparedStmt.setString(5,MonthlySalry);
			 preparedStmt.setString(6,MonthlyExp);
			 preparedStmt.setString(7,surburb);
			 preparedStmt.setString(8,SaID);
			 preparedStmt.setString(9,usernum+numbe);
			 preparedStmt.execute();
			
			
			   
			 //JOptionPane.showMessageDialog(null, "Your  username is : "+usernum+numbe);
			 PrintWriter webout =response.getWriter();
			 webout.print("YOUR USERNAME IS : "+usernum+autogenId);
			
		     
			 
		       
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
		
		 try
			{
		    	String name = request.getParameter("usernametab");
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","zero72494936ZERO");  
				 
				Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from status where uname='"+name+"'"); 
				
					
				
				if(rs.next())
				{
					
					
					response.sendRedirect("Approved.html");
					
					
				}
				else if (!rs.next())
				{
					response.sendRedirect("success.html");
				}
				
				
				
				
			 con.close();	
				
			}
			catch(Exception exception)
			{
				System.out.println(exception);
				
		    }
		
	}

}

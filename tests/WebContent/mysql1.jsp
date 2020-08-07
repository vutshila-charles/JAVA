<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.sql.*"%>
<%@page import ="java.util.*"%>
<% 

try{  
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
	//here test is database name, root is user name and password is the long number  
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from employee");  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
	con.close();
	//out.print("succesfull");
	}catch(Exception e){ System.out.println(e);}
%> 
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUP</title>
</head>
<body>
Username :<input type="text" name="usernamebar"/>
<br />
Password :<input type="text" name="Usersurname">
<br />
<% try
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
			
				//response.sendRedirect("NewDetails.html");
				
				//JOptionPane.showMessageDialog(null, "Registered");
				
		        con.close();	
		 
			
		}
		catch(Exception exception)
		{
			System.out.println(exception);
			
			
		}
%>	

<input type="submit" value="submit" >
</form>
</body>
</html>
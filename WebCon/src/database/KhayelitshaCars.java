package database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KhayelitshaCars
 */
@WebServlet("/KhayelitshaCars")
public class KhayelitshaCars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhayelitshaCars() {
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
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO");  
			
			
			 String title = request.getParameter("Titletab");
			 String name = request.getParameter("nametab");
			 String surname = request.getParameter("surnametab");
			 String phone = request.getParameter("phonenumbertab");
			 String Suburb = request.getParameter("SuburbTab");
			 String CarModel = request.getParameter("CarModel");
			 String CarName = request.getParameter("CarName");
			 String CarYear = request.getParameter("CarYear");
			 
			 
			 Random dice = new Random();
			 
			// String numbers=Integer.parseInt();
			 int numbe = 1+dice.nextInt(99);
			
			
			 
			 String usernum=name.substring(0, 3)+surname.substring(0, 2);
			 
			 String query ="insert into SellerInfo  (Tittle, Name,Surname,Phone,Suburb,CarModel,CarMake,CarYear,Username) "+ "values (?,?,?,?,?,?,?,?,?)";
			 //PreparedStatement preparedStmt = con.prepareStatement(query);
			 PreparedStatement preparedStmt = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			
			 //ResultSet tablekeys = preparedStmt.getGeneratedKeys();
			 //tablekeys.next();
			 //int autogenId = tablekeys.getInt(1);
			 
				 
			 preparedStmt.setString(1,title);
			 preparedStmt.setString(2,name);
			 preparedStmt.setString(3,surname);
			 preparedStmt.setString(4,phone);
			 preparedStmt.setString(5,Suburb);
			 preparedStmt.setString(6,CarModel);
			 preparedStmt.setString(7,CarName);
			 preparedStmt.setString(8,CarYear);
			 preparedStmt.setString(9,usernum+numbe);
			 preparedStmt.execute();
			 
			
			
			   
			
			 PrintWriter webout =response.getWriter();
			 webout.print("YOUR USERNAME IS : "+usernum+numbe);
			
		     
			 
		       
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
		//doGet(request, response);
		response.sendRedirect("KhayelitsshaCars.html");
	}

}

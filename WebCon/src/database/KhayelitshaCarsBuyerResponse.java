package database;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KhayelitshaCarsBuyerResponse
 */
@WebServlet("/KhayelitshaCarsBuyerResponse")
public class KhayelitshaCarsBuyerResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhayelitshaCarsBuyerResponse() {
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
			 Statement state= con.createStatement();
				
				
				
				ResultSet rs = state.executeQuery("select* from SellerInfo" );
				
				
				
				
				while(rs.next())
				{
					String carmodel = rs.getString(6);
					String carmake = rs.getString(7);
					String caryear = rs.getString(8);
					PrintWriter webout =response.getWriter();
					 webout.print("CarMake "+carmake+"|\n"+"CarModel "+carmodel+"|\n"+"CarYear "+caryear+"\n");
				}
		}
		catch(Exception exception)
		{
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DemoGui {

	private JFrame frame;
	private final JLabel EmpNameLabel = new JLabel("Emp Number");
	private JTextField EmpNumField;
	private JTextField NameField;
	private JTextField surnameField;
	private JTextField rankField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoGui window = new DemoGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DemoGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		EmpNameLabel.setBounds(10, 27, 131, 23);
		frame.getContentPane().add(EmpNameLabel);
		
		JLabel SurnmaeLabel = new JLabel("Name");
		SurnmaeLabel.setBounds(10, 65, 117, 23);
		frame.getContentPane().add(SurnmaeLabel);
		
		JLabel surnameLabel = new JLabel("Surname");
		surnameLabel.setBounds(10, 99, 88, 28);
		frame.getContentPane().add(surnameLabel);
		
		EmpNumField = new JTextField();
		EmpNumField.setBounds(181, 32, 150, 20);
		frame.getContentPane().add(EmpNumField);
		EmpNumField.setColumns(10);
		
		NameField = new JTextField();
		NameField.setBounds(181, 74, 150, 20);
		frame.getContentPane().add(NameField);
		NameField.setColumns(10);
		
		surnameField = new JTextField();
		surnameField.setBounds(181, 110, 150, 20);
		frame.getContentPane().add(surnameField);
		surnameField.setColumns(10);
		
		JLabel RankLabel = new JLabel("Rank");
		RankLabel.setBounds(10, 156, 46, 14);
		frame.getContentPane().add(RankLabel);
		
		rankField = new JTextField();
		rankField.setBounds(181, 153, 150, 20);
		frame.getContentPane().add(rankField);
		rankField.setColumns(10);
		
		JButton btnNewButton = new JButton("show details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from employee"); 
					
					int empnum;
				      String Names;
				      String sname;
				      String rank;
					//size++;
					
					 //while (rs.next()) {

				       //   size++;
				      //}
					
					while(rs.next())
					{
						
						
						
						
						empnum= rs.getInt("Emp_ID");
						Names=  rs.getString("Emp_name");
						sname =rs.getString("Emp_surname");
						rank = rs.getString("Emp_Rank");	
				        rankField.setText(""+rank);
						EmpNumField.setText(""+empnum);
						NameField.setText(""+Names);
					    surnameField.setText(""+sname);		
				        //count++;
						
					}
					
					
					
					 con.close();	
						
					}
					catch(Exception exception)
					{
						System.out.println(exception);
					}
			}
		});
		btnNewButton.setBounds(24, 207, 117, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(140, 207, 130, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rankField.setText("");
				EmpNumField.setText("");
				NameField.setText("");
			    surnameField.setText("");	
			}
		});
		btnExit.setBounds(271, 207, 117, 23);
		frame.getContentPane().add(btnExit);
	}
}

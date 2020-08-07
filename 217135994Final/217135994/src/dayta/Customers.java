package dayta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Customers {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customers window = new Customers();
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
	public Customers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(700, 700, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 16));
		textArea.setBackground(Color.BLACK);
		textArea.setForeground(Color.WHITE);
		textArea.setBounds(10, 80, 664, 539);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Customers");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(270, 11, 306, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnRetrieve = new JButton("retrieve");
		btnRetrieve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from BorrowerDetails");
					
					
					
					while(rs.next())
					{
						String titl = rs.getString(1);
						String name = rs.getString(2);
						String surn = rs.getString(3);
						String phone =rs.getString(4);
						String salary =rs.getString(5);
						String expense = rs.getString(6);
						String Suburb =rs.getString(7);
						String SaId =rs.getString(8);
						
						String usern =rs.getString(9);
						//String things ="Tittle Name Surname PhoneNo Salary Expenses IdNumber Username\n";
				         //textArea.setText("Tittle Name Surname PhoneNo Salary Expenses IdNumber Username\n");
						 textArea.append(titl+"  "+ name+"  " +surn+"  "+ phone+"  "+ salary+"  "+ expense+"  "+ Suburb+"  "+ SaId+"  "+  usern+"\n");
						 
				
					}
					 
					 
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
			}
		});
		btnRetrieve.setBackground(Color.BLACK);
		btnRetrieve.setForeground(Color.WHITE);
		btnRetrieve.setBounds(25, 15, 89, 23);
		frame.getContentPane().add(btnRetrieve);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				
				Manager man = new Manager();
				man.frame.setVisible(true);
			}
		});
		btnBack.setBounds(20, 627, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Surname");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(100, 66, 61, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(Color.RED);
		lblName.setBounds(43, 66, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(Color.RED);
		lblPhone.setBounds(171, 66, 61, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setForeground(Color.RED);
		lblSalary.setBounds(253, 66, 46, 14);
		frame.getContentPane().add(lblSalary);
		
		JLabel lblExpenses = new JLabel("Expenses");
		lblExpenses.setForeground(Color.RED);
		lblExpenses.setBounds(302, 66, 61, 14);
		frame.getContentPane().add(lblExpenses);
		
		JLabel lblSurburb = new JLabel("Surburb");
		lblSurburb.setForeground(Color.RED);
		lblSurburb.setBounds(372, 66, 46, 14);
		frame.getContentPane().add(lblSurburb);
		
		JLabel lblId = new JLabel("ID");
		lblId.setForeground(Color.RED);
		lblId.setBounds(443, 66, 46, 14);
		frame.getContentPane().add(lblId);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.RED);
		lblUsername.setBounds(543, 66, 79, 14);
		frame.getContentPane().add(lblUsername);
	}

}

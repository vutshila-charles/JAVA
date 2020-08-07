package dayta;
//217135994HLONGWANE RC
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Manager {

	public JFrame frame;
	private JTextField textFieldSearch;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField Mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager window = new Manager();
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
	public Manager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(700, 700, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANAGER  AT     BELHAR LOANS");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(59, 22, 466, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(38, 84, 132, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(213, 81, 132, 20);
		frame.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JLabel lblTittle = new JLabel("Tittle");
		lblTittle.setForeground(Color.WHITE);
		lblTittle.setBounds(38, 129, 122, 14);
		frame.getContentPane().add(lblTittle);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(213, 126, 249, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(38, 174, 75, 14);
		frame.getContentPane().add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 171, 249, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBounds(38, 218, 46, 14);
		frame.getContentPane().add(lblSurname);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 215, 249, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setForeground(Color.WHITE);
		lblPhoneNo.setBounds(38, 266, 95, 14);
		frame.getContentPane().add(lblPhoneNo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 263, 249, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMonthlySalary = new JLabel("Monthly salary ");
		lblMonthlySalary.setForeground(Color.WHITE);
		lblMonthlySalary.setBounds(38, 305, 122, 14);
		frame.getContentPane().add(lblMonthlySalary);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(213, 302, 249, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblMonthlyExpense = new JLabel("Monthly expense ");
		lblMonthlyExpense.setForeground(Color.WHITE);
		lblMonthlyExpense.setBounds(38, 351, 95, 14);
		frame.getContentPane().add(lblMonthlyExpense);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(213, 348, 249, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblSuburb = new JLabel("Suburb ");
		lblSuburb.setForeground(Color.WHITE);
		lblSuburb.setBounds(38, 393, 46, 14);
		frame.getContentPane().add(lblSuburb);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(213, 390, 249, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblSaId = new JLabel("SA ID");
		lblSaId.setForeground(Color.WHITE);
		lblSaId.setBounds(38, 435, 46, 14);
		frame.getContentPane().add(lblSaId);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(213, 432, 249, 20);
		frame.getContentPane().add(textField_8);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from BorrowerDetails where Username='" +textFieldSearch.getText()+"'");
					
					
					
					
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
						
						
						 //textFieldSearch;
						 textField_1.setText(""+titl);
						 textField_2.setText(""+name);
						 textField_3.setText(""+surn);
						 textField_4.setText(""+phone);
						 textField_5.setText(""+salary);
						 textField_6.setText(""+expense);
						 textField_7.setText(""+Suburb);
						 textField_8.setText(""+SaId);
						 Mid.setText(""+usern);
						
						 
						// int[] idarray =new int[];
						// idarray[] = Integer.parseInt(textField_8.getText());
						 
						 
						 
						 
					}
					
					con.close();
				
				
					
					
					
				}
				catch(Exception ex){
					
					//JOptionPane.showMessageDialog(null, "Word Not Available");
					System.out.print(ex);
				}
				
			}
		});
		btnSearch.setBounds(355, 80, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton btnNewButton = new JButton("verify ID");
		btnNewButton.setBounds(59, 525, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Status");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				ViewStatus cus =new ViewStatus();
				cus.frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(196, 525, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnDecline = new JButton("Decline");
		btnDecline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				Decline cus =new Decline();
				cus.frame.setVisible(true);
				
			}
		});
		btnDecline.setBounds(322, 525, 89, 23);
		frame.getContentPane().add(btnDecline);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(560, 525, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblmiddi = new JLabel("Username");
		lblmiddi.setForeground(Color.WHITE);
		lblmiddi.setBounds(38, 477, 46, 14);
		frame.getContentPane().add(lblmiddi);
		
		Mid = new JTextField();
		Mid.setColumns(10);
		Mid.setBounds(213, 474, 249, 20);
		frame.getContentPane().add(Mid);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(491, 124, 183, 367);
		frame.getContentPane().add(textArea);
		JButton btnNewButton_2 = new JButton("View all usernames");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from BorrowerDetails");
					
					
					
					
					while(rs.next())
					{
						
						String usern =rs.getString(9);
				
						 textArea.append(usern+"\n");
					}
					
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					//JOptionPane.showMessageDialog(null, "Word Not Available");
					System.out.print(ex);
				}
			}
		});
		btnNewButton_2.setBounds(491, 80, 158, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textFieldSearch.setText("");
				textField_1.setText("");
				 textField_2.setText("");
				 textField_3.setText("");
				 textField_4.setText("");
				 textField_5.setText("");
				 textField_6.setText("");
				 textField_7.setText("");
				 textField_8.setText("");
				 Mid.setText("");
				
			}
		});
		btnClear.setBounds(442, 525, 89, 23);
		frame.getContentPane().add(btnClear);
		
		JButton btnNewButton_3 = new JButton("View All Customers");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Customers cus =new Customers();
				cus.frame.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(491, 46, 158, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		
	}
}

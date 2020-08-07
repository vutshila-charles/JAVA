package database;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.awt.event.ActionEvent;

public class Consultant {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultant window = new Consultant();
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
	public Consultant() {
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
		
		JLabel lblIAmA = new JLabel("    I AM A CONSULTANT AT BELHAR LOANS");
		lblIAmA.setForeground(Color.WHITE);
		lblIAmA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblIAmA.setBounds(76, 11, 598, 42);
		frame.getContentPane().add(lblIAmA);
		
		JLabel lblUsername_1 = new JLabel("Username");
		lblUsername_1.setForeground(Color.WHITE);
		lblUsername_1.setBounds(56, 73, 132, 14);
		frame.getContentPane().add(lblUsername_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(231, 70, 132, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_2 = new JLabel("Tittle");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(56, 118, 122, 14);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(231, 115, 249, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("First Name");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(56, 163, 75, 14);
		frame.getContentPane().add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(231, 160, 249, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel label_4 = new JLabel("Surname");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(56, 207, 95, 14);
		frame.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(231, 204, 249, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_5 = new JLabel("Phone No.");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(56, 255, 95, 14);
		frame.getContentPane().add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(231, 252, 249, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_6 = new JLabel("Monthly salary ");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(56, 294, 122, 14);
		frame.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(231, 291, 249, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_7 = new JLabel("Monthly expense ");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(56, 340, 132, 14);
		frame.getContentPane().add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(231, 337, 249, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(56, 379, 75, 14);
		frame.getContentPane().add(lblUsername);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(231, 376, 249, 20);
		frame.getContentPane().add(textField_9);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from BorrowerDetails where Username='" +textField.getText()+"'");
					
					
					
					
					while(rs.next())
					{
						String titl = rs.getString(1);
						String name = rs.getString(2);
						String surn = rs.getString(3);
						String phone =rs.getString(4);
						String salary =rs.getString(5);
						String expense = rs.getString(6);
						
						String usern =rs.getString(9);
						
						
					
						 textField_1.setText(""+titl);
						 textField_2.setText(""+name);
						 textField_3.setText(""+surn);
						 textField_4.setText(""+phone);
						 textField_5.setText(""+salary);
						 textField_6.setText(""+expense);
						
						 textField_9.setText(""+usern);
						
					}
					
					con.close();
				
				
					
					
					
				}
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
			}
		});
		btnSearch.setBounds(373, 69, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		JButton button_2 = new JButton("Clear");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				textField.setText("");
				textField_1.setText("");
				 textField_2.setText("");
				 textField_3.setText("");
				 textField_4.setText("");
				 textField_5.setText("");
				 textField_6.setText("");
				 
				 textField_9.setText("");
			}
		});
		button_2.setBounds(174, 435, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Exit");
		button_3.setBounds(391, 435, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton btnNewButton = new JButton("Check afford");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				float salary =Integer.parseInt(textField_5.getText());
				float expense=Integer.parseInt(textField_6.getText());
				float repayment =((salary - expense)/3);
				float x=salary-expense;
				float loan =repayment*33;
				
				//JOptionPane.showMessageDialog(null, "Their diposable amount is : R"+x," They can only get a loan of : R"+loan, 1, null);
				JOptionPane.showMessageDialog(null, "Their diposable amount is : R"+x+"  They can only get a loan of : R"+loan);
			}
		});
		btnNewButton.setBounds(56, 435, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(490, 113, 183, 367);
		frame.getContentPane().add(textArea);
		
		JButton button = new JButton("View all usernames");
		button.addActionListener(new ActionListener() {
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
				
				
				System.out.print(ex);
			}
			}		
				
			
		});
		button.setBounds(490, 69, 158, 23);
		frame.getContentPane().add(button);
		
		JButton btnStatus = new JButton("Status");
		btnStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
				Status status = new Status();
				status.frame.setVisible(true);
				
			}
		});
		btnStatus.setBounds(274, 435, 89, 23);
		frame.getContentPane().add(btnStatus);
	}
}

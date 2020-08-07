package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.awt.event.ActionEvent;
import java.awt.Color;

public class Decline {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Decline window = new Decline();
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
	public Decline() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 102, 79, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UNSUCCESSFUL APPLICATIONS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(56, 27, 316, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(121, 99, 229, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Back");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				Manager cus =new Manager();
				cus.frame.setVisible(true);
			}
		});
		btnDelete.setBounds(24, 171, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnBack = new JButton("Delete");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
				
				
				
				
				
				String query ="Delete from BorrowerDetails where Username='" +textField.getText()+"'";
				
				PreparedStatement preparedStmt = con.prepareStatement(query);
				
				preparedStmt.execute();
				
				
				
					
				String username =textField.getText();
				
					 
				JOptionPane.showMessageDialog(null,username+ "Has been removed");	 
					 
					 
			
				
				con.close();
			
			
				
				
				
			}
			catch(Exception ex){
				
				//JOptionPane.showMessageDialog(null, "Word Not Available");
				System.out.print(ex);
			}
			
			}
		});
		btnBack.setBounds(193, 171, 89, 23);
		frame.getContentPane().add(btnBack);
	}
}

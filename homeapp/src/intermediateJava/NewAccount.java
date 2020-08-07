package intermediateJava;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class NewAccount {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField usernameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount window = new NewAccount();
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
	public NewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(400, 400, 850, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(0, 0, 886, 361);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("contacts");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(78, 150, 61, 21);lblNewLabel_4.setVisible(true);
		
		JLabel lblNewLabel_5 = new JLabel("Surname");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(78, 117, 61, 14);lblNewLabel_5.setVisible(true);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(lblNewLabel_3);
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(78, 234, 90, 14);lblNewLabel_3.setVisible(true);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(78, 196, 90, 14);
		
		JLabel DocsName = new JLabel("Full Name");
		DocsName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.add(DocsName);
		DocsName.setForeground(new Color(255, 255, 255));
		DocsName.setBounds(78, 81, 90, 14);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(209, 72, 195, 20);
		lblNewLabel.add(textField);textField.setVisible(true);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(209, 108, 195, 20);
		lblNewLabel.add(textField_1);textField_1.setVisible(true);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(209, 147, 195, 20);
		lblNewLabel.add(textField_2);textField_2.setVisible(true);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBounds(211, 190, 193, 20);
		lblNewLabel.add(usernameField);usernameField.setVisible(true);
		
		passwordField = new JTextField();
		passwordField.setColumns(10);
		passwordField.setBounds(209, 228, 195, 20);
		lblNewLabel.add(passwordField);passwordField.setVisible(true);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setBounds(78, 293, 89, 23);
		lblNewLabel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password 
					
					String query ="insert into patientlogindetails  (password, username) "+ "values (?,?)";
					
					 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
					 preparedStmt.setString(1,passwordField.getText());
					 preparedStmt.setString(2,usernameField.getText());
					 preparedStmt.execute();
					
					
						
						JOptionPane.showMessageDialog(null, "Registered");
						
				        con.close();	
				 
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					JOptionPane.showMessageDialog(null, "Username already in use choose a different one ");
					textField.setText("");
					textField_1.setText("");
					 textField_2.setText("");
					usernameField.setText("");
					passwordField.setText("");
				}
				
			}
		});
		btnNewButton_1.setBounds(236, 293, 89, 23);
		lblNewLabel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				FrontEnd newDoc = new FrontEnd();
				newDoc.frame.setVisible(true);
				//dispose();
				frame.dispose();
				
				
			}
		});
		btnNewButton_2.setBounds(390, 293, 89, 23);
		lblNewLabel.add(btnNewButton_2);
		DocsName.setVisible(true);
		lblNewLabel_2.setVisible(true);
		lblNewLabel_3.setVisible(true);
		btnNewButton.setVisible(true);
		btnNewButton_1.setVisible(true);
		btnNewButton_2.setVisible(true);
		
		
	}
}

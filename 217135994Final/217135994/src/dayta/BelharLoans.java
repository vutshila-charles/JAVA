package dayta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class BelharLoans {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BelharLoans window = new BelharLoans();
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
	public BelharLoans() {
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
		
		JLabel lblNewLabel = new JLabel("        BELHAR LOANS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 11, 368, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnManager = new JButton("Consultant");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					ResultSet rs = state.executeQuery("select* from BelharLoanAdmins where Username='" +textField.getText()+"'and passcode ='" +passwordField.getText()+"'");
					while(rs.next())
					{
					 frame.dispose();
					 Consultant cons = new Consultant();
					 cons.frame.setVisible(true);
					}
				}
				 
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,"invalid Details");
				}
			
			}
		});
		btnManager.setBounds(235, 169, 105, 23);
		frame.getContentPane().add(btnManager);
		
		JButton btnNewButton = new JButton("Manager");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					ResultSet rs = state.executeQuery("select* from BelharLoanAdmins where Username='" +textField.getText()+"'and passcode ='" +passwordField.getText()+"'");
					while(rs.next())
					{
					 frame.dispose();
					 Manager man = new Manager();
				     man.frame.setVisible(true);
					}
				}
				 
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null,"invalid Details");
				}
			}
		});
		btnNewButton.setBounds(34, 169, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(60, 86, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(190, 83, 131, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(60, 130, 79, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 127, 131, 20);
		frame.getContentPane().add(passwordField);
	}
}

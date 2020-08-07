package dayta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class Status {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2results;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Status window = new Status();
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
	public Status() {
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
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 31, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reason");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 121, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(107, 28, 142, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(107, 116, 202, 75);
		frame.getContentPane().add(textArea);
		JButton btnSend = new JButton("Send ");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");  
					
					
					String user =textField.getText();
					
					 String message = textArea.getText();
					 String mbuyelo =textField_2results.getText();
					 
					String query ="insert into status  (Uname, Message,Results) "+ "values (?,?,?)";
					
					 PreparedStatement preparedStmt = con.prepareStatement(query);
					 
					preparedStmt.setString(1,user);
					 preparedStmt.setString(2,message);
					 preparedStmt.setString(3,mbuyelo);
					 preparedStmt.execute();
					
					
						
						JOptionPane.showMessageDialog(null, "Message sent ");
						
				        con.close();	
				        
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
					
					
				}
				
				
			}
		});
		btnSend.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnSend);
		
		JLabel lblNewLabel_2 = new JLabel("Status");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 72, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2results = new JTextField();
		textField_2results.setBounds(107, 69, 142, 20);
		frame.getContentPane().add(textField_2results);
		textField_2results.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				Consultant cons = new Consultant();
				cons.frame.setVisible(true);
				
			}
		});
		btnBack.setBounds(51, 211, 89, 23);
		frame.getContentPane().add(btnBack);
		
		
	}
}

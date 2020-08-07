package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JScrollBar;

public class ViewStatus {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStatus window = new ViewStatus();
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
	public ViewStatus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(700, 700, 500, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.BLACK);
		textArea.setBounds(10, 60, 423, 576);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("View Status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Exam","root","cput");
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from Status");
					
					
					
					while(rs.next())
					{
						
						String usern =rs.getString(1);
						String message =rs.getString(2);
						String stat =rs.getString(3);
						 textArea.append(usern+ " "+message+" "+stat+" "+" \n");
						 
				
					}
					 
					 
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
			}
		});
		btnNewButton.setBounds(23, 26, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				Manager cus =new Manager();
				cus.frame.setVisible(true);
			}
		});
		btnBack.setBounds(231, 26, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(434, 60, 17, 576);
		frame.getContentPane().add(scrollBar);
	}
}

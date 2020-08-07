package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class SalesManBuy {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesManBuy window = new SalesManBuy();
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
	public SalesManBuy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KHAYELITSHA CARS");
		lblNewLabel.setBounds(117, 1, 180, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy Car");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO"); 
					
					
					
					
					
					String query ="Delete from SellerInfo where Username='" +textField.getText()+"'";
					
					PreparedStatement preparedStmt = con.prepareStatement(query);
					
					preparedStmt.execute();
					
					
					
						
					String username =textField.getText();
					
						 
					JOptionPane.showMessageDialog(null, "You have bought the CAR from  "+username); 
						 
						 
				
					
					con.close();
				
				
					
					
					
				}
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
				
				
				
			}
		});
		btnNewButton.setBounds(10, 139, 136, 42);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Enter username of a Seller");
		lblNewLabel_1.setBounds(10, 54, 186, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(167, 51, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBuy = new JButton("Back");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
frame.dispose();
				
				SalesManView status = new SalesManView();
				status.frame.setVisible(true);
			}
		});
		btnBuy.setBounds(222, 139, 136, 42);
		frame.getContentPane().add(btnBuy);
	}
}

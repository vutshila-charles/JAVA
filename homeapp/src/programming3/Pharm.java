package programming3;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;




import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Pharm {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPasswordField passwordField;
	private JTextField nametextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pharm window = new Pharm();
					window.frame.setVisible(true);
					window.frame.setSize(450,300);
					window.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pharm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Pharmacy");
		lblNewLabel.setBounds(186, 11, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(46, 73, 89, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(46, 125, 78, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String username = nametextfield.getText();
				String password = passwordField.getText();
				
				if(password.contains("CHARLES") && username.contains("CHARLES"))
				{
					passwordField.setText("");
					nametextfield.setText("");
					
					
					
				}
				
				
				else
				{
					JOptionPane.showMessageDialog(null,"Acces Denied","Enter correct details",JOptionPane.ERROR_MESSAGE);
					nametextfield.setText("");
					passwordField.setText("");
				}
			
			}
		
		}
		);
		
		
		
		btnNewButton.setBounds(35, 191, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				nametextfield.setText("");
				passwordField.setText("");
				
			}
		});
		btnNewButton_1.setBounds(173, 191, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setBounds(312, 191, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 122, 168, 20);
		frame.getContentPane().add(passwordField);
		
		nametextfield = new JTextField();
		nametextfield.setBounds(184, 70, 168, 20);
		frame.getContentPane().add(nametextfield);
		nametextfield.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 174, 414, 6);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 31, 414, 2);
		frame.getContentPane().add(separator_1);
	}
}

package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class PatientLogin {

	public JFrame frame;
	private JPasswordField passwordField;
	private JTextField usernameField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientLogin window = new PatientLogin();
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
	public PatientLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 850, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(61, 38, 298, 133);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("username");
		usernameLabel.setForeground(new Color(255, 255, 255));
		usernameLabel.setBounds(10, 25, 63, 14);
		panel.add(usernameLabel);
		
		JLabel PasswordLabel = new JLabel("password");
		PasswordLabel.setForeground(new Color(255, 255, 255));
		PasswordLabel.setBounds(10, 84, 78, 14);
		panel.add(PasswordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 81, 161, 20);
		panel.add(passwordField);
		
		usernameField = new JTextField();
		usernameField.setBounds(106, 22, 164, 20);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		JButton LoginButton = new JButton("Login");
		
		LoginButton.setBounds(57, 210, 89, 23);
		frame.getContentPane().add(LoginButton);
		
		JButton CancelButton = new JButton("Cancel");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText("");
				usernameField.setText("");
				passwordField.setEnabled(true);
				usernameField.setEnabled(true);
			}
		});
		CancelButton.setBounds(156, 210, 89, 23);
		frame.getContentPane().add(CancelButton);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//if(JOptionPane.showConfirmDialog(exitFrame,"Exit Login","close",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION)
				
				System.exit(0);
			}	
		});
		ExitButton.setBounds(254, 210, 89, 23);
		frame.getContentPane().add(ExitButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setBounds(387, 11, 437, 239);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		textField = new JTextField();
		textField.setBounds(241, 8, 186, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton confirmButton = new JButton("confirm");

		confirmButton.setBounds(10, 11, 118, 23);
		panel_1.add(confirmButton);
		
		JButton btnNewButton_1 = new JButton("Book appointment");
		btnNewButton_1.setBounds(10, 67, 203, 23);
		btnNewButton_1.setVisible(false);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("view apointment");
		btnNewButton_2.setBounds(10, 89, 203, 23);
		btnNewButton_2.setVisible(false);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Doc's Report");
		btnNewButton_3.setBounds(10, 112, 203, 23);
		btnNewButton_3.setVisible(false);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Payments");
		btnNewButton_4.setBounds(10, 134, 203, 23);
		btnNewButton_4.setVisible(false);
		panel_1.add(btnNewButton_4);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrontEnd doctor = new FrontEnd();
				doctor.frame.setVisible(true);
				//dispose();
				frame.dispose();
			}
		});
		btnHome.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnHome);
		
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from PatientLoginDetails where username='"+usernameField.getText()+"' and password='"+passwordField.getText()+"'"); 
					
						
					
					if(rs.next())
					{
						
						passwordField.setEnabled(false);
						usernameField.setEnabled(false);
						
						panel_1.setVisible(true);
						
						
						
						
						
					}
					
					else //if (!rs.next())
					{
						passwordField.setText("");
						usernameField.setText("");
						
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
						
						//atempt +=1;
						//if(atempt==3)
						//{
							//System.exit(0);
						//}
					}
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
			}
		});
		
		
		
		confirmButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from PatientLoginDetails where username='"+usernameField.getText()+"' and password='"+passwordField.getText()+"'"); 
					
						
					
					if(rs.next())
					{
						
						
						String name = rs.getString("username");
						textField.setText("welcome "+name);
						textField.setEditable(false);
						btnNewButton_1.setVisible(true);
						btnNewButton_2.setVisible(true);
						btnNewButton_3.setVisible(true);
						btnNewButton_4.setVisible(true);
						panel.setVisible(false);
						LoginButton.setVisible(false);
						CancelButton.setVisible(false);
						ExitButton.setVisible(false);
						panel_1.setBounds(100, 100, 850, 300);
						
					}
					
				
					
				 con.close();	
					
				}
				catch(Exception exception)
				{
					System.out.println(exception);
				}
				
			}
		});
	}
}

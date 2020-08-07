package intermediateJava;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PharmLogin {

	public JFrame frame;
	public JTextField usernameField;
	public JPasswordField passwordField;
	public JFrame exitFrame;
	public JPanel panel;
	private int atempt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PharmLogin window = new PharmLogin();
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
	public PharmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.setBounds(400, 400, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(202, 74, 384, 190);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");                                 //        
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 46, 92, 14);
		panel.add(lblNewLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(190, 43, 148, 20);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 122, 78, 14);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(190, 119, 148, 20);
		panel.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from LoginDetails where username='"+usernameField.getText()+"' and password='"+passwordField.getText()+"'"); 
					
						
					
					if(rs.next())
					{
						
						passwordField.setEnabled(false);
						usernameField.setEnabled(false);
						Hospital myhospital = new Hospital();
						myhospital.frame.setVisible(true);
						frame.dispose();
						
						
						
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
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(26, 156, 89, 23);
		panel.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				usernameField.setText("");
				passwordField.setEnabled(true);
				usernameField.setEnabled(true);
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(146, 156, 89, 23);
		panel.add(btnCancel);
		
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(exitFrame,"Exit Login","close",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
			   }
		}
		});
		
		
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExit.setBounds(260, 156, 89, 23);
		panel.add(btnExit);
		
		JPanel Extrapanel = new JPanel();
		Extrapanel.setForeground(new Color(255, 255, 255));
		Extrapanel.setBackground(new Color(0, 0, 255));
		Extrapanel.setBorder(null);
		Extrapanel.setBounds(224, 28, 345, 35);
		frame.getContentPane().add(Extrapanel);
		Extrapanel.setLayout(null);
		
		JLabel Title = new JLabel("CHARLIE'S MEDICLINIC");
		Title.setForeground(new Color(255, 255, 255));
		Title.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		Title.setBounds(102, 0, 217, 35);
		Extrapanel.add(Title);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				FrontEnd doctor = new FrontEnd();
				doctor.frame.setVisible(true);
				//dispose();
				frame.dispose();
			}
		});
		btnHome.setBounds(10, 28, 89, 23);
		frame.getContentPane().add(btnHome);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(java.awt.event.WindowEvent event) {
				
				
				
			}
		});
	}
	
	
}

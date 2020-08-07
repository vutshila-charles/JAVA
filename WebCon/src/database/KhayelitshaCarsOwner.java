package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import java.io.*
;public class KhayelitshaCarsOwner {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhayelitshaCarsOwner window = new KhayelitshaCarsOwner();
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
	public KhayelitshaCarsOwner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 86, 148, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(187, 103, 237, 500);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel = new JLabel("Owner's Preference");
		lblNewLabel.setBounds(10, 61, 148, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("View All details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO"); 
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from SellerInfo");
					
					
					
					while(rs.next())
					{
						
						String title =rs.getString(1);
						String name =rs.getString(2);
						String surname =rs.getString(3);
						String phone =rs.getString(4);
						String suburb =rs.getString(5);
						String carmake =rs.getString(6);
						String carmodel =rs.getString(7);
						String caryear =rs.getString(8);
						String usern =rs.getString(9);
						 textArea.append(title+"\n"+name+"\n"+surname+"\n"+phone+"\n"+suburb+"\n"+carmake+"\n"+carmodel+"\n"+caryear+"\n"+usern+"\n");
						 
				
					}
					 
					 
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
			}
		});
		btnNewButton.setBounds(187, 57, 206, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO"); 
				//String car =(textField.getText());
				
				
				String query =
			"insert into OwnersCars(Name) values(?)";
				//String query ="insert into SellerInfo  (Tittle, Name,Surname,Phone,Suburb,CarModel,CarMake,CarYear,Username) "+ "values (?,?,?,?,?,?,?,?,?)";
				PreparedStatement prep =con.prepareStatement(query);
				
				
				prep.setString(1, textField.getText());
				prep.execute();
				JOptionPane.showMessageDialog(null," Car has been added to List");
				textField.setText("");
			}
			catch(Exception ex) {
				
			System.out.println(ex);	
			}
				
			}
		});
		btnSend.setBounds(10, 117, 89, 23);
		frame.getContentPane().add(btnSend);
		
		JButton btnNewButton_1 = new JButton("Export as CSV");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO"); 
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from OwnersCars");
					
					 String csvFilePath = "OwnersCars.csv";
					 BufferedWriter fileWriter = new BufferedWriter(new FileWriter(csvFilePath));
					 fileWriter.write("Cars");
					 
					while(rs.next())
					{
						String Carname = rs.getString(1);
						String line = String.format("\"%s", Carname);
		                 
		                fileWriter.newLine();
		                fileWriter.write(line);
					}
					con.close();
					 fileWriter.close();
				}
					catch(Exception exc)
					{
						System.out.print(exc);
					}
				JOptionPane.showMessageDialog(null, "export successful");	
			}
		});
		btnNewButton_1.setBounds(10, 155, 148, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 223, 167, 380);
		frame.getContentPane().add(textArea_1);
		
		JButton btnViewAllCars = new JButton("view all cars");
		btnViewAllCars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/KhayelitshaCARS","root","zero72494936ZERO"); 
					
					
					
					Statement state= con.createStatement();
					
					
					
					ResultSet rs = state.executeQuery("select* from OwnersCars");
					
					
					
					while(rs.next())
					{
						
						String cars =rs.getString(1);
						
						 textArea_1.append(cars+"\n");
						 
				
					}
					 
					 
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
				
			}
		});
		btnViewAllCars.setBounds(10, 189, 118, 23);
		frame.getContentPane().add(btnViewAllCars);
		
		
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 frame.dispose();
					
					HomePage status = new HomePage();
					status.frame.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(10, 614, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
	}

}

package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

public class SalesManView {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesManView window = new SalesManView();
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
	public SalesManView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 84, 386, 517);
		frame.getContentPane().add(textArea);
		
		JButton ViewButton = new JButton("View Sellers");
		ViewButton.addActionListener(new ActionListener() {
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
						 textArea.append("Title "+title+"\n"+"Name "+name+"\n"+"Surname "+surname+"\n"+"Phone "+phone+"\n"+"Suburb "+suburb+"\n"+"CarMake "+carmake+"\n"+"CarModel"+carmodel+"\n"+"CarYear "+caryear+"\n"+"Username "+usern+"\n");
						 
				
					}
					 
					 
					con.close();
				
				
					
					
					
				}
					
				catch(Exception ex){
					
					
					System.out.print(ex);
				}
				
			}
		});
		ViewButton.setBounds(24, 50, 167, 23);
		frame.getContentPane().add(ViewButton);
		
		JLabel KhayelitshaCarsLabel = new JLabel("Khayelithsa Cars");
		KhayelitshaCarsLabel.setBackground(Color.BLUE);
		KhayelitshaCarsLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		KhayelitshaCarsLabel.setBounds(24, 11, 374, 28);
		frame.getContentPane().add(KhayelitshaCarsLabel);
		
		
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
               frame.dispose();
				
				HomePage status = new HomePage();
				status.frame.setVisible(true);
			}
		});
		Back.setBounds(24, 612, 89, 23);
		frame.getContentPane().add(Back);
		
		JButton buy = new JButton("Buy");
		buy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
frame.dispose();
				
				SalesManBuy status = new SalesManBuy();
				status.frame.setVisible(true);
			}
		});
		buy.setBounds(309, 612, 89, 23);
		frame.getContentPane().add(buy);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(397, 84, 27, 517);
		frame.getContentPane().add(scrollBar);
	}
}

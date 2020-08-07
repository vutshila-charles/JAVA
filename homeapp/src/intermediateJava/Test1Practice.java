package intermediateJava;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class Test1Practice extends JFrame{
	
	private JButton clear;
	private JButton addButton;
	private JTextField EnglishWord ;
	private JTextField TsongaWord;
	private JLabel tsongaLabel;
	private JLabel EnglishLabel;
	private JLabel Title;
	private JLabel Titl;
	private JButton shwButton;
	private JTextField EnglishWor ;
	private JTextField TsonaWor;
	private JLabel tsongaLabe;
	private JLabel EnglishLabe;
	
	public Test1Practice()
	{
		super("Dictionary");
	
		setLayout(null);
		
		Title = new JLabel("Add to Dictionary");
		Title.setBounds(150,0,200,20);
		add(Title);
		
		tsongaLabel = new JLabel("Tsonga Word");
		tsongaLabel.setBounds(10,20,100,20);
		add(tsongaLabel);
		
		EnglishLabel = new JLabel("English Word");
		EnglishLabel.setBounds(10,50,100,20);
		add(EnglishLabel);
		
		EnglishWord = new JTextField("");
		EnglishWord.setBounds(120,20,200,20);
		add(EnglishWord);
		
		TsongaWord = new JTextField("");
		TsongaWord.setBounds(120,50,200,20);
		add(TsongaWord);
		
		
		
		addButton = new JButton("Add");
		addButton.setBounds(120,80,90,20);
		add(addButton);
		
		Titl = new JLabel("Check from Dictionary");
		Titl.setBounds(150,110,200,20);
		add(Titl);
		
		tsongaLabe = new JLabel("Tsonga Word");
		tsongaLabe .setBounds(10,140,100,20);
		add(tsongaLabe );
		
		EnglishLabe = new JLabel("English Word");
		EnglishLabe.setBounds(10,170,100,20);
		add(EnglishLabe);
		
		EnglishWor = new JTextField("");
		EnglishWor.setBounds(120,170,200,20);
		add(EnglishWor);
		
		TsonaWor = new JTextField("");
		TsonaWor.setBounds(120,140,200,20);
		add(TsonaWor);
		
		shwButton = new JButton("View");
		shwButton.setBounds(10,200,90,20);
		add(shwButton);
		clear = new JButton("clear");
		clear.setBounds(120,200,90,20);
		add(clear);
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				EnglishWor.setText("");
				TsonaWor.setText("");
				
			}
		});
		
		shwButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password  
					Statement stmt=con.createStatement();  
				
					ResultSet rs=stmt.executeQuery("select * from PatientLoginDetails where password='"+TsonaWor.getText()+"'"); 
					
					ResultSet rset=stmt.executeQuery("select * from PatientLoginDetails where username='"+EnglishWor.getText()+"'");
					
					if(rs.next())
					{
						
						String word = rs.getString("username");
						EnglishWor.setText(""+word);
						EnglishWor.setEditable(false);
						
					}
					if(rset.next())
					{
						
						String word = rs.getString("password");
						TsonaWor.setText(""+word);
						TsonaWor.setEditable(false);
						
					}
				}
				catch(Exception e)
				{
					//JOptionPaneShowMessageDialoge(null,"word not available");
					
				}
				
				
			}
		});
		
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Test?characterEncoding=latin1&useConfigs=maxPerformance","root","zero72494936ZERO");  
					//here sono is database name, root is user name and password 
					
					String query ="insert into patientlogindetails  (username, password) "+ "values (?,?)";
					
					 java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
					 preparedStmt.setString(1,EnglishWor.getText());
					 preparedStmt.setString(2,TsonaWor.getText());
					 preparedStmt.execute();
					
					
						
						JOptionPane.showMessageDialog(null, "Word added");
						
				        con.close();	
				 
					
				}
				catch(Exception exception)
				{
					
				}
				
			}
		});
	}//end Constractor


}

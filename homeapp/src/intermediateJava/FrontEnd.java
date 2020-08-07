package intermediateJava;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FrontEnd {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontEnd window = new FrontEnd();
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
	public FrontEnd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(600, 500, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		ImageIcon icon = new ImageIcon("clinic.jpg");
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(0, 119, 984, 442);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel TitleLabel = new JLabel("CHARLIE'S MEDICLINIC CARES ABOUT YOUR HEALTH");
		TitleLabel.setForeground(new Color(255, 255, 255));
		TitleLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		TitleLabel.setBounds(180, 11, 702, 50);
		frame.getContentPane().add(TitleLabel);
		
		JComboBox UserLogincomboBox = new JComboBox();
		
		UserLogincomboBox.setModel(new DefaultComboBoxModel(new String[] {"Accounts", "Admin", "Doctor", "Patient", "CreateAccount"}));
		UserLogincomboBox.setBounds(373, 87, 124, 23);
		frame.getContentPane().add(UserLogincomboBox);
		UserLogincomboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(UserLogincomboBox.getSelectedItem().equals("Admin"))
				{
					PharmLogin myhospital = new PharmLogin();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
				
				if(UserLogincomboBox.getSelectedItem().equals("Patient"))
				{
					PatientLogin myhospital = new PatientLogin();
					myhospital.frame.setVisible(true);
					frame.dispose();
				}
				if(UserLogincomboBox.getSelectedItem().equals("CreateAccount"))
				{
					NewAccount myhospital = new NewAccount();
					myhospital.frame.setVisible(true);
					frame.dispose();
				}	
				
			}
		});
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(109, 87, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Contact Us");
		btnNewButton_2.setBounds(498, 87, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"About US", "Our_History", "Social_Responsibility"}));
		comboBox.setBounds(199, 87, 174, 23);
		frame.getContentPane().add(comboBox);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("Our_History"))
				{
					AboutUs myhospital = new AboutUs();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
				if(comboBox.getSelectedItem().equals("Social_Responsibility"))
				{
					Social myhospital = new Social();
					myhospital.frame.setVisible(true);
					frame.dispose();
					
				}
			}
		});
	}
}

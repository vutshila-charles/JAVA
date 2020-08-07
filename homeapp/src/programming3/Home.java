package programming3;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(400, 400, 750, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon icon = new ImageIcon("hospital.jpg");
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setBounds(0, 78, 724, 461);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setBounds(10, 44, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setBounds(98, 44, 89, 23);
		frame.getContentPane().add(btnContinue);
		
		JButton btnNewButton_1 = new JButton("EXIT!");
		btnNewButton_1.setBounds(187, 44, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextArea txtrCharliesMedicalClinic = new JTextArea();
		txtrCharliesMedicalClinic.setBackground(new Color(0, 191, 255));
		lblNewLabel.add(txtrCharliesMedicalClinic);
		txtrCharliesMedicalClinic.setText("Welcome!\r\nCharlie's MediClinic Private mission is \r\nto create environments \r\nwhich enable the highest level of \r\nquality private healthcare \r\nand to maximise investment potential \r\nin partnership with strategic\r\n service providers and patient-focused \r\nemployees within communities of \r\nconfidence.");
		txtrCharliesMedicalClinic.setBounds(25, 127, 345, 223);
	}
}

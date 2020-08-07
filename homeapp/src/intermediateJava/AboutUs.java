package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AboutUs {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
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
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		btnHome.setBounds(10, 27, 89, 23);
		frame.getContentPane().add(btnHome);
		
		JTextArea txtrInA = new JTextArea();
		txtrInA.setFont(new Font("Arial", Font.PLAIN, 17));
		txtrInA.setForeground(new Color(255, 255, 255));
		txtrInA.setBackground(new Color(0, 0, 0));
		txtrInA.setText("2017    In a historic moment for Horizon Deep, \r\n             Charlie's Medi-Clinic opened its doors in \r\n             Tzaneen, bringing affordable private healthcare \r\n             to the previously disadvantaged.\r\n\r\n2018    Charlie's Medi-Clinic is an establishment with an\r\n            ethos of offering the best health care facilities available. \r\n            We have an excellent team of Psychiatrists, Psychologists, \r\n            Occupational therapists and Nursing staff.\r\n\r\n2019   Charlie's Medi-Clinic The Deep is indicative of Charlie's Medi-Clinic\r\n              pursuit towards a promising future for our society's healthcare. \r\n             The 148 bed Charlie's Medi-Clinic covers an area of 10000m2 \r\n              on the corner of Jango and Main Horizon Deep.");
		txtrInA.setBounds(10, 57, 588, 393);
		frame.getContentPane().add(txtrInA);
	}
}

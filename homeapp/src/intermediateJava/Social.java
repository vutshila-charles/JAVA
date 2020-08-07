package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Social {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Social window = new Social();
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
	public Social() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 550, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrCharliesMediclinicOperates = new JTextArea();
		txtrCharliesMediclinicOperates.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrCharliesMediclinicOperates.setForeground(Color.WHITE);
		txtrCharliesMediclinicOperates.setBackground(Color.BLACK);
		txtrCharliesMediclinicOperates.setText("Charlie's MediClinic operates five private hospitals in South\r\nAfrica. These hospitals service approximately 5 million \r\nmembers of the previously disadvantaged community who \r\noften exhibit needs that the rest of society takes for granted. \r\nLack of numeracy, literacy, proper nutrition and recreational \r\namenities to name a few,are such examples.");
		txtrCharliesMediclinicOperates.setBounds(10, 92, 514, 401);
		frame.getContentPane().add(txtrCharliesMediclinicOperates);
		
		JLabel lblNewLabel = new JLabel("Our Social Responsibility");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(26, 22, 476, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FrontEnd doctor = new FrontEnd();
				doctor.frame.setVisible(true);
				
				frame.dispose();
			}
		});
		btnHome.setBounds(10, 504, 89, 23);
		frame.getContentPane().add(btnHome);
	}
}

package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BelharLoans {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BelharLoans window = new BelharLoans();
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
	public BelharLoans() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        BELHAR LOANS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(21, 11, 368, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnManager = new JButton("MANAGER");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 frame.dispose();
				 Manager man = new Manager();
			     man.frame.setVisible(true);
				
			
			}
		});
		btnManager.setBounds(21, 90, 105, 23);
		frame.getContentPane().add(btnManager);
		
		JButton btnNewButton = new JButton("CONSULTANT");
		btnNewButton.setBounds(21, 112, 105, 23);
		frame.getContentPane().add(btnNewButton);
	}

}

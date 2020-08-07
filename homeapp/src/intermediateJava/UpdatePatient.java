package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdatePatient {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatePatient window = new UpdatePatient();
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
	public UpdatePatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(141, 87, 358, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 112, 358, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 137, 358, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 162, 358, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 187, 358, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(141, 215, 358, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblHistory = new JLabel("history");
		lblHistory.setBounds(509, 140, 101, 14);
		frame.getContentPane().add(lblHistory);
		
		JLabel lblLivingEnvironment = new JLabel("living environment");
		lblLivingEnvironment.setBounds(509, 165, 101, 14);
		frame.getContentPane().add(lblLivingEnvironment);
		
		JLabel lblRecentTravel = new JLabel("recent travel");
		lblRecentTravel.setBounds(509, 190, 101, 14);
		frame.getContentPane().add(lblRecentTravel);
		
		JLabel lblLifeStyle = new JLabel("life style ");
		lblLifeStyle.setBounds(509, 218, 101, 14);
		frame.getContentPane().add(lblLifeStyle);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(637, 87, 325, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(637, 112, 325, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(637, 137, 325, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(637, 162, 325, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(637, 187, 325, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(637, 215, 325, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(141, 55, 358, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(637, 55, 325, 20);
		frame.getContentPane().add(textField_13);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(250, 286, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Patients mypatient = new Patients();
				mypatient.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(604, 286, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel label = new JLabel("Patient's Ref No.");
		label.setBounds(30, 58, 101, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(" Name(s)");
		label_1.setBounds(30, 90, 101, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Surname");
		label_2.setBounds(30, 115, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Identity No.");
		label_3.setBounds(30, 143, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Gender");
		label_4.setBounds(30, 168, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Category");
		label_5.setBounds(30, 193, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Condition/sickness");
		label_6.setBounds(30, 218, 101, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Cellphone");
		label_7.setBounds(509, 61, 115, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Email");
		label_8.setBounds(509, 90, 115, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Address");
		label_9.setBounds(509, 118, 115, 14);
		frame.getContentPane().add(label_9);
	}

}

package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewPatient {

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
					NewPatient window = new NewPatient();
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
	public NewPatient() {
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
		
		JLabel label = new JLabel("Patient's Ref No.");
		label.setBounds(22, 68, 101, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel(" Name(s)");
		label_1.setBounds(22, 100, 101, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Surname");
		label_2.setBounds(22, 125, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Identity No.");
		label_3.setBounds(22, 153, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Gender");
		label_4.setBounds(22, 178, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Category");
		label_5.setBounds(22, 203, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Condition/sickness");
		label_6.setBounds(22, 228, 101, 14);
		frame.getContentPane().add(label_6);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 65, 358, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(133, 97, 358, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 122, 358, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(133, 147, 358, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(133, 172, 358, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(133, 197, 358, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 225, 358, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel label_7 = new JLabel("Patient's Ref No.");
		label_7.setBounds(505, 65, 101, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel(" Name(s)");
		label_8.setBounds(505, 97, 101, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Surname");
		label_9.setBounds(505, 122, 101, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Identity No.");
		label_10.setBounds(505, 150, 101, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Gender");
		label_11.setBounds(505, 175, 101, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Category");
		label_12.setBounds(505, 200, 101, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Condition/sickness");
		label_13.setBounds(505, 225, 101, 14);
		frame.getContentPane().add(label_13);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(616, 62, 358, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(616, 94, 358, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(616, 119, 358, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(616, 144, 358, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(616, 169, 358, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(616, 194, 358, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(616, 222, 358, 20);
		frame.getContentPane().add(textField_13);
		
		JButton AddPatientButton = new JButton("Add");
		AddPatientButton.setBounds(268, 293, 89, 23);
		frame.getContentPane().add(AddPatientButton);
		
		JButton BackButton = new JButton("Back");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Patients mypatient = new Patients();
				mypatient.frame.setVisible(true);
				frame.dispose();
			}
		});
		BackButton.setBounds(655, 293, 89, 23);
		frame.getContentPane().add(BackButton);
	}

}

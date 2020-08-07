package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class NewMedication {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewMedication window = new NewMedication();
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
	public NewMedication() {
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
		
		JLabel label = new JLabel("Name of Tablets:");
		label.setForeground(Color.BLACK);
		label.setBounds(21, 77, 108, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Reference No.");
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(21, 102, 86, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Dosage(mg):");
		label_2.setForeground(Color.BLACK);
		label_2.setBounds(21, 127, 86, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Number of Tablets:");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(21, 152, 118, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Indications");
		label_4.setForeground(Color.BLACK);
		label_4.setBounds(21, 177, 86, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Issue Date:");
		label_5.setForeground(Color.BLACK);
		label_5.setBounds(21, 202, 86, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Exp Date:");
		label_6.setForeground(Color.BLACK);
		label_6.setBounds(21, 227, 86, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Clinical Pharmacology");
		label_7.setForeground(Color.BLACK);
		label_7.setBounds(21, 252, 118, 14);
		frame.getContentPane().add(label_7);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(187, 93, 329, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 118, 329, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(187, 143, 329, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(187, 168, 329, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(187, 193, 329, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(187, 221, 329, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(187, 246, 329, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(187, 62, 329, 20);
		frame.getContentPane().add(textField_7);
		
		label_8 = new JLabel("Side Effects:");
		label_8.setForeground(Color.BLACK);
		label_8.setBounds(541, 74, 86, 14);
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("Contraindications");
		label_9.setForeground(Color.BLACK);
		label_9.setBounds(541, 99, 99, 14);
		frame.getContentPane().add(label_9);
		
		label_10 = new JLabel("Storage:");
		label_10.setForeground(Color.BLACK);
		label_10.setBounds(541, 124, 86, 14);
		frame.getContentPane().add(label_10);
		
		label_11 = new JLabel("Medication Guide");
		label_11.setForeground(Color.BLACK);
		label_11.setBounds(541, 149, 99, 14);
		frame.getContentPane().add(label_11);
		
		label_12 = new JLabel("Warning");
		label_12.setForeground(Color.BLACK);
		label_12.setBounds(541, 174, 108, 14);
		frame.getContentPane().add(label_12);
		
		label_13 = new JLabel("Administration");
		label_13.setForeground(Color.BLACK);
		label_13.setBounds(541, 199, 131, 14);
		frame.getContentPane().add(label_13);
		
		label_14 = new JLabel("Patient ID:");
		label_14.setForeground(Color.BLACK);
		label_14.setBounds(541, 224, 118, 14);
		frame.getContentPane().add(label_14);
		
		label_15 = new JLabel("Doctor's NHS No:");
		label_15.setForeground(Color.BLACK);
		label_15.setBounds(541, 249, 118, 14);
		frame.getContentPane().add(label_15);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(687, 246, 266, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(687, 221, 266, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(687, 196, 266, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(687, 171, 266, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(687, 146, 266, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(687, 121, 266, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(687, 96, 266, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(687, 71, 266, 20);
		frame.getContentPane().add(textField_15);
	}

}

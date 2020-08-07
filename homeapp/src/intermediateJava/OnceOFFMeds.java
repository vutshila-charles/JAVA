package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;

public class OnceOFFMeds {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnceOFFMeds window = new OnceOFFMeds();
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
	public OnceOFFMeds() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 276, 944, 35);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("Clear");
		panel.add(button);
		
		JButton button_1 = new JButton("Update");
		panel.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		panel.add(button_2);
		
		JButton button_3 = new JButton("AddMed");
		panel.add(button_3);
		
		JButton button_4 = new JButton("Back");
		panel.add(button_4);
		
		JLabel label = new JLabel("Name of Tablets:");
		label.setForeground(Color.WHITE);
		label.setBounds(10, 64, 108, 14);
		frame.getContentPane().add(label);
		
		JLabel label_9 = new JLabel("Reference No.");
		label_9.setForeground(Color.WHITE);
		label_9.setBounds(10, 89, 86, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Dosage(mg):");
		label_10.setForeground(Color.WHITE);
		label_10.setBounds(10, 114, 86, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Number of Tablets:");
		label_11.setForeground(Color.WHITE);
		label_11.setBounds(10, 139, 118, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Indications");
		label_12.setForeground(Color.WHITE);
		label_12.setBounds(10, 164, 86, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Issue Date:");
		label_13.setForeground(Color.WHITE);
		label_13.setBounds(10, 189, 86, 14);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Exp Date:");
		label_14.setForeground(Color.WHITE);
		label_14.setBounds(10, 214, 86, 14);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Clinical Pharmacology");
		label_15.setForeground(Color.WHITE);
		label_15.setBounds(10, 239, 118, 14);
		frame.getContentPane().add(label_15);
		
		JLabel label_1 = new JLabel("Side Effects:");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(542, 73, 86, 14);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(688, 70, 266, 20);
		frame.getContentPane().add(textField);
		
		JLabel label_2 = new JLabel("Contraindications");
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(542, 98, 99, 14);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(688, 95, 266, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("Storage:");
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(542, 123, 86, 14);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(688, 120, 266, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("Medication Guide");
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(542, 148, 99, 14);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(688, 145, 266, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("Warning");
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(542, 173, 108, 14);
		frame.getContentPane().add(label_5);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(688, 170, 266, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel label_6 = new JLabel("Administration");
		label_6.setForeground(Color.WHITE);
		label_6.setBounds(542, 198, 131, 14);
		frame.getContentPane().add(label_6);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(688, 195, 266, 20);
		frame.getContentPane().add(textField_12);
		
		JLabel label_7 = new JLabel("Patient ID:");
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(542, 223, 118, 14);
		frame.getContentPane().add(label_7);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(688, 220, 266, 20);
		frame.getContentPane().add(textField_13);
		
		JLabel label_8 = new JLabel("Doctor's NHS No:");
		label_8.setForeground(Color.WHITE);
		label_8.setBounds(542, 248, 118, 14);
		frame.getContentPane().add(label_8);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(688, 245, 266, 20);
		frame.getContentPane().add(textField_14);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(162, 64, 329, 20);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 89, 329, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(162, 114, 329, 20);
		frame.getContentPane().add(textField_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 139, 329, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 164, 329, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(162, 189, 329, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(162, 217, 329, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(162, 242, 329, 20);
		frame.getContentPane().add(textField_10);
		
		JLabel lblNewLabel = new JLabel("                        Once Off Medication");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(117, 11, 629, 42);
		frame.getContentPane().add(lblNewLabel);
	}
}

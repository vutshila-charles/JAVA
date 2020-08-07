package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patients {

	public JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patients window = new Patients();
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
	public Patients() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientsRefNo = new JLabel("Patient's Ref No.");
		lblPatientsRefNo.setBounds(21, 68, 101, 14);
		frame.getContentPane().add(lblPatientsRefNo);
		
		JLabel lblNames = new JLabel(" Name(s)");
		lblNames.setBounds(21, 100, 101, 14);
		frame.getContentPane().add(lblNames);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(132, 97, 296, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(21, 125, 101, 14);
		frame.getContentPane().add(lblSurname);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(132, 122, 296, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 178, 101, 14);
		frame.getContentPane().add(lblGender);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(132, 147, 296, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblCellphoe = new JLabel("Category");
		lblCellphoe.setBounds(21, 203, 101, 14);
		frame.getContentPane().add(lblCellphoe);
		
		JLabel lblConditionsickness = new JLabel("Condition/sickness");
		lblConditionsickness.setBounds(21, 228, 101, 14);
		frame.getContentPane().add(lblConditionsickness);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(132, 225, 296, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(609, 62, 253, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(609, 94, 253, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(609, 122, 253, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(609, 147, 253, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(609, 175, 253, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(609, 200, 253, 20);
		frame.getContentPane().add(textField_12);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(609, 225, 253, 20);
		frame.getContentPane().add(textField);
		
		JComboBox RefNocomboBox = new JComboBox();
		RefNocomboBox.setBounds(132, 62, 296, 20);
		frame.getContentPane().add(RefNocomboBox);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdatePatient myupdate = new UpdatePatient();
				myupdate.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(66, 290, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewPatient mypatient = new NewPatient();
				mypatient.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(248, 290, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Hospital myhospital = new Hospital();
				myhospital.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(498, 290, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblIdentityNo = new JLabel("Identity No.");
		lblIdentityNo.setBounds(21, 153, 101, 14);
		frame.getContentPane().add(lblIdentityNo);
		
		JComboBox GendercomboBox = new JComboBox();
		GendercomboBox.setBounds(132, 175, 296, 20);
		frame.getContentPane().add(GendercomboBox);
		
		JComboBox CategorycomboBox = new JComboBox();
		CategorycomboBox.setBounds(132, 200, 296, 20);
		frame.getContentPane().add(CategorycomboBox);
		
		JLabel label = new JLabel("Cellphone");
		label.setBounds(458, 61, 129, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Email");
		label_1.setBounds(458, 90, 118, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Address");
		label_2.setBounds(458, 118, 118, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Experience");
		label_3.setBounds(458, 143, 118, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Highest Participation");
		label_4.setBounds(458, 168, 118, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Awards");
		label_5.setBounds(458, 193, 129, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Other Skills");
		label_6.setBounds(458, 228, 123, 14);
		frame.getContentPane().add(label_6);
	}

}

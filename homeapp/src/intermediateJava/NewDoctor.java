package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewDoctor {

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
					NewDoctor window = new NewDoctor();
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
	public NewDoctor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Doctor's Ref No.");
		label.setBounds(26, 81, 101, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Doctor's Name(s)");
		label_1.setBounds(26, 113, 101, 14);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(137, 110, 205, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 135, 205, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("Doctor's Surname");
		label_2.setBounds(26, 138, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Cellphone");
		label_3.setBounds(26, 163, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(26, 188, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Address");
		label_5.setBounds(26, 213, 101, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("HPCSA Registration");
		label_6.setBounds(26, 238, 101, 14);
		frame.getContentPane().add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(137, 160, 205, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(137, 185, 205, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(137, 210, 205, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(137, 238, 205, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_7 = new JLabel("University");
		label_7.setBounds(363, 81, 129, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("UnderGrad Qualification");
		label_8.setBounds(363, 110, 118, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("PostGrad Qualification");
		label_9.setBounds(363, 138, 118, 14);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Experience");
		label_10.setBounds(363, 163, 118, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Highest Participation");
		label_11.setBounds(363, 188, 118, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Awards");
		label_12.setBounds(363, 213, 129, 14);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Other Skills");
		label_13.setBounds(363, 248, 123, 14);
		frame.getContentPane().add(label_13);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(545, 78, 159, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(545, 110, 159, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(545, 135, 159, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(545, 160, 159, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(545, 185, 159, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(545, 213, 150, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(545, 245, 150, 20);
		frame.getContentPane().add(textField_12);
		
		JButton button = new JButton("Add");
		button.setBounds(199, 301, 89, 23);
		frame.getContentPane().add(button);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				
				Doctor mydoc = new Doctor();
				mydoc.frame.setVisible(true);
	    		frame.dispose();
				
			}
		});
		btnBack.setBounds(361, 301, 89, 23);
		frame.getContentPane().add(btnBack);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(137, 78, 205, 20);
		frame.getContentPane().add(textField_13);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(499, 301, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewDoctorsDetails = new JLabel("     New       Doctor's Details");
		lblNewDoctorsDetails.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewDoctorsDetails.setBounds(194, 11, 287, 33);
		frame.getContentPane().add(lblNewDoctorsDetails);
	}

}

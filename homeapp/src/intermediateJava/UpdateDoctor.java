package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Font;

public class UpdateDoctor {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateDoctor window = new UpdateDoctor();
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
	public UpdateDoctor() {
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
		
		JLabel label = new JLabel("Doctor's Ref No.");
		label.setBounds(26, 58, 101, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Doctor's Name(s)");
		label_1.setBounds(25, 86, 101, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Doctor's Surname");
		label_2.setBounds(25, 111, 101, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Cellphone");
		label_3.setBounds(25, 136, 101, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Email");
		label_4.setBounds(25, 161, 101, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Address");
		label_5.setBounds(25, 186, 101, 14);
		frame.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(136, 83, 276, 20);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 108, 276, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(136, 133, 276, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(136, 158, 276, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(136, 183, 276, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_6 = new JLabel("HPCSA Registration");
		label_6.setBounds(25, 211, 101, 14);
		frame.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(136, 211, 276, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel label_7 = new JLabel("University");
		label_7.setBounds(422, 58, 129, 14);
		frame.getContentPane().add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(593, 55, 281, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(593, 83, 281, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel label_8 = new JLabel("UnderGrad Qualification");
		label_8.setBounds(422, 86, 118, 14);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("PostGrad Qualification");
		label_9.setBounds(422, 111, 118, 14);
		frame.getContentPane().add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(593, 108, 281, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel label_10 = new JLabel("Experience");
		label_10.setBounds(422, 136, 118, 14);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Highest Participation");
		label_11.setBounds(422, 161, 118, 14);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Awards");
		label_12.setBounds(422, 186, 129, 14);
		frame.getContentPane().add(label_12);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(593, 133, 281, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(593, 158, 281, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(593, 183, 281, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel label_13 = new JLabel("Other Skills");
		label_13.setBounds(422, 211, 123, 14);
		frame.getContentPane().add(label_13);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(593, 208, 281, 20);
		frame.getContentPane().add(textField_12);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnNewButton.setBounds(120, 283, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Doctor mydoc = new Doctor();
				mydoc.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnBack.setBounds(462, 283, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(137, 55, 275, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblUpdateDetails = new JLabel("Update Details");
		lblUpdateDetails.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUpdateDetails.setBounds(332, 11, 180, 33);
		frame.getContentPane().add(lblUpdateDetails);
	}
}

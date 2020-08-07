package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class BookAppointment {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookAppointment window = new BookAppointment();
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
	public BookAppointment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 650, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 614, 539);
		frame.getContentPane().add(lblNewLabel);
		
		Label label = new Label("Make an Appointment");
		label.setBackground(Color.BLUE);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 28));
		label.setBounds(26, 36, 598, 41);
		lblNewLabel.add(label);
		
		Label label_1 = new Label("Name");
		label_1.setBackground(Color.BLUE);
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(26, 123, 62, 22);
		lblNewLabel.add(label_1);
		
		Label label_2 = new Label("Surname");
		label_2.setBackground(Color.BLUE);
		label_2.setForeground(Color.WHITE);
		label_2.setBounds(26, 175, 62, 22);
		lblNewLabel.add(label_2);
		
		Label label_3 = new Label("Condition");
		label_3.setBackground(Color.BLUE);
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(26, 228, 62, 22);
		lblNewLabel.add(label_3);
		
		Label label_4 = new Label("Date");
		label_4.setBackground(Color.BLUE);
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(26, 283, 62, 22);
		lblNewLabel.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(198, 125, 188, 20);
		lblNewLabel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 177, 188, 20);
		lblNewLabel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(198, 228, 188, 20);
		lblNewLabel.add(textField_2);
		textField_2.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(204, 304, 192, 20);
		frame.getContentPane().add(dateChooser);
	}
}

package intermediateJava;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;

public class Hospital {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital window = new Hospital();
					window.frame.setVisible(true);
					window.frame.setResizable(false);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hospital() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(600, 600, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		frame.getContentPane().setLayout(null);
		
		JLabel hospitalImagelabel = new JLabel(icon);
		hospitalImagelabel.setBounds(229, 128, 745, 422);
		frame.getContentPane().add(hospitalImagelabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 128, 190, 426);
		panel.setBackground(new Color(0, 0, 255));
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLUE));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Record Explorer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBackground(new Color(240, 255, 255));
		lblNewLabel_1.setForeground(new Color(240, 255, 255));
		lblNewLabel_1.setBounds(10, 11, 170, 28);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(32, 178, 170));
		comboBox.setBounds(10, 50, 170, 20);
		panel.add(comboBox);
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Patient_Registration", "Admit", "Discharge", "UPDATE", "Report"}));
		
		JComboBox DoctorscomboBox = new JComboBox();
		DoctorscomboBox.setBackground(new Color(32, 178, 170));
		DoctorscomboBox.setBounds(10, 69, 170, 20);
		panel.add(DoctorscomboBox);
		DoctorscomboBox.setModel(new DefaultComboBoxModel(new String[] {"Staff", "Update_Staff", "New_Staff", "Report"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(32, 178, 170));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Accounts"}));
		comboBox_1.setBounds(10, 86, 170, 20);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Staff On-duty  ");
		lblNewLabel_2.setForeground(new Color(240, 255, 255));
		lblNewLabel_2.setBackground(new Color(240, 255, 240));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 140, 151, 20);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(new Color(32, 178, 170));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Doctors", "Nurses", "Physiotherapists"}));
		comboBox_3.setBounds(10, 171, 170, 20);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_3 = new JLabel("Pharmacy");
		lblNewLabel_3.setForeground(new Color(240, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 202, 152, 14);
		panel.add(lblNewLabel_3);
		

		
		DoctorscomboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				if(DoctorscomboBox.getSelectedItem().equals("UpdateDoctor"))
				{
					UpdateDoctor update = new UpdateDoctor();
					update.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}
				
				if(DoctorscomboBox.getSelectedItem().equals("Report"))
				{
					Doctor doctor = new Doctor();
					doctor.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}
				if(DoctorscomboBox.getSelectedItem().equals("NewDoctor"))
				{
					NewDoctor newDoc = new NewDoctor();
					newDoc.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}				
				
				if(DoctorscomboBox.getSelectedItem().equals("NewDoctor"))
				{
					NewDoctor newDoc = new NewDoctor();
					newDoc.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}	
				
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().equals("Admit"))
				{
					NewPatient admit = new NewPatient();
					admit.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}
				
				if(comboBox.getSelectedItem().equals("UPDATE"))
				{
					UpdatePatient update = new UpdatePatient();
					update.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}
				
				if(comboBox.getSelectedItem().equals("Report"))
				{
					Patients patients = new Patients();
					patients.frame.setVisible(true);
					//dispose();
					frame.dispose();
				}
			}
		});
		
		JButton ChronicButton = new JButton("Chronic");
		ChronicButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Phamacy doctor = new Phamacy();
				doctor.frame.setVisible(true);
				//dispose();
				frame.dispose();
			}
		});
		ChronicButton.setBounds(10, 227, 151, 23);
		panel.add(ChronicButton);
		
		JButton OnceOffMeds = new JButton("Once_Off_Meds");
		OnceOffMeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OnceOFFMeds doctor = new OnceOFFMeds();
				doctor.frame.setVisible(true);
				//dispose();
				frame.dispose();
				
			}
		});
		OnceOffMeds.setBounds(10, 251, 151, 23);
		panel.add(OnceOffMeds);
		
		JLabel lblNewLabel = new JLabel("     CHARLIE'S  MEDICLINIC MANAGEMENT");
		lblNewLabel.setBounds(206, 11, 648, 57);
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBackground(Color.BLUE);
		frame.getContentPane().add(lblNewLabel);
	}
}

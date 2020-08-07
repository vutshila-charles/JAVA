package intermediateJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Phamacy {

	JFrame frame;
	private JTextField textRefNo;
	private JTextField textDosage;
	private JTextField textNoTablets;
	private JTextField textindication;
	private JLabel lblindications;
	private JLabel lblIssueDate;
	private JLabel pharmacology;
	private JLabel lblExpDate;
	private JTextField textIssueDate;
	private JTextField textExpDate;
	private JTextField textclinical;
	private JTextField textContra;
	private JLabel lblExtraInfo;
	private JLabel lblSideEffects;
	private JTextField textEffects;
	private JTextField textGuide;
	private JLabel lblguide;
	private JLabel lblStorage;
	private JTextField textStorage;
	private JTextField textAdmin;
	private JLabel lblAdmin;
	private JLabel lblWarning;
	private JTextField textWarning;
	private JTextField textDrNo;
	private JLabel lblDoctorsNhsNo;
	private JLabel lblPatientId;
	private JTextField textPatient;
	private JComboBox jjcomboBox;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Phamacy window = new Phamacy();
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
	public Phamacy() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBackground(Color.BLUE);
		frame.setBounds(400, 400, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name of Tablets:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 11, 108, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblReferenceNo = new JLabel("Reference No.");
		lblReferenceNo.setForeground(Color.WHITE);
		lblReferenceNo.setBounds(10, 36, 86, 14);
		frame.getContentPane().add(lblReferenceNo);
		
		JLabel lbldose = new JLabel("Dosage(mg):");
		lbldose.setForeground(Color.WHITE);
		lbldose.setBounds(10, 61, 86, 14);
		frame.getContentPane().add(lbldose);
		
		textRefNo = new JTextField();
		textRefNo.setBounds(189, 33, 329, 20);
		frame.getContentPane().add(textRefNo);
		textRefNo.setColumns(10);
		
		textDosage = new JTextField();
		textDosage.setBounds(189, 58, 329, 20);
		frame.getContentPane().add(textDosage);
		textDosage.setColumns(10);
		
		textNoTablets = new JTextField();
		textNoTablets.setBounds(189, 83, 329, 20);
		frame.getContentPane().add(textNoTablets);
		textNoTablets.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Number of Tablets:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(10, 86, 118, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textindication = new JTextField();
		textindication.setBounds(189, 108, 329, 20);
		frame.getContentPane().add(textindication);
		textindication.setColumns(10);
		
		lblindications = new JLabel("Indications");
		lblindications.setForeground(Color.WHITE);
		lblindications.setBounds(10, 111, 86, 14);
		frame.getContentPane().add(lblindications);
		
		lblIssueDate = new JLabel("Issue Date:");
		lblIssueDate.setForeground(Color.WHITE);
		lblIssueDate.setBounds(10, 136, 86, 14);
		frame.getContentPane().add(lblIssueDate);
		
		pharmacology = new JLabel("Clinical Pharmacology");
		pharmacology.setForeground(Color.WHITE);
		pharmacology.setBounds(10, 186, 118, 14);
		frame.getContentPane().add(pharmacology);
		
		lblExpDate = new JLabel("Exp Date:");
		lblExpDate.setForeground(Color.WHITE);
		lblExpDate.setBounds(10, 161, 86, 14);
		frame.getContentPane().add(lblExpDate);
		
		textIssueDate = new JTextField();
		textIssueDate.setColumns(10);
		textIssueDate.setBounds(189, 133, 329, 20);
		frame.getContentPane().add(textIssueDate);
		
		textExpDate = new JTextField();
		textExpDate.setColumns(10);
		textExpDate.setBounds(189, 161, 329, 20);
		frame.getContentPane().add(textExpDate);
		
		textclinical = new JTextField();
		textclinical.setColumns(10);
		textclinical.setBounds(189, 186, 329, 20);
		frame.getContentPane().add(textclinical);
		
		jjcomboBox = new JComboBox();
		jjcomboBox.setModel(new DefaultComboBoxModel(new String[] {"iuprofen", "co-codamo", "paracetamol", "grandpa", "amlodipine","Trogazo"}));
				
				
				
		jjcomboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if(jjcomboBox.getSelectedItem().equals("Trogazo"))
				{
					  textRefNo.setText("9jinj");
					  textDosage.setText("2,000 mg");
					  textNoTablets.setText("");
					  textindication.setText("Human immunodeficiency virus type 1");
					  textIssueDate.setText("khjn");
					  textExpDate.setText("kyb");
					  textclinical.setText("jhb");
					  textContra.setText("ugutgv");
					  textEffects.setText("hugbh");
					  textGuide.setText("hbgvf");
					  textStorage.setText("hbgfc");
					  textAdmin.setText("muuybh");
					  textWarning.setText("mhbgvfvg");
					  textDrNo.setText("bbyvf ");
					  textPatient.setText("ubyvyy");
					 
					 
					
				}
				
			}
		}
		);
		
		jjcomboBox.setBounds(189, 8, 329, 20);
		frame.getContentPane().add(jjcomboBox);
		
		textContra = new JTextField();
		textContra.setColumns(10);
		textContra.setBounds(688, 33, 266, 20);
		frame.getContentPane().add(textContra);
		
		lblExtraInfo = new JLabel("Contraindications");
		lblExtraInfo.setForeground(Color.WHITE);
		lblExtraInfo.setBounds(542, 36, 99, 14);
		frame.getContentPane().add(lblExtraInfo);
		
		lblSideEffects = new JLabel("Side Effects:");
		lblSideEffects.setForeground(Color.WHITE);
		lblSideEffects.setBounds(542, 11, 86, 14);
		frame.getContentPane().add(lblSideEffects);
		
		textEffects = new JTextField();
		textEffects.setColumns(10);
		textEffects.setBounds(688, 8, 266, 20);
		frame.getContentPane().add(textEffects);
		
		textGuide = new JTextField();
		textGuide.setColumns(10);
		textGuide.setBounds(688, 83, 266, 20);
		frame.getContentPane().add(textGuide);
		
		lblguide = new JLabel("Medication Guide");
		lblguide.setForeground(Color.WHITE);
		lblguide.setBounds(542, 86, 99, 14);
		frame.getContentPane().add(lblguide);
		
		lblStorage = new JLabel("Storage:");
		lblStorage.setForeground(Color.WHITE);
		lblStorage.setBounds(542, 61, 86, 14);
		frame.getContentPane().add(lblStorage);
		
		textStorage = new JTextField();
		textStorage.setColumns(10);
		textStorage.setBounds(688, 58, 266, 20);
		frame.getContentPane().add(textStorage);
		
		textAdmin = new JTextField();
		textAdmin.setColumns(10);
		textAdmin.setBounds(688, 133, 266, 20);
		frame.getContentPane().add(textAdmin);
		
		lblAdmin = new JLabel("Administration");
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.setBounds(542, 136, 131, 14);
		frame.getContentPane().add(lblAdmin);
		
		lblWarning = new JLabel("Warning");
		lblWarning.setForeground(Color.WHITE);
		lblWarning.setBounds(542, 111, 108, 14);
		frame.getContentPane().add(lblWarning);
		
		textWarning = new JTextField();
		textWarning.setColumns(10);
		textWarning.setBounds(688, 108, 266, 20);
		frame.getContentPane().add(textWarning);
		
		textDrNo = new JTextField();
		textDrNo.setColumns(10);
		textDrNo.setBounds(688, 183, 266, 20);
		frame.getContentPane().add(textDrNo);
		
		lblDoctorsNhsNo = new JLabel("Doctor's NHS No:");
		lblDoctorsNhsNo.setForeground(Color.WHITE);
		lblDoctorsNhsNo.setBounds(542, 186, 118, 14);
		frame.getContentPane().add(lblDoctorsNhsNo);
		
		lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setForeground(Color.WHITE);
		lblPatientId.setBounds(542, 161, 118, 14);
		frame.getContentPane().add(lblPatientId);
		
		textPatient = new JTextField();
		textPatient.setColumns(10);
		textPatient.setBounds(688, 158, 266, 20);
		frame.getContentPane().add(textPatient);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(10, 264, 944, 35);
		frame.getContentPane().add(panel);
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			
			
	
			public void actionPerformed(ActionEvent e) {
				textRefNo.setText("");
				  textDosage.setText(" ");
				  textNoTablets.setText("");
				  textindication.setText(" ");
				  textIssueDate.setText("");
				  textExpDate.setText("");
				  textclinical.setText("");
				  textContra.setText("");
				  textEffects.setText("");
				  textGuide.setText("");
				  textStorage.setText("");
				  textAdmin.setText("");
				  textWarning.setText("");
				  textDrNo.setText(" ");
				  textPatient.setText("");
				
				
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnAdd = new JButton("Update");
		panel.add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
		JButton btnDoctor = new JButton("AddMed");
		panel.add(btnDoctor);
		
		JButton btnBack = new JButton("Back");
		panel.add(btnBack);
	}
}

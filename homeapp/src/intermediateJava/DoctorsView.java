package intermediateJava;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class DoctorsView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorsView window = new DoctorsView();
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
	public DoctorsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 139));
		frame.setBounds(400, 400, 850, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon icon = new ImageIcon("clinic.jpg");
		
		JLabel lblNewLabel = new JLabel(icon);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setBounds(10, 11, 814, 339);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel.add(lblNewLabel_1);
		lblNewLabel_1.setBounds(83, 55, 90, 14);
		lblNewLabel_1.setVisible(true);
		
		JLabel DocsName = new JLabel("New label");
		DocsName.setForeground(new Color(255, 255, 255));
		DocsName.setBounds(83, 80, 90, 14);
		lblNewLabel.add(DocsName);
		DocsName.setVisible(true);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(83, 106, 90, 14);
		lblNewLabel.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(true);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(83, 126, 90, 14);
		lblNewLabel_3.setVisible(true);
		lblNewLabel.add(lblNewLabel_3);
		
		
		
		
	}
}

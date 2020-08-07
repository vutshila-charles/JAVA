package programming3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Capture extends JFrame {

	private JLabel vehicle;
	private JLabel name;
	private JLabel color;
	private JLabel region;
	private JLabel registration;
	private JTextField VehicType;
	private JTextField carname;
	private JTextField carColor;
	private JTextField place;
	private JTextField number1;
	private JButton capture;
	private JButton back;
	private JButton clear;
	String carT;
	
	
	Vehicle[] capVehicle = new Vehicle[10];
	int VehCount =0;
	public String carN;
	public String carR;
	public int carNum;
	
	public Capture(Vehicle[] cap, int Count)
	{
		super("Capture");
		setLayout(null);
		capVehicle = cap;
		VehCount =Count;
		
		
		vehicle = new JLabel("Vehicle Type");
		vehicle.setBounds(10,10,200,30);
		add(vehicle);
		
		name = new JLabel("Car name");
		name.setBounds(10,40,200,30);
		add(name);
		
		color = new JLabel("Car Color");
		color.setBounds(10,70,200,30);
		add(color);
		
		region = new JLabel("Residence");
		region.setBounds(10,100,200,30);
		add(region);
		
		registration = new JLabel("RegNumber");
		registration.setBounds(10,130,200,30);
		add(registration);
		
		VehicType = new JTextField(10);
		VehicType.setBounds(140,10,150,20);
		add(VehicType);
		carname = new JTextField(10);
		carname.setBounds(140,40,150,20);
		add(carname);
		
		carColor = new JTextField(10);
		carColor.setBounds(140,70,150,20);
		add(carColor);
		
		place = new JTextField(10);
		place.setBounds(140,100,150,20);
		add(place);
		
		number1 = new JTextField(10);
		number1.setBounds(140,130,150,20);
		add(number1);
		
		capture = new JButton("capture");
		capture.setBounds(10,170,90,30);
		add(capture);
		
		back = new JButton("back");
		back.setBounds(100,170,90,30);
		add(back);
		
		clear =  new JButton("clear");
		clear.setBounds(190,170,90,30);
		add(clear);
		
		Buttonhandler hand = new Buttonhandler();
		back.addActionListener(hand);
		clear.addActionListener(hand);
	    capture.addActionListener(hand);
		
	}
	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			
			
			
			if(event.getSource()==back)
			{
				dispose();
				MainGui mygui = new MainGui(capVehicle,VehCount);
				mygui.setSize(400,400);
				mygui.setVisible(true);
				mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
			else if(event.getSource()==clear)
			{
				VehicType.setText("");
				carname.setText("");
				carColor.setText("");
				place.setText("");
				number1.setText("");
			}
			else if(event.getSource()==capture)
			{
				Validation validate = new Validation();
				
				
				
	
				
				String type = VehicType.getText();
				if(validate.valid_3(type)) 
				{
					carT=type;
				}
				else {
					return;
				}
				
				
				
				
				String name =carname.getText();
				if(validate.Valid_2(name))
				{
					carN=name;
				}
				else
				{
					return;
				}
				String color = carColor.getText();
				
				String region = place.getText();
				if(validate.valid_4(region))
				{
				carR=region;	
				}
				else
				{
					return;
				}
				
				String number = number1.getText();
				if(validate.Valid(number))
				{
					carNum = Integer.parseInt(number);
				}
				else
				{
					return;
				}
				
				Vehicle myvehicle = new Vehicle(carT,carN,color,carR,carNum);
				capVehicle[VehCount] = myvehicle;
				VehCount++;
				
				
				VehicType.setText("");
				carname.setText("");
				carColor.setText("");
				place.setText("");
				number1.setText("");
				JOptionPane.showMessageDialog(null,"You have successfully capture your Vehicle details");
			}
		}
	}
}

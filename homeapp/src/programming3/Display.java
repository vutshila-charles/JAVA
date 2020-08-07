package programming3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Display extends JFrame {
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
	private JButton next;
	private JButton back;
	private JButton clear;
	
	Vehicle[] dcapVehicle = new Vehicle[10];
	int VehCount =0;
	int count =0 ;
	Vehicle myVehcle = new Vehicle();
	public Display(Vehicle[] cap,int Count) {
		super("Display");
		dcapVehicle = cap;
		VehCount =Count;
		
	
		setLayout(null);

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
		
		next = new JButton("Next");
		next.setBounds(10,170,90,30);
		add(next);
		
		back = new JButton("back");
		back.setBounds(100,170,90,30);
		add(back);
		
		clear =  new JButton("clear");
		clear.setBounds(190,170,90,30);
		add(clear);
		
		
		Vehicle myVehcle = new Vehicle();
		myVehcle=dcapVehicle[count];
		VehicType.setText(myVehcle.getType());
		carname.setText(myVehcle.getName());
		carColor.setText(myVehcle.getColor());
		place.setText(myVehcle.getRegion());
		number1.setText(Integer.toString(myVehcle.getNumber()));
		
		
		Buttonhandler hand = new Buttonhandler();
		back.addActionListener(hand);
		clear.addActionListener(hand);
		next.addActionListener(hand);
	}
	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==back)
			{
				
				MainGui mygui = new MainGui(dcapVehicle,VehCount);
				mygui.setSize(400,400);
				mygui.setVisible(true);
				mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				dispose();
			}
			else if(event.getSource()==clear)
			{
				VehicType.setText("");
				carname.setText("");
				carColor.setText("");
				place.setText("");
				number1.setText("");
			}
			else if(event.getSource()==next)
			{
				try {
					//Capture myguii = new Capture(dcapVehicle,VehCount);
					count++;
				
					myVehcle=dcapVehicle[count];
					VehicType.setText(myVehcle.getType());
					carname.setText(myVehcle.getName());
					carColor.setText(myVehcle.getColor());
					place.setText(myVehcle.getRegion());
					number1.setText(Integer.toString(myVehcle.getNumber()));
					
				}
				catch(NullPointerException exc)
				{
					JOptionPane.showMessageDialog(null,"End","",JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		
		}
	}



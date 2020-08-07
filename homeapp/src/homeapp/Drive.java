package homeapp;

import javax.swing.*;

public class Drive {

	public static void main(String[] args)
	{
		JFrame f = new JFrame("HomeAPP");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ClockPane pane = new ClockPane();
		f.add(pane);
		f.setSize(400,250);
		f.setVisible(true);
	}
}

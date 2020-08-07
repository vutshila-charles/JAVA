package homeapp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ClockPane extends JPanel{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25,100,30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("THis is a example", 25, 120);
		//Tsek
		
	}

}

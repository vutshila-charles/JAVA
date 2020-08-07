package homeapp.SAMUELS_hLONGWANE_SEARCHING;
//HLONGWANE AND SAMUELS
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class ReadFile extends JFrame{
	private String output;

	private JTextArea ReadList;
	private JPanel panel;
	private JScrollPane scrollerJScrollPane;
	
	 public ReadFile() throws IOException
	    {
			super("Read from File");
			setLayout(new GridLayout(1,1));

			JButton open = new JButton();
			JFileChooser fc = new JFileChooser();
			//fc.setCurrentFileDirectory(new File(System.getProperty("user.home")));
			fc.setDialogTitle("Select File");
			fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			if(fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION);
			{
				System.out.println("You chose: "+fc.getSelectedFile().getAbsolutePath());
			}

			File file = fc.getSelectedFile();


	        //String file = "Save.txt";				//text file name
	        StringBuilder sb = new StringBuilder();		//string containing data recorded into the text file EventLogger
	        try
	        {
	            FileReader reader = new FileReader(  file );		//reading text file
	            BufferedReader buff = new BufferedReader(reader);	//for reading text file containing more than one line of text
	            while( true )			//for as log as there is a next line of text in the text file
	            {
	                String line = buff.readLine();
	                if(line==null)
	                break;
	                sb.append("\n").append(line);
	            }
	        } catch (FileNotFoundException | NullPointerException | NoSuchElementException ex) {}
	            String allFile = sb.toString();

	        panel = new JPanel(new GridLayout( 1, 1));

	    	ReadList  = new JTextArea();
	    	ReadList.setEditable(false);
	    	ReadList.setText(allFile+"\n");

	    	scrollerJScrollPane = new JScrollPane(ReadList);
	    	panel.add(scrollerJScrollPane);

	    	add(panel);
	    }

}

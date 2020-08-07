package intermediateJava;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import programming3.Pharm;



public class Server extends JFrame
{
	private JTextField usertext;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private ServerSocket server;
	private Socket connection;
	private JButton admin ;
	
	public Server()
	{
		super("Charlie Instant Messenger");
		usertext = new JTextField();
		admin = new JButton("Login");
		usertext.setEditable(false);
		
		usertext.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent event) {
						sendMessage(event.getActionCommand());//send text to the chat window
						usertext.setText("");
						
					}
				}
				);
		add(usertext,BorderLayout.NORTH);
		chatWindow = new JTextArea();
		
		
		add(admin,BorderLayout.WEST);
		
		add(new JScrollPane(chatWindow));
		setSize(300,300);
		setVisible(true);
		Buttonhandler handler = new Buttonhandler();
		admin.addActionListener(handler);
	}
	private class Buttonhandler implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==admin)
			{
				dispose();
				Pharm.main(null);
				
				
			}
		}
	}	
	public void startRunning() {
		try {
			server = new ServerSocket(6789,100);
			while(true) {
				try
				{
					waitForConnection();
					setupStreams();
					whileChatting();
				}
				catch(EOFException eofException)
				{
					showMessage("\n server ended connectio");
				}finally {
					closeCrap();
				}
			}
		}catch(IOException ioException) {
			ioException.printStackTrace();
			
		}
	}
	//wait for connection method
	private void waitForConnection() throws IOException
	{
		showMessage("Loading.........\n");
		connection = server.accept();//the socket allows the connection to occur
		showMessage(" Now connected to" +connection.getInetAddress().getHostName());
	}
	//get stream to send and recieve data 
 	private void setupStreams() throws IOException
 	{
 		output = new ObjectOutputStream(connection.getOutputStream());
 		output.flush();
 		input = new ObjectInputStream(connection.getInputStream());
 		showMessage("\n Streams are now setup \n");
 	}
 	//during the chat conversation
 	private void whileChatting() throws IOException
 	{
 		String message = "You are now connected ";
 		sendMessage(message);
 		ableToType(true);
 		do
 		{
 			//have a conversation
 			try 
 			{
 				message = (String) input.readObject();//from partner
 				showMessage("\n" +message);
 			}
 			catch(ClassNotFoundException classNotFoundException)
 			{
 				showMessage("\n one day you will win kid, keep pushing  ");
 			}
 			
 		}
 		while(!message.contentEquals("CLIENT -END"));
 	}
 	//close streams when you done
 	private void closeCrap()
 	{
 		showMessage("\n closing connections......\n");
 		ableToType(false);
 		
 		try {
 			output.close();
 			input.close();
 			connection.close();// close connection between two computers
 			
 		}catch(IOException ioException)
 		{
 			ioException.printStackTrace();
 		}
 		
 	}
 	//send a message to client
 	private void sendMessage(String message) {
 		try {
 		output.writeObject("SERVER -"+message);
 		output.flush();//push everything to the user
 		showMessage("\n YOU- "+message);
 	}catch(IOException ioException) {
 		//234 cant find message
 		chatWindow.append("\n ERROR :234");
 		
 	}
}
 	
 	//updates chatwindow
 	private void showMessage(final String text)
 	{
 		//update parts of the GUi, thread that update the text in the chat window 
 	SwingUtilities.invokeLater(
 			new Runnable() {
 				public void run()
 				{
 					chatWindow.append(text);//new line of text on the chat window,
 					
 				}
 			}
 			);	 
 	}
 	
 	//allows user to add user , type into the box
 	private void ableToType(final boolean tof)
 	{
 		SwingUtilities.invokeLater(
 				new Runnable() {
 					public void run() {
 						usertext.setEditable(tof);
 						//chatWindow.append(text);
 					}
 				}
 				);
 	}
 	
}

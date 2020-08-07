package intermediateJava;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String message ="";
	private Socket connection;
	private String serverIP;
	
	
	public Client(String host)
	{
		super("Client");
		serverIP = host;//parsing we set the variable to be equal to the serverr
		userText = new JTextField();
		userText.setEditable(false);
		userText.addActionListener(
				new ActionListener() {
				public void actionPerformed(ActionEvent event)
				{
					sendMessage(event.getActionCommand());//send text 
					userText.setText("");
					
				
				}
				}
		);
		add(userText,BorderLayout.NORTH);
		chatWindow =  new JTextArea();
		add(new JScrollPane(chatWindow), BorderLayout.CENTER);
		setSize(300,150);
		setVisible(true);
			
		}
	
	// connect to server 
	public void startRunning()
	{
		try {
			connectToServer();//responsible for connecting to one computer
			setupStreams();
			whileChatting();
			
			
		}catch(EOFException eofException)
		{
			showMessage("\n Client terminated the connection");
		}catch(IOException ioException)
		{
			ioException.printStackTrace();
			
		}finally {
			closeCrap();
		}
	}
	// connect to server 
	private void connectToServer() throws IOException{
		showMessage("Attempting connection.....\n");
		connection = new Socket(InetAddress.getByName(serverIP),6789);
		showMessage("Connect to:" +connection.getInetAddress().getHostName());
		
	}
	//set up streams to send and receive messge
	private void setupStreams() throws IOException
	{
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\n dude your streams are good to go \n");
		 
	}
	private void whileChatting() throws IOException
	{
		ableToType(true);
		do {
			try {
				message =(String) input.readObject();
				showMessage("\n"+ message);
				
			}catch(ClassNotFoundException classNotfoundException)
			{
				showMessage("\n I dont know that object type");
			}
			 
		  }while(!message.equals("SERVER - END"));
	}
	// close the streams and sockets
	private void closeCrap()
	{
		showMessage("\n closing crap down.....");
		ableToType(false);
		try 
		{
			output.close();
			input.close();
			connection.close();
		}catch(IOException ioException)
		{
			ioException.printStackTrace();
		}
	}
		//send message to server 
	private void sendMessage(String message)
	{
		try {
			output.writeObject("CLIENT - " +message);
			output.flush();
			showMessage("\nYOU -" +message);
			
		}catch(IOException ioException)
		{
			chatWindow.append("\n GTM-T97R78");
		}
	}
	//change or update chats
	private void showMessage(final String m)
	{
		SwingUtilities.invokeLater(
				new Runnable()
				{
				public void run()
				{
					chatWindow.append(m);
				}
				}
				);
	}
	private void ableToType(final boolean tof)
	{
		SwingUtilities.invokeLater(
				new Runnable()
				{
				public void run()
				{
					userText.setEditable(tof);
				}
				}
				);
	}
	}



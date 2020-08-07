package intermediateJava;
import javax.swing.*;
public class ServerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		server.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		server.setSize(300,300);
		server.setVisible(true);
		server.startRunning();
	}

}

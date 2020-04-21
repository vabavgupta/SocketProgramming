package Com.Vaibhav;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
	
	    public static void main(String[] args) throws IOException {
	        System.out.println("Server has started");
	        ServerSocket ss =new ServerSocket(5434);
	        System.out.println("Server is Waiting for Client Request");
	        Socket s = ss.accept();
	        System.out.println("Client Connected");

	        BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
	        String str=br.readLine();


	        System.out.println("Client Data :" + str);
	    }
	}



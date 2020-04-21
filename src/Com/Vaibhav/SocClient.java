package Com.Vaibhav;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocClient {
	  

	public static void main(String[] args) throws IOException {
	        String ip="localhost";
	        int port =9999;
	       Socket  s = new Socket(ip,port);

	        String str="vaibhav";
	        OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
	       // os.write(str);
	        PrintWriter out =new PrintWriter(os);
//	        os.flush();
	    }
	}



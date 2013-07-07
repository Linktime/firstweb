import java.io.*;
import java.net.*;

public class talkClient{
	public static void main(String[] args){
		//InputStream in = null;
		//OutputStream out = null;
		try{
			Socket s = new Socket("127.0.0.1", 6665);
			 //in = s.getInputStream();
			// out = s.getOutputStream();
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader ind = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter outd = new PrintWriter(s.getOutputStream());
			 String ddb = null;
			 //outd.println(new String("haha"));
			 
			 ddb = keyboard.readLine();
			 while(!ddb.equals("bye")){
			 	outd.println(ddb);
			 	outd.flush();
			 	System.out.println("Me:"+ddb);
			 	//System.out.println("Server:"+ind.readLine());
			    ddb = keyboard.readLine();
			 }
			 outd.close();
			 ind.close();
			 s.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
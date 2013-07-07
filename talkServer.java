import java.io.*;
import java.net.*;

public class talkServer{
	public static void main(String[] args){
		//InputStream in = null;
		//OutputStream out = null;
		try{
			ServerSocket ss = new ServerSocket(6665);
			Socket s = ss.accept();
			//in = s.getInputStream();
			//out = s.getOutputStream();
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader ind = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter outd = new PrintWriter(s.getOutputStream());
			String db = null;
			//System.out.println("Client:" + ind.readLine());
			db = ind.readLine();
			while(!db.equals("bye")){
				System.out.println("Client:" + db);
				db = ind.readLine();
			}


			/*
			db = keyboard.readLine();
			while(!db.equals("bye")){
				outd.println(db);
				System.out.println("Me:"+db);
				System.out.println("Client:"+ind.readLine());
				db = keyboard.readLine();
			}
			*/
			ind.close();
			outd.close();
			s.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
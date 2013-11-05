package core;

import java.net.InetAddress;

import org.xsocket.connection.IServer;
import org.xsocket.connection.Server;

public class GameMain {

	private static final int port = 8080;
	
	private static IServer svr;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		InetAddress address = InetAddress.getByName("localhost");
		svr = new Server(address,port,new NetController());
		try{
			svr.start();
			System.out.println("·þÎñÆ÷Æô¶¯  " + svr.getLocalAddress() +":" + port); 
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

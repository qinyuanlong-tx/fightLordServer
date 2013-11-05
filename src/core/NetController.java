package core;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.channels.ClosedChannelException;
import java.util.HashMap;
import java.util.Map;

import org.xsocket.MaxReadSizeExceededException;
import org.xsocket.connection.IConnectHandler;
import org.xsocket.connection.IDataHandler;
import org.xsocket.connection.IDisconnectHandler;
import org.xsocket.connection.INonBlockingConnection;

public class NetController extends BaseController implements IConnectHandler,IDataHandler,IDisconnectHandler{

	private Map<String, INonBlockingConnection> connMap = new HashMap<String,INonBlockingConnection>();
	
	@Override
	public boolean onConnect(INonBlockingConnection connection)
			throws IOException, BufferUnderflowException,
			MaxReadSizeExceededException {
		System.out.println(connection.getId() + " connected.");		
		return true;
	}

	@Override
	public boolean onData(INonBlockingConnection connection)
			throws IOException, BufferUnderflowException,
			ClosedChannelException, MaxReadSizeExceededException {

		System.out.println(connection.getId() + " send data:" + connection.readInt());
		connection.write(10);
		
		return true;
	}

	@Override
	public boolean onDisconnect(INonBlockingConnection connection)
			throws IOException {
		// TODO Auto-generated method stub
		System.out.println("some one disconnected.");
		return true;
	}
	
}

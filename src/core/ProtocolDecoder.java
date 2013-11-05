package core;

import java.io.IOException;

import org.xsocket.connection.INonBlockingConnection;

public class ProtocolDecoder extends Notifier{
	
	private static short _playerReady = 1;
	
	private short _playerEnterRoom = 2;
	
	public void decode(INonBlockingConnection connection) throws IOException
	{
		short protocolId = connection.readShort();
		switch(protocolId)
		{
		case 1:
			decodePlayerReady(connection);
			break;
		case 2:
			
		default:
			break;
		}
	}
	
	private void decodePlayerReady(INonBlockingConnection connection) throws IOException
	{
		short isReady = connection.readShort();
		sendEvent(USER_READY_EVENT, isReady);
	}
	
}

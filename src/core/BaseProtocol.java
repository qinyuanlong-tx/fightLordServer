package core;

import java.util.Vector;

public class BaseProtocol {
	
	protected short protocolId;
	
	public static final Vector<BaseProtocol> protocolList = new Vector<BaseProtocol>();
	
	public BaseProtocol(short pId)
	{
		this.protocolId = pId;
	}
	
	public boolean isCommandEqual(short protocolId)
	{
		return this.protocolId == protocolId;
	}
	
	protected void decodeMessage(){}
	
	protected void encodeMessage(){}

}

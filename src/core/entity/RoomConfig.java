package core.entity;

public class RoomConfig {
	
	private static final RoomConfig _roomConfig = new RoomConfig(); 
	/**
	 * ��������
	 */
	private short roomLimit = 100;
	/**
	 * ÿ��������������
	 */
	private short tableLimit = 100;
	
	private Room[] rooms;

	private Table[] tables;

	private RoomConfig() {
		rooms = new Room[roomLimit];
	}
	
	public static RoomConfig getRoomConfig()
	{
		return _roomConfig;
	}

	public short getRoomLimit() {
		return roomLimit;
	}

	public short getTableLimit() {
		return tableLimit;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public Table[] getTables() {
		return tables;
	}

	public void setTables(Table[] tables) {
		this.tables = tables;
	}
	
}

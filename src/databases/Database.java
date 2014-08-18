package databases;

import java.util.HashMap;

public class Database implements DatabaseInterface {
	@Override
	public HashMap<String, String> getDatabase() {
		HashMap<String, String> database = new HashMap<String, String>();
		database.put("1", "1");
		database.put("2", "2");
		database.put("3", "3");
		return database;
	}
}

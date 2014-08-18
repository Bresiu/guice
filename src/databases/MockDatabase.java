package databases;

import java.util.HashMap;

public class MockDatabase implements DatabaseInterface {
	@Override
	public HashMap<String, String> getDatabase() {
		HashMap<String, String> database = new HashMap<String, String>();
		database.put("a", "a");
		database.put("b", "b");
		database.put("c", "c");
		return database;
	}
}

import com.google.inject.Inject;
import com.google.inject.name.Named;
import databases.DatabaseInterface;

import java.util.HashMap;

public class App {
	private DatabaseInterface database;

	@Inject
	public void setDatabase(@Named("prod") DatabaseInterface database) {
		this.database = database;
	}

	public void showDatabase() {
		HashMap<String, String> data = database.getDatabase();
		System.out.println(data.toString());
	}

}

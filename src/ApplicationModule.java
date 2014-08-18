import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import databases.Database;
import databases.DatabaseInterface;
import databases.MockDatabase;

public class ApplicationModule extends AbstractModule {

	@Override
	public void configure() {
		this.bind(String.class).annotatedWith(Names.named("white")).toInstance("WHITE");
		this.bind(String.class).annotatedWith(Names.named("black")).toInstance("BLACK");
		bind(DatabaseInterface.class).annotatedWith(Names.named("prod")).to(Database.class);
		bind(DatabaseInterface.class).annotatedWith(Names.named("dev")).to(MockDatabase.class);
	}
}

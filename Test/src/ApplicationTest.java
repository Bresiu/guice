import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
	Injector injector;

	@Before
	public void setUp() throws Exception {
		injector = Guice.createInjector(new ApplicationModule());
	}

	@After
	public void tearDown() throws Exception {
		injector = null;
	}

	@Test
	public void testGetColor() throws Exception {
		Color color = injector.getInstance(Color.class);
		System.out.println(color.getColor());
	}

}

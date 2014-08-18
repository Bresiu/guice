import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Color {
	@Inject
	@Named("white")
	public String color;

	public String getColor() {
		return color;
	}

}

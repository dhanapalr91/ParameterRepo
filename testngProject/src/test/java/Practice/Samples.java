package Practice;

import org.testng.annotations.Test;

public class Samples {
	@Test
	public void browser() {
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}
}

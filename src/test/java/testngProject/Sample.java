package testngProject;

import org.testng.annotations.Test;

public class Sample {
	@Test
	public void browser() {
		String browser = System.getProperty("browser");
		System.out.println(browser);
	}
}

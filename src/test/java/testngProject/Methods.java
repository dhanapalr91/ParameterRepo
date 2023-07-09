package testngProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods {

	@Test
	public void method1() throws InterruptedException {
		WebDriverManager.chromedriver().browserVersion("114.0.5735.134").setup();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
	//	option.addArguments("window-size=1200x600");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://mail.google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}

package testngProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Books {

public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Books");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//ul[@role='listbox']/li//div[@role='presentation']/span[text()='books']/b[text()=' to read']")).click();
	 Thread.sleep(2000);
	 driver.quit();
}
}

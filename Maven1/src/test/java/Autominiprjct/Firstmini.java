package Autominiprjct;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Firstmini 
{
	@Test
	public void bageecha() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://mybageecha.com/account/login");
		
		secondmini page=new secondmini(driver);
		page.username();
		
		page.password();
		Thread.sleep(3000);
		page.login();
	}


}

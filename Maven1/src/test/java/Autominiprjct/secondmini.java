package Autominiprjct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secondmini 
{

		WebDriver driver;
		public secondmini(WebDriver driver) {
		this.driver=driver;
		}
		public void username()
		{
		driver.findElement(By.xpath("//*[@id=\"customer[email]\"]")).sendKeys("nids95.g@gmail.com");
		}
		public void password()
		{
		driver.findElement(By.xpath("//*[@id=\"customer[password]\"]")).sendKeys("Nids5@mybageecha");
		}
		public void login()
		{
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button")).click();
		}
		
	

}

package localwork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadLink extends LoginButton{


	public void expertview() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
		driver.findElement(By.id("submitbutton")).click();
		
	}
}

package shivsir;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;

public class organization {
	
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
		driver.findElement(By.id("submitButton")).click();
		
	}

}

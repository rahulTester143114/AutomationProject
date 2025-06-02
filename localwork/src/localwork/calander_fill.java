package localwork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander_fill {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
			driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");// user name of login page
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("rahulkumar");// send the password
		driver.findElement(By.xpath("//input[@id='submitButton']")).click(); // click on login button
        driver.findElement(By.xpath("//a[text()='Documents']")).click();
        driver.findElement(By.xpath("//img[@title='Create Document...']")).click();
        driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("Application");
//        driver.quit();
	}

}

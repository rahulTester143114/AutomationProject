package Automation_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {		 WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.get("http://localhost:8888/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys("admin");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys("rahulkumar");
    Thread.sleep(3000);
    driver.findElement(By.id("submitButton")).click();
    System.out.println("hi hello");
//    driver.findElement(By.id("")).click();
  
	}

}

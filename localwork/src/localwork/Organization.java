package localwork;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Organization {
	
	
	public static void main(String[] args) {
			
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8888/");
		
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");// user name of login page
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("rahulkumar");// send the password
	driver.findElement(By.xpath("//input[@id='submitButton']")).click(); // click on login button
	driver.findElement(By.xpath("//a[text()='Organizations']")).click(); // click on the organization link
	WebElement username=driver.findElement(By.xpath("//img[@alt='Create Organization...']"));
	username.click(); //organizatin name
	WebElement name=driver.findElement(By.xpath("//input[@class='detailedViewTextBox']"));
	name.clear();
	name.sendKeys("R.A Groupn of instititute");// organization name 
	driver.findElement(By.xpath("//input[@name='website']")).sendKeys("AR.com");// website name
	driver.findElement(By.xpath("//input[@id='tickersymbol']")).sendKeys("@u"); // ticket symbole
	driver.findElement(By.xpath("//input[@id='employees']")).sendKeys("9"); // empoly name
	driver.findElement(By.xpath("//input[@accesskey='S']")).click();//use to save the line
	
	//driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	//driver.findElement(By.xpath("//a[@class='hdrLink']")).click();
	/*
	 * driver.findElement(By.xpath("//input[@name='search_text']")).
	 * sendKeys("R.A Groupn of instititute"); Set<String>
	 * Windowhand=driver.getWindowHandles(); for(String str:Windowhand) {
	 * driver.switchTo().window(str); String url=driver.getCurrentUrl();
	 * if(url.contains(
	 * "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid="
	 * )) {
	 * 
	 * }
	 * 
	 * }
	 */
	/*
	 * driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"
	 * )).click();
	 * 
	 * Set<String> newindo=driver.getWindowHandles();
	 * 
	 * for(String tt:newindo) { driver.switchTo().window(tt); String
	 * Findurl=driver.getCurrentUrl(); if(Findurl.contains(
	 * "http://localhost:8888/index.php?module=Accounts&action=EditView&return_action=DetailView&parenttab=Marketing"
	 * )) {
	 * 
	 * } }
	 */
	}
}

package localwork;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Printing {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");// user name of login page
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("rahulkumar");// send the password
		driver.findElement(By.xpath("//input[@id='submitButton']")).click(); // click on login button
	
		List<WebElement> listing=driver.findElements(By.xpath("//a"));
		int count=listing.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++) {
		WebElement  totalLink=	      listing.get(i);
		String weElement=totalLink.getText();
		System.out.println("Total link of the page=   "+   weElement);
			
		
		}
	WebElement ClickMore=	driver.findElement(By.xpath("//a[text()=\"More\"]"));

	 Actions act=new Actions(driver);                    
	act.clickAndHold(ClickMore).build().perform();
    List<WebElement> lis=driver.findElements(By.xpath("//a[@class=\"drop_downnew\"]"));
	int num= lis.size();
    System.out.println("number of element under the more="+num);
	for(int b=0;b<=num-1;b++) {
	WebElement totallink=	    lis.get(b);
	String lost=	totallink.getText();
	System.out.println("Total element under more="+lost);
								}
	}
	

}

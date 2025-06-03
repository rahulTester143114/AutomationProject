package shivsir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Booking_Itam {
	
	public static void main(String[] args) { 
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//span[text()='Flight Bookings']")).click();
	    WebElement FromTo=	driver.findElement(By.xpath("//input[@name=\"0-departcity\"]"));
	    //FromTo.click();
	    //FromTo.sendKeys("Mumbai IN");
	   // FromTo.submit();
		
		
		  WebElement inToo=driver.findElement(By.xpath("//input[@class=\"v2VFa- rLGgLC g9KxuM smJZop G+rzy6 z2D4XG\"]"));
		  //inToo.click(); inToo.sendKeys("Mumbai");
		 
	//	inToo.submit();
		
	Actions act=	new Actions(driver);
	WebElement MouseHover=driver.findElement(By.xpath("//input[@name=\"0-datefrom\"]"));
		act.moveToElement(MouseHover).perform();
		act.sendKeys(FromTo, "Mumbai IN");
		act.sendKeys(inToo, "oihui");
	}

}

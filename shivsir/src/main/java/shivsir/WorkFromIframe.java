package shivsir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkFromIframe {
	public static void main(String[] args) {
	ChromeDriver driver=	new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://w3schools.com");
	
	driver.findElement(By.xpath("//a[@id=\"w3-logo\"]")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[@onclick=\'currentSlide(2)\']")).click();
	
	List<WebElement> clickn=driver.findElements(By.xpath("//div[@id=\"subtopnav\"]//a[@class=\"ga-nav\"]"));
	for(int c=0;c<=clickn.size()-1;c++) {
	WebElement xyz=	clickn.get(c);
	System.out.println(xyz.getText());
	xyz.click();
	
	driver.navigate().back();
	clickn=driver.findElements(By.xpath("//div[@id=\"subtopnav\"]//a[@class=\"ga-nav\"]"));
		
	}
	}

}

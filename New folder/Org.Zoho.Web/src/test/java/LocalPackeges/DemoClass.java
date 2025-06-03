package LocalPackeges;

import java.time.Duration;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoClass {
	
	
	   public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("  https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("product_sort_container"));
		   
		Select sel= new Select(driver.findElement(By.className("product_sort_container")));
		sel.selectByIndex(2);


	List<  WebElement >  weExpensive=driver.findElements(By.xpath("//div[@class=\"inventory_item_price\"]"));
	TreeMap<Integer, WebElement> priceMap=  new TreeMap<Integer, WebElement>(Collections.reverseOrder());
	for(WebElement iteam:weExpensive) {
		
	}
		   
		}
		
		
		      }
	   
	   
              
package shivsir;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MorePrint {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
		driver.findElement(By.id("submitButton")).click();
		
	Actions act=	new Actions(driver) ;
	WebElement clickOnMoreButton=driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"]//a[@href=\"javascript:;\"]"));
	act.moveToElement(clickOnMoreButton).build().perform();
		List<WebElement> printAndClick=driver.findElements(By.xpath("//DIV[@id=\"allMenu\"]//a[@id=\"more\"]"))	;
			for(int i=0;i<=printAndClick.size()-1;i++) {
				WebElement xyz=     printAndClick.get(i);
				System.out.println(xyz.getText());
			
				xyz.click();
				Thread.sleep(4000);
				clickOnMoreButton=driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"]//a[@href=\"javascript:;\"]"));
				act.moveToElement(clickOnMoreButton).build().perform();
				printAndClick=driver.findElements(By.xpath("//DIV[@id=\"allMenu\"]//a[@id=\"more\"]"))	;
				Thread.sleep(5000);
			}
			
			//List<WebElement> printAndClic=driver.findElements(By.xpath("//DIV[@id=\"allMenu\"]//a[@id=\"more\"]"));	
			//(int j=0;j<=printAndClic.size()-1;j++) {
				
				
			//}
	}

}

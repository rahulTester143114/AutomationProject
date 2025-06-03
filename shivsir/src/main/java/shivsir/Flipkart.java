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

import net.bytebuddy.asm.Advice.Enter;

public class Flipkart {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");

		WebElement fk=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		fk.sendKeys("mobile");
		fk.click();
		fk.submit();
		//driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		/*
		 * List<WebElement> list=driver.findElements(By.xpath("//a[]")); int
		 * count=list.size(); System.out.println(count);
		 */
	Actions act=	new Actions(driver); 
	
	/*
	 * WebElement
	 * MouseHover=driver.findElement(By.xpath("//span[text()=\"Electronics\"]"));
	 * act.clickAndHold(MouseHover).build().perform();
	 */
	  List<WebElement> Bobile=driver.findElements(By.xpath("//a[@class='CGtC98']//div[@class='KzDlHZ']"));
		int totalmobile=	  Bobile.size();
		System.out.println(totalmobile);
		for(int i=0;i<=totalmobile-1;i++) {
		WebElement totaltext=Bobile.get(i);
	    String text= totaltext.getText();
		System.out.println("mobile text and data="+text);
			
		      
		WebElement fiphone=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		fiphone.click();
		fiphone.clear();
		fiphone.sendKeys("mobile iphone");
		fiphone.submit();
		/*
		 * List<WebElement> iphone=driver.findElements(By.
		 * xpath("//a[@class='CGtC98']//div[@class=\"cPHDOP col-12-12\"]")); int
		 * totaliphone= iphone.size(); System.out.println(totaliphone); for(int
		 * h=0;h<=totaliphone-1;h++) { WebElement zzz=iphone.get(h); String lll=
		 * zzz.getText(); System.out.println("total mobile iphone ="+lll); }
		 */
		}
		}
			
			
}

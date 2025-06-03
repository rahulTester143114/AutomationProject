package shivsir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnMultipleLink {
	
	public static void main(String[] args) {
		
	
	ChromeDriver drive =new ChromeDriver();
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5) );
	drive.get("https://Flipkart.com");
	//WebElement Click=drive.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
	List<WebElement> ClickAndPrint=drive.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//div[@class='_2GaeWJ']"));
	for(int num=0;num<=ClickAndPrint.size()-1;num++) {
	WebElement Print=ClickAndPrint.get(num);
	System.out.println(Print.getText());
		
	Print.click();
	drive.navigate().back();
	//WebElement Click=drive.findElement(By.xpath("//div[@class='_3sdu8W emupdz']"));
	ClickAndPrint=drive.findElements(By.xpath("//div[@class='_3sdu8W emupdz']//div[@class='_2GaeWJ']"));

	}
}
}
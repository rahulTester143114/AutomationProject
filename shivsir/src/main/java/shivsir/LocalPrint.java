package shivsir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalPrint {

	public static void main(String[] args) {
		ChromeDriver driver=	new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
		driver.findElement(By.id("submitButton")).click();
		
		List<WebElement> multipleDataprint=driver.findElements(By.xpath("//div[@id=\"MainMatrix\"]//a"));
		for(int r=0;r<=multipleDataprint.size()-1;r++) {
		WebElement Print=	      multipleDataprint.get(r);
		System.out.println("Print all link="+Print.getText());
		Print.click();
	
		multipleDataprint=driver.findElements(By.xpath("//div[@id=\"MainMatrix\"]//a"));
		}
		
		
	}

}

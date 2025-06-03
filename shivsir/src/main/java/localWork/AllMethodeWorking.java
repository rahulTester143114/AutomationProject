package localWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllMethodeWorking {
	static ChromeDriver driver;
	public static void main(String[] args) {
    driver=	new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

    driver.get("http://localhost:8888/");
    driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
    driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("rahulkumar");
    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
    String  currentTitle=driver.getTitle();
    System.out.println("Title of main Page = "+currentTitle);
    List<WebElement> ButtonVisible=driver.findElements(By.xpath("//td[@class='tabUnSelected']//a"));
    for(int i=0;i<=ButtonVisible.size()-1;i++) {
    	      WebElement Total= ButtonVisible.get(i);
    	          String sa=Total.getText();
	             System.out.println(" print all data ="+sa);
    	            boolean buttonAble= Total.isEnabled();
    	            
    	             
    	            if( buttonAble==true) {
    	            	System.out.println("Button show on the user inter face =");
   	            	
    	            }else {
   	            	System.out.println("Button not show on the user  inter face=");
    	            }
    }
    	            
    	    Actions Ac=  new  Actions(driver);
    	 WebElement ClickMoreButton=   driver.findElement(By.xpath("//a[text()='More']"));
    	Ac.moveToElement(ClickMoreButton).perform();
    	
    	// work on multiple link
    	
    	List<WebElement> WorkOnMoreButton=driver.findElements(By.xpath("//a[@id=\"more\"]"));
    	 int totalSize= WorkOnMoreButton.size();
    	 System.out.println(totalSize);
    	 for(int a=0;a<=totalSize-1;a++) {
    	       WebElement clickonMultiple= WorkOnMoreButton.get(a);
    	      // WorkOnMoreButton=driver.findElements(By.xpath("//a[@id=\"more\"]"));
    	        String textOfLink=    clickonMultiple.getText();
    	        System.out.println(textOfLink);
    	        clickonMultiple.click();
    	       // driver.navigate().back();	
    	        Ac.moveToElement(ClickMoreButton).perform();
    	        clickonMultiple.click();
    	        
           WorkOnMoreButton=driver.findElements(By.xpath("//a[@id=\"more\"]"));
           
    	 }	   
    
                 
		
	
		
		
	}

}

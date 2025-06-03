package shivsir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_code {
public static void main(String[] args) {
ChromeDriver driver=	new ChromeDriver();
driver.get("http://localhost:8888/");
driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
driver.findElement(By.id("submitButton")).click();

driver.findElement(By.xpath("//a[contains(text(),'Organizations')]")).click();
 List<WebElement> radioButton=driver.findElements(By.xpath("//input[@name=\"selected_id\"]"));
 
        int count=   radioButton.size();
         System.out.println(count);
         for(int i=0;i<=count-1;i++) {
	     WebElement number=  radioButton.get(i);
	     number.click();
	     boolean name= number.isSelected();
	     System.out.println("radio button select or not= "+name);
 } 
         
   WebElement radioButtonSelect=driver.findElement(By.xpath("//input[@id=\"selectCurrentPageRec\"]"));
   radioButtonSelect.click();
   boolean button=radioButtonSelect.isSelected();
   if(button==true) {
	   System.out.println("passed:the radio button");
   }else{
	   
	   System.out.println("failed: the radio button");
	  }
   
   
   WebElement radioButtonSelects=driver.findElement(By.xpath("//input[@id=\"selectCurrentPageRec\"]"));
   List<WebElement> radioButtonis=driver.findElements(By.xpath("//input[@name=\"selected_id\"]"));
   
   int countNum=   radioButtonis.size();
    System.out.println(countNum);
    for(int i=0;i<=countNum-1;i++) {
    WebElement numberll=  radioButtonis.get(i);
    boolean name1= numberll.isSelected();
    System.out.println("radio button select or not= "+name1);
    
    if(name1==true) {
    	System.out.println("passed : the radio button");
    	
    }else {
    	System.out.println("faild: the radio button ");
    }
    
    System.out.println();
    
    List<WebElement> printLink=driver.findElements(By.xpath("//a"));
     int CountLink=  printLink.size();
     System.out.println(CountLink);
     
    	 
     }
     
} 
 }






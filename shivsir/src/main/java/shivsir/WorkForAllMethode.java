package shivsir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkForAllMethode {
	
	
public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("http://localhost:8888/");
   String xyz=driver.getTitle();
   System.out.println("Titale of page = "+xyz);
   driver.findElement(By.name("user_name")).sendKeys("admin");
   driver.findElement(By.name("user_password")).sendKeys("rahulkumar");
   driver.findElement(By.id("submitButton")).click();
    //Search button Area and total length
   WebElement SearchButton=driver.findElement(By.xpath("//input[@value=\"Search...\"]"));
      Dimension lenghtoof = SearchButton . getSize();
  int Lmbai=    lenghtoof.getWidth();
   int chaudai=             lenghtoof.getHeight();
   System.out.println("Widht of search button = "+Lmbai);
   System.out.println("Hight of search button = "+chaudai);
   // print and click link
 WebElement PrintLinkProduct=  driver.findElement(By.xpath("//table[@class=\"hdrTabBg\"]//a[contains(text(),\"Products\")]"));
 String print=PrintLinkProduct.getText();
 System.out.println("Print Link name ="+print);
 PrintLinkProduct.click();
 //Click on   check box verify button Product
 List<WebElement> PrintCheckBox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
 int SizeOfbutton=PrintCheckBox.size();
    System.out.println(SizeOfbutton);
    for (int t=0;t<=SizeOfbutton-1;t++) {
   WebElement xyx=	   PrintCheckBox.get(t);
    boolean PrintName=  xyx.isSelected();
    System.out.println("Print Checkbox check or not="+PrintName);
    	if(PrintName==false) {
    		System.out.println("Check box not check");
    		
    	}else {
    		System.out.println("it is check ");
    	}
    }
    WebElement checkBoxButton=driver.findElement(By.xpath("//input[@id=\"selectCurrentPageRec\"]"));
    checkBoxButton.click();

    PrintCheckBox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
    for (int t=0;t<=SizeOfbutton-1;t++) {
    	 
    WebElement xyx=	   PrintCheckBox.get(t);
    boolean PrintNamex=  xyx.isSelected();
    System.out.println("Print Checkbox check or not="+PrintNamex);
    	if(PrintNamex==false) {
    		System.out.println("Check box not check");
    		
    	}else 
    		System.out.println("it is check ");
    	}
    //click on the pulse button and make the file of product
    driver.findElement(By.xpath("//img[@alt=\"Create Product...\"]")).click();
    driver.findElement(By.xpath("//input[@name=\"productname\"]")).sendKeys("Head phone");
    driver.findElement(By.xpath("//img[@id=\"jscal_trigger_sales_start_date\"]")).click();
    
    //select the drop down
    WebElement selectDropdowen=driver.findElement(By.xpath("//select[@name=\"glacct\"]"));
     Select sel= new Select(selectDropdowen);
     sel.selectByIndex(3);
     // save the file
   //  driver.findElement(By.xpath("(//input[@accesskey=\"S\"])[2]")).click();
       // use the windohandelans file
     WebElement ClickOnPluse =driver.findElement(By.xpath("//img[@alt=\"Select\"]"));
     ClickOnPluse.click();
     
    }
}

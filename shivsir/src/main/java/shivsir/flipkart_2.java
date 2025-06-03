package shivsir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_2 {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		
		//Print By Shirt Brand
		
List<WebElement>	nameOftitle=	driver.findElements(By.xpath("//div[@class=\"_1sdMkc LFEi7Z\"]//div[@class=\"syl9yP\"]"));
  int sizeofname=nameOftitle.size();
  System.out.println(sizeofname);
  for(int i=0;i<=sizeofname-1;i++) {
	WebElement rrr=            nameOftitle.get(i);
	String totalvalue=rrr.getText();
	System.out.println("Total header of name="+totalvalue);
	  
  }
  //Print By Shirt name and Price
  WebElement searchNameOfProduct=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
  searchNameOfProduct.sendKeys("shirt man");
  searchNameOfProduct.submit();
  List<WebElement> totalshirt=driver.findElements(By.xpath("//div[@style=\"transform: translate3d(0px, 0px, 0px);\"]"));
   int NameShirt=    totalshirt.size();
   System.out.println(NameShirt);
    for(int d=0;d<=NameShirt-1;d++) {
   WebElement ra=	 totalshirt.get(d);
   String Print=         ra.getText();
   System.out.println("Print all shirt="+Print);
	 
 }
    // order by shirt 
    WebElement order=driver.findElement(By.xpath("//div[@data-id=\"SHTFVGBWFC8RAGV7\"]"));
    order.click();
    
	}

}

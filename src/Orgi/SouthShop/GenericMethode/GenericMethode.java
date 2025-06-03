package Orgi.SouthShop.GenericMethode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class GenericMethode {
	
	
	private  WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public WebDriver lauchBrowser(String browsername,String NameLaunchBrowser) {
		driver=null;
		try {
		if (browsername.equals("chrome")) {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			System.out.println("the Browser "+NameLaunchBrowser+" Launch Sucessfully");
			
		}else if(browsername.equals("edge")) {
			
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			System.out.println("the Browser "+NameLaunchBrowser+" Launch Sucessfully");
		}else if(browsername.equals("firfox")) {
			
			driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			System.out.println("the Browser "+NameLaunchBrowser+" Launch Sucessfully");
			
		}
		}catch(Exception browserException) {
			browserException.printStackTrace();
			System.out.println("the Exception  "   +NameLaunchBrowser+  " of browser");
			
		}
		return driver;
	}
	
	public void UrlHit(String url) {
		try {
		driver.get(url);
		System.out.println("the Url hit "  +url+ " hit sucessfully");
		}catch(Exception UrlException) {
			UrlException.printStackTrace();
			System.out.println("The Excetion "  +url+ "of url hit");
			
		}
	}
	public void clickElement(WebElement we,String elementName) {
		try {
		  we.click();
		  System.out.println("the element click on"+elementName+" sucessfully");
		}catch(Exception ExceptionClick) {
			ExceptionClick.printStackTrace();
			System.out.println("The exception of " +elementName+ " click");
		}
	}
	public void sendText(WebElement we,String senvalue,String elementName) {
		try {
		we.sendKeys(senvalue);
		System.out.println("the element Sendkeys on"+elementName+" sucessfully");
		}catch(Exception sendkeysExceprion) {
			sendkeysExceprion.printStackTrace();
			System.out.println("the exception of"+elementName+" sendKeys");
		}
	}
	public Actions ActionClass() {
		Actions  act=	new Actions(driver);
		return act;
	}
	
	public void elementMouseHover(WebElement we,String elementName) {
		try {
	Actions actm=	 ActionClass();
	actm.moveToElement(we);
	System.out.println("the mouseHover work on "  +elementName+ "Actions class sucessfully");
		}catch(Exception ExceptionMouseHov) {
			ExceptionMouseHov.printStackTrace();
	System.out.println("the exception of"+elementName+" MouseHover Actions class");
		}
	}
	
	public void MyDoubleClick(WebElement we,String elementName) {
		try {
			Actions actdouble=   ActionClass();
			actdouble.doubleClick(we).build().perform();
			System.out.println("the DoubleClick work on "  +elementName+ "Actions class sucessfully");
		}catch(Exception exceptdouble) {
			exceptdouble.printStackTrace();
			System.out.println("the exception of"+elementName+" DoubleClick Actions class");

		}
		
	}
	public void getInnerText(WebElement we,String elementName) {
		try {
			String text=we.getText();
			System.out.println("the getText  value "  +text+ "give elementNam,e"  +elementName+ " sucessfully on ");
		}catch(Exception exceptGetText) {
			exceptGetText.printStackTrace();
			System.out.println("the exception of"+elementName+" getText sucessfully");

		}
	}
	public void checkBox(WebElement we,String elementName) {
		try {
	boolean chBox=we.isSelected();
	System.out.println("the element CheckBox "  +chBox+ " and "+elementName+" element");
		}catch(Exception chBoxExcept) {
			chBoxExcept.printStackTrace();
			System.out.println("the exception of"+elementName+" isSelected by CheckBox");

		}
	}
	
	public void VisiBlityIsEnable(WebElement we,String elementName) {
		try {
	boolean chBox=we.isEnabled();
	System.out.println("the element IsEnable "  +chBox+ " and "+elementName+" element");
		}catch(Exception isEnabExcept) {
			isEnabExcept.printStackTrace();
			System.out.println("the exception of"+elementName+" IsEnable ");

		}
	}
	public void VisiBlityIsDisplayed(WebElement we,String elementName) {
		try {
	boolean isDisplay=we.isDisplayed();
	System.out.println("the element isDisplayed "  +isDisplay+ " and "+elementName+" element");
		}catch(Exception isEnabExcept) {
			isEnabExcept.printStackTrace();
			System.out.println("the exception of"+elementName+" isDisplayed ");

	
}
	}

		public void windowMaximize() {
			try {
			driver.manage().window().maximize();
			}catch(Exception winMaxi) {
				winMaxi.printStackTrace();
				System.out.println("The exception of windowMaximize ");
			
		}
		}
		public void windowMinimize() {
			try {
			driver.manage().window().maximize();
			}catch(Exception winMini) {
				winMini.printStackTrace();
				System.out.println("The exception of windowMinimize ");
			

}
		}
			
		public void ScreenShot(String FilePath) throws IOException {
			try {
				TakesScreenshot tss=(TakesScreenshot) driver;	
				File  to=tss.getScreenshotAs(OutputType.FILE);
				File on=    new File(FilePath);
				Files.copy(on, to);
			}catch(Exception scrShot) {
				scrShot.printStackTrace();
				System.out.println("the exception of Take ScreenShot");

			}
				}
		public void currentWindowHandle() {
			try {
		String hadleValue=	driver.getWindowHandle();
		System.out.println("the handleValue of "+hadleValue+"window is sucessfully");
			}catch(Exception windoHanvalue) {
				windoHanvalue.printStackTrace();
				System.out.println("the exception of getWindowHandle");
			}
		}
		public void multipleWindoHandles() {
			
		Set<String> handleValue=	driver.getWindowHandles();
		for(String value:handleValue) {
		driver.switchTo().window(value);
		String url=	driver.getCurrentUrl();
		if(value.equals(url)) {
			break;
		}
			
		}
		}
		public void popAccept() {
			try {
		Alert alt= driver.switchTo().alert();
		alt.accept();
		}catch(Exception popAccept) {			
			popAccept.printStackTrace();
			System.out.println("the exception of popAccept");
		}
		}
		public void popDismiss() {
			try {
			Alert alt= driver.switchTo().alert();
			alt.dismiss();
			}catch(Exception popDismiss) {
				popDismiss.printStackTrace();
				System.out.println("the exception of popDismiss");
			}
		}
		public void javaScriptClick(WebElement we,String elementName) {
			try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", we );
			System.out.println("click element by "+elementName+" javaScript");
			}catch(Exception jseException) {
				jseException.printStackTrace();
				System.out.println("the exception of java Script click");
				
			}
		}


		public void multiElementClickAndText(String xpath) {
			List<WebElement> lwe=   driver.findElements(By.xpath(xpath));
			for(int i=0;i<=lwe.size()-1;i++) {
				WebElement we=  lwe.get(i);
				String str= we.getText();
				System.out.println("the text of element "+str+"successfully");
				we.click();
				lwe= driver.findElements(By.xpath(xpath));
		}
		}
}

		


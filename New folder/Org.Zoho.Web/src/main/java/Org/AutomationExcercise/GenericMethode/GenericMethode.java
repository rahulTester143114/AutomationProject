package Org.AutomationExcercise.GenericMethode;

import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.logging.FileHandler;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GenericMethode {

	private WebDriver driver;
     public	ExtentReports  exReport;

	//********************************** Driver work **************************************
	public WebDriver getDriver() {
		return driver;
	}



	//****************************************** Extends Reports  *************************************

	public void extendsReports() { 

		ExtentSparkReporter htmlReport=new ExtentSparkReporter("ExtentReport;htmlport.html");
	    ExtentReports  report=     new ExtentReports();
	     report.attachReporter(htmlReport);
	   ExtentTest test1=      report.createTest(" i am checking report");
	   test1.log(Status.PASS, "pass")  ; 
	   test1.log(Status.PASS, "pass")  ; 
	   test1.log(Status.PASS, "pass")  ; 
	   report.flush();
	}
	
			
//***************************************** Launch Browser  *********************************
	public void launchBrowser(String browserName) {
      //   exReport.createTest(browserName);
		if(browserName.equals("chrome")) {
			driver=  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			System.out.println("The ChromeDriver Browser Launch Successfully");			
		}else if(browserName.equals("edge")) {
			driver=  new EdgeDriver();
			System.out.println("The EdgeDriver Browser Launch Successfully");			

		}else if(browserName.equals("firfox")) {
			driver=  new FirefoxDriver();
			System.out.println("The FirefoxDriver Browser Launch Successfully");	

		}else if(browserName.equals("internetExp")) {
			driver=  new InternetExplorerDriver();
			System.out.println("The InternetExplorerDriver Browser Launch Successfully");

       //  exReport.flush();

		}
	}

	//****************************************Hit URL*************************************************

	public void hitURL(String url) {
		try {
			driver.get(url);
			System.out.println("The hitURL is Sucessfully");

		}catch(Exception expURL) {
			expURL.printStackTrace();
			System.out.println("The Exception of Hit Url");

		}
	}
	//************************************* findElement VS SearchElement *****************************



	public WebElement searchElement(String xpath) { 
		WebElement seaElement= null;
		try {
			seaElement=  driver.findElement(By.xpath(xpath));

		}catch(Exception expSearch) {
			expSearch.printStackTrace();
			System.out.println("The Exception of SearchElement");
		}

		return seaElement;
	}



	//********************************* SendKeys VS SendText*******************************
	public void sendText(WebElement we,String value,String elementName) {
		try {
			we.sendKeys(value);
			System.out.println("The SendKeys Send  The "  +elementName+  " Sucessfully");
		}catch(Exception sendtext) {
			sendtext.printStackTrace();
			System.out.println("The Exception of sendkeys");
		}

	}

	//************************************ click VS MyClick*******************************************
	public void myClick(WebElement clickOnElement,String ElementName) {
		try {
			clickOnElement.click();
			System.out.println("The Element click "  +ElementName+  "  sucessfully ");
		}catch(Exception expClick) {
			expClick.printStackTrace();
			System.out.println("The Exception of click Element ");
		}

	}
	//**********************************getLocation******************************************************

	public Point elementLocation() {
		WebElement locationOfElement=null;
		Point location= locationOfElement.getLocation();
		return location;
	}
	//***************************************  getX **************************************************
	public void myGetX() {

		try {
			int  x=	 elementLocation().getX();
			System.out.println("The Location Of "  + x +  " element");
		}catch(Exception expGetX) {
			expGetX.printStackTrace();
			System.out.println("The Exception Of getX Methode");
		}
	}
	//****************************************getY*******************************************************

	public   void    myGetY() {
		try {
			int  y=	 elementLocation().getY();
			System.out.println("The Location Of "  + y +  " element");
		}catch(Exception expGetY) {
			expGetY.printStackTrace();
			System.out.println("The Exception Of getY Methode");

		}
	}
	//************************************Select Class Object******************************************
	public Select mySelectClass(WebElement selectObj) {
		Select sel=	  new Select(selectObj);
		return sel;
	}
	//****************************** Dropdowen is SelectByVisibleText************************************
	public void dropDowenByVisibleText(WebElement dropDowen,String elementtext,String elementName) {

		try {
			mySelectClass(dropDowen).selectByVisibleText(elementtext);
			System.out.println("The Element is Select By "+  elementName  +" SelectByVisibleText Sucessfully");
		}catch(Exception expSelText) {
			expSelText.printStackTrace();
			System.out.println("The Exception of Select By Visible Text");

		}
	}
	//******************************** Dropdowen By SelectByIndexNumber******************************
	public void dropDowenByIndexNumber(WebElement dropDowen,int elementIndexNumver,String elementName) {
		mySelectClass(dropDowen).selectByIndex(elementIndexNumver);
		System.out.println("The Element is Select By "+  elementName  +" selectByIndex  Sucessfully");

		if(dropDowen.equals(elementIndexNumver)) {
			System.out.println(" PASSED:  The select By IndexNumber Is Sucessfully");

		}else {
			System.out.println(" FAILD:  The select By IndexNumber Is Not Sucessfully");
		}
	}

	//*************************************** Title Of Current Pages**************************

	public void titleOfCurrentPages() {
		try {
			String titleOfPages= driver.getTitle();
			System.out.println("The title of Page  ="   +titleOfPages+  "");
		}catch(Exception titleOfExp) {
			titleOfExp.printStackTrace();
			System.out.println("The Exception Of Title Of The Pages");

		}
	}
	//***********************************Actions Class Object********************************
	public Actions actionsOBJ() {
		Actions act= new Actions(driver);
		return act;

	}


	//*************************************Actions Class Click*********************************
	public void actionsClassClick(WebElement actClick,String elementName) {
		try {
			actionsOBJ().click(actClick).build().perform();
			System.out.println("Element Click By "   +elementName+  " actions Class SucessFully");
		}catch(Exception clickByActions) {
			clickByActions.printStackTrace();
			System.out.println("The Exception of Actions Class clickOnElement");
		}
	}
	//******************************************* Actions of Right click ***********************************
	public void actionsClassRightClick(WebElement weRightActions,String sendValue,String ElementName) {
		try {
			actionsOBJ().contextClick(weRightActions).build().perform();
			System.out.println("Element Right Click By "   +ElementName+  " actions Class SucessFully");
		}catch(Exception exceptOfRightclick) { 
			exceptOfRightclick.printStackTrace();
			System.out.println("The Exception of Actions Class Right Click");


		}

	}
	//***************************************** Actions Class SendKeys*******************************************

	public void actionsClassSendKeys(WebElement weRightActions,String sendValue,String ElementName) {
		try {
			actionsOBJ().sendKeys(weRightActions,sendValue).build().perform();
			System.out.println("Element Sendkeys By "   +ElementName+  " actions Class SucessFully");
		}catch(Exception exceptOfSendKeys) { 
			exceptOfSendKeys.printStackTrace();
			System.out.println("The Exception of Actions Class Sendkeys");


		}

	}


	//**********************************ClickAndHold By Actiond Class************************************************

	public void actionsClassClickAndHold(WebElement weClickAndHoldActions,String ElementName) {
		try {
			actionsOBJ().clickAndHold(weClickAndHoldActions).build().perform();
			System.out.println("Element ClickAndHold By "   +ElementName+  " actions Class SucessFully");
		}catch(Exception exceptOfClickandHold) { 
			exceptOfClickandHold.printStackTrace();
			System.out.println("The Exception of Actions Class ClickAndHold");


		}
	}



	//*********************************** DoubleClick By Actions Class******************************

	public void actionsClassDoubleclick(WebElement weDoubleclick,String ElementName) {
		try {
			actionsOBJ().doubleClick(weDoubleclick).build().perform();
			System.out.println("Element DoubleClick By "   +ElementName+  " actions Class SucessFully");
		}catch(Exception exceptODoubleclick) { 
			exceptODoubleclick.printStackTrace();
			System.out.println("The Exception of Actions Class Double Click");


		}


	}


	//*********************************** DragAndDrop By Actions Class******************************

	public void actionsDragAndDrop(WebElement weDrag,WebElement weDrop,String ElementName) {
		try {
			actionsOBJ().dragAndDrop(weDrag,weDrop).build().perform();
			System.out.println("Element weDrag And Drop By "   +ElementName+  " actions Class SucessFully");
		}catch(Exception exceptDragAndDrop) { 
			exceptDragAndDrop.printStackTrace();
			System.out.println("The Exception of Actions Class dragAndDrop");



		}

	}

	//******************************** ImpliCitily Wait**********************************
	public void dyanamicWait(int WaitSecound) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitSecound)); 

	}

	//*************************************** IsSelected By Check BoxCheck Or Not************************
	public void CheckBox(WebElement checkBox,String elementName) {
		try {
			boolean CheckBoxCheckedOrNot= checkBox.isSelected();
			if(CheckBoxCheckedOrNot==true) {
				System.out.println("PASSED: The Check Box Is "   +CheckBoxCheckedOrNot+  " Cheked");
			}else {
				System.out.println("FAILD: The Check Box Is"   +CheckBoxCheckedOrNot+  " UnCheked");
			}
		}catch(Exception expSelected ) {

			expSelected.printStackTrace();
			System.out.println("The Exception of selected Class");
		}

	}
	//**************************** isDisplayed ******************************************        	 

	public void  MyIsDisplayed(WebElement checkBox,String elementName) {
		try {
			boolean elementDisplayedOrNot= checkBox.isDisplayed();
			if(elementDisplayedOrNot==true) {
				System.out.println("PASSED: The element Is "   +elementDisplayedOrNot+  " Displayed");
			}else {
				System.out.println("FAILD: The element Is"   +elementDisplayedOrNot+  " Not Displayed");
			}
		}catch(Exception expDisplay ) {

			expDisplay.printStackTrace();
			System.out.println("The Exception of isDisplayed Class");
		}

	}

	//**************************** isEnabled ****************************************************        	 

	public void  MyIsEnabled(WebElement checkBox,String elementName) {
		try {
			boolean elementIsEnabled= checkBox.isEnabled();
			if(elementIsEnabled==true) {
				System.out.println("PASSED: The element Is "   +elementIsEnabled+  " IsEnabled");
			}else {
				System.out.println("FAILD: The element Is"   +elementIsEnabled+  " Not IsEnabled");
			}
		}catch(Exception expIsEnabled ) {

			expIsEnabled.printStackTrace();
			System.out.println("The Exception of isDisplayed Class");
		}

	}

	//************************************************** findsElements Vs SearchElements*****************************


	public List<WebElement> searchElements(String xpath) {
		List<WebElement> boundleOfElement = null ;
		try {
	 boundleOfElement=	driver.findElements(By.xpath(xpath));
              

		}catch(Exception listOfWeb) {
			listOfWeb.printStackTrace();
			System.out.println("The Exceptoion Of FindElement ");
		}
		 return boundleOfElement;
	}
//  ****************************************************************** Get Text And Click On The Element ********************************
	
	public void getTextAndClick() {             
	}


	//****************************************************WindowHandle vs myWindowHandle *****************************************
	public void myWindowHandle() {
		try {
			String currentWindowHandleValue=	driver.getWindowHandle();
			System.out.println("Handle Value Of Current windows= "+currentWindowHandleValue+"");
		}catch(Exception expCurrentWindow) {
			expCurrentWindow.printStackTrace();
			System.out.println("The Exception Of Current Windows");
		}
	}
	//********************************************* WindowHandles VS  MyWindowHandles************************************************

	public void mywindowhandles(String currentUrl) {
		try {
			Set<String> MultipleWindowHandleValue=	driver.getWindowHandles();
			for(String handleValue: MultipleWindowHandleValue) {
				driver.switchTo().window(handleValue);
				String url=  driver.getCurrentUrl();
				System.out.println("The URL Of Windows is="+url+"");
				if(url.equalsIgnoreCase(currentUrl)) {

				}
				break;
			}

		}catch(Exception expOrWindow) {
			expOrWindow.printStackTrace();
			System.out.println("The Exception of WindoHandles");
		}



	}

	//**************************************** Close Only The Page MyClose***********************************
	public void myClose() {
		try {
			driver.close();
			System.out.println("The Page Close sucessfully");
		}catch(Exception expOfClose) {
			expOfClose.printStackTrace();
			System.out.println("The Exception Of Close Pages");
		}
	}
	//**************************************Close The Browser******************************************			
	public void myQuit() {
		try {
			driver.quit();
			System.out.println("The Browser Close sucessfully");

		}catch(Exception expOfClose) {
			expOfClose.printStackTrace();
			System.out.println("The Exception Of Browser");
		}
	}


	//******************************************* If The Element Under The iFrame *****************************
	public void myParentFrame() {
		try {
			driver.switchTo().parentFrame();
			System.out.println("Parent Frame  work sucessfully");
		}catch(Exception expParentFrame) {
			expParentFrame.printStackTrace();
			System.out.println("the Exception of ParentFrame ");
		}
	}
	//****************************** Frme Vs myFrameByIndexNumberm ******************************************

	public void myFrameByIndexNumber(int framIndexNo) {
		try {
			driver.switchTo().frame(framIndexNo);
			System.out.println("The Frame Of Index No Work Sucessfully");
		}catch(Exception expFrame) {
			expFrame.printStackTrace();
			System.out.println("The Exception of Frame By Index No");
		}
	}

	//************************************** Frame Vs myFrameByNamr***************************************

	public void myFrameByNamr(String  framName) {
		try {
			driver.switchTo().frame(framName);
			System.out.println("The Frame Of FrameValue  Work Sucessfully");
		}catch(Exception expFrame) {
			expFrame.printStackTrace();
			System.out.println("The Exception of Frame By FramValue");
		}
	}
	//***************************************** ScreenShot Vs MyScreenShot********************************  	

	public void MyScreenShot(WebElement we,String pathOfFile) {

		TakesScreenshot tss=(TakesScreenshot) driver;
		File source= tss.getScreenshotAs(OutputType.FILE);

		File destination=  new File(pathOfFile);
		//	org.openqa.selenium.io.FileHandler. (source,destination, null);

	}

	//******************************************** java Script Click ***************************************

	public void JavaScriptClick(WebElement weClick,String elementName) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("argument[0].click()", weClick);
			System.out.println("Java Script click SucessFully");
		}catch(Exception jsClick) {
			jsClick.printStackTrace();
			System.out.println("The Exception of Java Script click");
		}
	}
	//******************************************* java Script senKeys*************************************
	public void JavaScriptSenKeys(WebElement weSendkeys,String sendValur,String elementName) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("argument[0].Value='"+sendValur+"'", weSendkeys);
			System.out.println("Java Script SendValue SucessFully");
		}catch(Exception jsSendKeys) {
			jsSendKeys.printStackTrace();
			System.out.println("The Exception of Java Script SendValue");
		}
	}
	//*************************************** Java Script Scroll***************************************************

	public void JavaScriptScroll(WebElement weScroll) {
		try {
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,350)", weScroll);
			System.out.println("The Page Scroll Sucessfully");
		}catch(Exception Expscroll) {
			Expscroll.printStackTrace();
			System.out.println("The Exception of JavaScript Scroll");
		}
	}

	//************************************Clear the Box***********************************************
	public void CleraBox(WebElement weClear,String clearBoxName) {
		try {
			weClear.clear();
			System.out.println("Clear The Box sucessfully");
		}catch(Exception ExpClear) {
			ExpClear.printStackTrace();
			System.out.println("The Exception Of Clear Box");
		}

	}
	//*********************************** public void TagName*****************************************


	public void MyGetTageName(WebElement weTageName) {
		try {
			String tageName=	weTageName.getTagName();
			System.out.println("The Tage Of Pages="     +tageName+"");
		}catch(Exception expTageName) {
			expTageName.printStackTrace();
			System.out.println("The Exception Of Tage Name");
		}
	}

	//******************************* Size Of elements*************************************************
	public void sizeOfElements(WebElement weSize) {
		try {
			org.openqa.selenium.Dimension dim=weSize.getSize();
			int hightOfElement=	dim.getHeight();
			System.out.println("The Hight of Element is = "+hightOfElement+"");
			int widthOfElement=    dim.getWidth();
			System.out.println("The Widht of Element is = "+widthOfElement+"");

		}catch(Exception hightAndwidht) {
			hightAndwidht.printStackTrace();
			System.out.println("The Exception of Height And Widht");
		}
	}

	//****************************************** getText Of Element**************************************
	public void myGetTextOfElement(WebElement weTextOfElements,String elementName) {
		try {
			String textElement=	weTextOfElements.getText();
			System.out.println("The Text Of Element is =    "+textElement+"");
		}catch(Exception expText) {
			expText.printStackTrace();
			System.out.println("The Exceptiom of getText Elements");
		}
	}


	//*******************************************getAttribute*********************************************


	public void myGetattribute(WebElement weAttribute,String tageName) {
		try {
			String  str=	weAttribute.getAttribute(tageName);
			System.out.println("The Value Of Attribute is=  "+   str  +"");
		}catch(Exception expAttribute) {
			expAttribute.printStackTrace();
			System.out.println("The Exception Of getAttribute");
		}


	}
	
	


}








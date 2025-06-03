package Orgin.southShop.PagesReuseable;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Orgi.SouthShop.GenericMethode.GenericMethode;

public class HomePages {
	GenericMethode gm;
	public HomePages(GenericMethode gm) {
		this.gm=gm;
		PageFactory.initElements(gm.getDriver(), this);
	}
	
	
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement clickWomanButton;
	@FindBy(xpath="//a[text()='Men']")
	private WebElement clickOnMen;
	@FindBy(xpath="//a[text()='Kids']")
	private WebElement clcikOnKids;
	@FindBy(xpath="//a[text()='Sale']")
	private WebElement clcikSale;
	@ FindBy(xpath="//a[text()='Reward']")
	private WebElement clickonReword;
	@FindBys(@FindBy(xpath="//div[@style=\"width: 400px;\"]" ))
	private List<WebElement> multiSlidShowClickAndText;
	@FindBy(xpath="//a[@class=\"product--title\"]")
	WebElement clickOnPopAccept;
	
	
	
	
	//====================Click on Woman==============
	public void clickOnWoman() {
	gm.clickElement(clickWomanButton, "Woman Button");
	}
	//=====================click on Men===============
	public void clickOnMen() {
    gm.clickElement(clickOnMen, "Men Button");
	}
	//========================click On kids===========
    public void clcikOnKids() {
    gm.clickElement(clcikOnKids, " Kids button");
    
    }
    //====================click on Sale=================
    public void clickonSale() {
    gm.clickElement(clcikSale, "sale Button");
    }
    //====================click on Reword =====================
    public void clickOnReword() {
    gm.clickElement(clickonReword, "Reword Button");
    }
    public void clickOnAcceptPop() {
    	gm.javaScriptClick(clickOnPopAccept, "Accept");
    }
    
    public void slideShowHandleHomePage() {
    	for(int i=0;i<=multiSlidShowClickAndText.size()-1;i++) {
    		  WebElement we = multiSlidShowClickAndText.get(i);
    		 String  textslide= we.getText();
    		 System.out.println("the text"+textslide+" of slide Show");
    		 
    		 
    	}
    }
	
		
	}
    


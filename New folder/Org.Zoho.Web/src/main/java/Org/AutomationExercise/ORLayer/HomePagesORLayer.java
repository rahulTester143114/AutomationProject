package Org.AutomationExercise.ORLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.AutomationExcercise.GenericMethode.GenericMethode;

public class HomePagesORLayer {

	  GenericMethode gm;
	public HomePagesORLayer(GenericMethode gmobject) {
		gm=gmobject;
		PageFactory.initElements(gm.getDriver(), this);
		
	
	
	
	}
	
	
	//**********************************************************  Home Click *******************************************************
	
	@FindBy(xpath="//i[@class=\"fa fa-home\"]")
	private WebElement clickOnHome;
	public WebElement getClickOnHome() {
		return clickOnHome;
	}
	
	//************************************************ Click On The Women ************************************************************
	@FindBy(xpath="//a[@href=\"#Women\"]")
	 private  WebElement womanClick;
     
	public WebElement getWomanClick() {
		return womanClick;
	}
	
	//************************************************** Click On The Men *************************************************************
	@FindBy(xpath="//a[@href=\"#Men\"]")
	private WebElement clickOnMen;
	
	public WebElement getClickOnMen() {
		return clickOnMen;
		
	}
	//************************************************** Click On Kids *****************************************************************
	@FindBy(xpath="//a[@href=\"#Kids\"]")
	private WebElement clickOnKIDS;
	
	public WebElement getClickOnKIDS() {
		return clickOnKIDS;
	}

}



package Org.AutomationExercise.ORLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Org.AutomationExcercise.GenericMethode.GenericMethode;

public class WomenpagesOrLayer {
	GenericMethode gm;
	public WomenpagesOrLayer(GenericMethode gmObj) {
		gm=gmObj;
		PageFactory.initElements(gm.getDriver(), this);
		
	}
	
//***************************************************** click On Dress *******************************************************
	@FindBy(xpath="//a[@href=\"/category_products/1\"]")
	private WebElement clickOnDress;
	
	public WebElement   GetClickOnDress() {
		return clickOnDress;
	}

	//****************************************** click On Tops *******************************************************************
	@FindBy(xpath="//a[@href=\"/category_products/2\"]")
	private WebElement clickTOPS;
	public WebElement getClickOnTOPS() {	
		return clickTOPS;
	}
	
	//********************************************************* click on Saree ****************************************************
	@FindBy(xpath="//a[@href=\"/category_products/7\"]") 
	private WebElement clickOnSaree;
	public WebElement getClickOnSaree() {
		return clickOnSaree;
	}
	//******************************************************** click and get Text Of Price **************************************
	
	@FindBy(xpath="//div[@class=\"productinfo text-center\"]")
	private WebElement priceWork;
	public WebElement getPrice() {
		return priceWork;
	}
}


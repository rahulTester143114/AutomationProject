package Org.AutomationExcercise.ReuseablePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Org.AutomationExcercise.GenericMethode.GenericMethode;

public class LoginPages {
	  GenericMethode gm;
	public LoginPages(GenericMethode gmObj) {
		this.gm=gmObj;
		PageFactory.initElements(gm.getDriver(), this);
		
	}

	
	public void LoginTC() {
		
		gm.launchBrowser("chrome");
		gm.hitURL("https://www.automationexercise.com/login");
     	
	
	}
}

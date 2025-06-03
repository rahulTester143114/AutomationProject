package Orgin.southShop.PagesReuseable;

import org.openqa.selenium.support.PageFactory;

import Orgi.SouthShop.GenericMethode.GenericMethode;


public class LoginPage {
	public GenericMethode gen;
   public 	 LoginPage(GenericMethode gen1) {
		this.gen=gen1;
		PageFactory.initElements(gen.getDriver(), this);
	}
    public void Login() {
    	gen.lauchBrowser("chrome", "ChromeDriver");
    	gen.UrlHit("https://www.southindiaeshop.com/");
    	
    }
	
}

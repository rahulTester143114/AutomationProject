package Orgin.southShop.AutomateTestCase;

import Orgi.SouthShop.GenericMethode.GenericMethode;
import Orgin.southShop.PagesReuseable.LoginPage;

public class AutomationScriptLoginPage {

	GenericMethode gm=new GenericMethode();

	public void testLogin() {
	   LoginPage lp=	new LoginPage(gm);
	      lp.Login();
		
	}
}

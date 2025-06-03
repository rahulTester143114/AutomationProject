package Orgin.southShop.AutomateTestCase;

import Orgi.SouthShop.GenericMethode.GenericMethode;
import Orgin.southShop.PagesReuseable.HomePages;
import Orgin.southShop.PagesReuseable.LoginPage;

public class AutomateTestCaseHomepages {

	
	public void testHomepage() {
		GenericMethode gm= new GenericMethode();
		LoginPage lp=new LoginPage(gm);
		lp.Login();
		
		HomePages hp= new HomePages(gm);
		hp.slideShowHandleHomePage();
	    hp.clickOnAcceptPop();
	}
}

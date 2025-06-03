package Org.AutomationExcercise.TestCaseAutomate;

import org.testng.annotations.Test;

import Org.AutomationExcercise.GenericMethode.GenericMethode;
import Org.AutomationExcercise.ReuseablePages.HomePages;
import Org.AutomationExcercise.ReuseablePages.LoginPages;
import Org.AutomationExcercise.ReuseablePages.WomenPages;

public class WomenPagesTestCase {
	
	@Test
	public void verifyTheWomenPagesTC() {
		GenericMethode gm=	  new GenericMethode();
		LoginPages lp=    new LoginPages(gm);
		lp.LoginTC();
		HomePages hp=    new HomePages(gm);
		hp.clickHome();
		hp.clickWoman();
		WomenPages wp=   new WomenPages(gm);
		wp.clickOnDress();
	}

}

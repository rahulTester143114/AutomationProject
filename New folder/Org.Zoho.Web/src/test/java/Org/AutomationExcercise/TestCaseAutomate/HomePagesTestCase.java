package Org.AutomationExcercise.TestCaseAutomate;

import org.testng.annotations.Test;

import Org.AutomationExcercise.GenericMethode.GenericMethode;
import Org.AutomationExcercise.ReuseablePages.HomePages;
import Org.AutomationExcercise.ReuseablePages.LoginPages;

public class HomePagesTestCase {
	
	@Test
	public void Home() throws InterruptedException {
		   GenericMethode gmHome=    new GenericMethode();
		LoginPages lpho =new LoginPages(gmHome);
		lpho.LoginTC();
		HomePages hp=  new HomePages(gmHome);
		hp.clickHome();
		Thread.sleep(10000);
		hp.clickWoman();
	}
 
}

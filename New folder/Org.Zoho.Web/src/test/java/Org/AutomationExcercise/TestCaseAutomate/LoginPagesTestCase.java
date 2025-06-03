package Org.AutomationExcercise.TestCaseAutomate;

import org.testng.annotations.Test;

import Org.AutomationExcercise.GenericMethode.GenericMethode;
import Org.AutomationExcercise.ReuseablePages.LoginPages;

public class LoginPagesTestCase {
	
	
	@Test
	public  void main() {
		GenericMethode gm=	  new GenericMethode();
		LoginPages lp=  new LoginPages(gm);
		lp.LoginTC();
		
	}

}

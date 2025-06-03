package Org.AutomationExcercise.ReuseablePages;

import Org.AutomationExcercise.GenericMethode.GenericMethode;
import Org.AutomationExercise.ORLayer.HomePagesORLayer;

public class HomePages extends HomePagesORLayer{
	GenericMethode gm;
 public HomePages(GenericMethode gmobject) {
		super(gmobject);
		gm=gmobject;
	}

	
	
	//******************************************************** click on Home ******************************************************
	
	public void clickHome() {
		gm.myClick(getClickOnHome(), "Click On Home");
	}
	
	//*************************************** click On Women **************************************************************************

	public void clickWoman() {
		gm.myClick(getWomanClick(), "Women On Click");
		
	}
	
	//***********************************************  click On Kids ************************************************************
	public void clickKids() {
		gm.myClick(getClickOnKIDS(), "KIDS On Click");
}
	
	//************************************************************* click on Men ***************************************************
	
	public void clickOnMen() {
		gm.myClick(getClickOnMen(), " Men On click");
	}
}
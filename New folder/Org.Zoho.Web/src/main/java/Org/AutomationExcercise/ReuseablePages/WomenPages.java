
package Org.AutomationExcercise.ReuseablePages;

import Org.AutomationExcercise.GenericMethode.GenericMethode;
import Org.AutomationExercise.ORLayer.WomenpagesOrLayer;

public class WomenPages extends WomenpagesOrLayer {	
	
	GenericMethode gm;
	public WomenPages(GenericMethode gmObj) {
		super(gmObj);
		gm=gmObj;
	}
//**************************************************  click On Saree ******************************************
	public void clickOnSaree() {
		gm.myClick(getClickOnSaree(), "Click On Saree");
	}
	
	//******************************************* click on Tops ********************************************************
	
	public void clickOnTops() {
		gm.myClick(getClickOnTOPS(), "click On Tops");
	}
	
	//****************************************** click on Dress *************************************************
	public void clickOnDress() {
		gm.myClick(GetClickOnDress(), "click On Dress");
	}
	
//	public void textOfProduct() {
//		gm.searchElements(getPrice(), "gettext", "text of Product");
//	}
//	
	
	
	
	
	
	
	
}

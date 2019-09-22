package pages;

import base.ProjectSpecificMethods;

public class Startpage extends ProjectSpecificMethods {

	public Startpage clickThuraipakkam()
	{
		driver.findElementByXPath("(//div[@class='component-popular-locations']/div)[2]").click();
		return this;
	}
	
	public Pickuppage ClickNext()
	{
		driver.findElementByClassName("proceed").click();
		return new Pickuppage();
	}
	
	
}

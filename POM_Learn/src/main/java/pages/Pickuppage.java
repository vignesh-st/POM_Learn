package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class Pickuppage extends ProjectSpecificMethods{

	
	
	public Pickuppage clickTomorrow()
	{
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		driver.findElement(By.xpath("//div[contains(text(),"+tomorrow+")]")).click();
		return this;
	}
	
	public Dropoffpage ClickNext()
	{
		driver.findElementByClassName("proceed").click();
		return new Dropoffpage();
	}
	
	
}

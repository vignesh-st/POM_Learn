package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;



public class Carbookpage extends ProjectSpecificMethods{

		
		
		public Carbookpage clickDesSort()
		{
			
			driver.findElement(By.xpath("//div[text()=' Price: High to Low ']")).click();
			return this;
		}
		
		public Carbookpage getFirstCarName()
		{
			
			System.out.println(driver.findElementByXPath("(//div[@class='details']/h3)[1]").getText());
			return this;
		}
}
		
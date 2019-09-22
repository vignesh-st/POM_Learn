package pages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;




public class Dropoffpage extends ProjectSpecificMethods{

		
		
		
		
		public Carbookpage ClickDone()
		{
			driver.findElementByClassName("proceed").click();
			return new Carbookpage();
		}
		
		
	}

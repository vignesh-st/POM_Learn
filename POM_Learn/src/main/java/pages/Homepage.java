package pages;








import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods {

	
	public Startpage clickStart() throws IOException
	{
		
		driver.findElement(By.xpath("//a[@title='Start your wonderful journey']")).click();
		//TakesScreenshot tscrechot = new 
		
		File screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("./snaps/img.png"));
		
		return new Startpage();
	}
}

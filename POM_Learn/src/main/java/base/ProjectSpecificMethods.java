package base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	public String excelFileName;

	
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai");
		driver.getScreenshotAs(OutputType.FILE);
		File file = new File("./snaps/img.png");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	/*@DataProvider(name="fetchData")
	public Object[][] dataCentre() throws IOException {
		return ReadExcel.readData(excelFileName);
	}*/
	
}
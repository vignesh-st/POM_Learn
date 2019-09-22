package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.Homepage;

public class Zoomcar extends ProjectSpecificMethods {
	
	@Test
	public void runZoomcar() throws IOException
	{
		
		new Homepage().clickStart().clickThuraipakkam().ClickNext()
		.clickTomorrow().ClickNext().ClickDone().clickDesSort().getFirstCarName();
	}

}

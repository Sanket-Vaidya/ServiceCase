/*package testBase;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.BugPage;
import pageObjects.Login;
import pageObjects.QueryPage;
import pageObjects.ServiceCasePage;
import utilities.ExcelUtility;

public class RunTestBD extends BaseClass {
	
	QueryPage qp;
	static Login lg;
	static ServiceCasePage scp;
	static BugPage bp;
	
	
	
	static BuildingDesignAreaPath bdesAreaPath=new	BuildingDesignAreaPath();
	
	@Test
	public void runTest() throws InterruptedException, UnsupportedFlavorException, IOException {
		lg = new Login(driver);
		scp = new ServiceCasePage(driver);
		bp=new BugPage(driver);
		
		
		excel = new ExcelUtility(System.getProperty("user.dir") + "\\src\\test\\java\\ServiceCaseData.xlsx");
		Thread.sleep(3000);
		lg.inputEmail("Sanket.vaidya@bentley.com");
		lg.clickNxtBtn();
		Thread.sleep(3000);
		lg.enterPassword("NextGeneration@2799");
		lg.signIn();
		Thread.sleep(3000);
		lg.clickYesBtn();
		Thread.sleep(3000);
		String noOfRequests = driver.findElement(By.xpath("//span[@role='presentation']")).getText();
		System.out.println(noOfRequests);
		int requests = Integer.parseInt(noOfRequests.split("of ")[1]);
		System.out.println(requests);
		int actionTime = requests / 10;
		int lastActionTime = requests % 10;
		System.out.println(actionTime + ", " + lastActionTime);
		
		
		CreateBug.createBugs();
		for (int i = 1; i <= actionTime; i++) {
			for (int c = 1; c <= 10; c++)
				new Actions(driver).keyDown(Keys.ARROW_DOWN).sendKeys("a").perform();
			CreateBug.createBugs();
			// setStateofBug();
		}
		
		for (int c = 1; c <= lastActionTime; c++)
			new Actions(driver).keyDown(Keys.ARROW_DOWN).sendKeys("a").perform();
		CreateBug.createBugs();
	}

}*/

package testBase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.Login;
import pageObjects.QueryPage;
import utilities.ExcelUtility;

import org.openqa.selenium.Keys;

public class CopyWorkItems extends BaseClass {
	QueryPage qp;
	Login lg;
	ExcelUtility excel;

	@Test
	public void createBug() throws InterruptedException, IOException {

		qp = new QueryPage(driver);
		lg = new Login(driver);
		excel = new ExcelUtility(System.getProperty("user.dir") + "\\src\\test\\java\\ServiceCaseData.xlsx");
		Thread.sleep(5000);
		lg.inputEmail("Sanket.vaidya@bentley.com");
		lg.clickNxtBtn();
		Thread.sleep(5000);
		lg.enterPassword("NextGeneration@2799");
		lg.signIn();
		Thread.sleep(5000);
		lg.clickYesBtn();
		Thread.sleep(5000);

		// Get total number of Service Requests and number of times key down action to
		// be performed
		String noOfRequests = driver.findElement(By.xpath("//span[@role='presentation']")).getText();
		System.out.println(noOfRequests);
		int requests = Integer.parseInt(noOfRequests.split("of ")[1]);
		System.out.println(requests);
		int actionTime = requests / 10;
		int lastActionTime = requests % 10;
		System.out.println(actionTime + ", " + lastActionTime);

		fillExcelSheet();
		// setStateofBug();
		for (int i = 1; i <= actionTime; i++) {
			for (int c = 1; c <= 10; c++)
				new Actions(driver).keyDown(Keys.ARROW_DOWN).sendKeys("a").perform();
			fillExcelSheet();
			// setStateofBug();
		}

		for (int c = 1; c <= lastActionTime; c++)
			new Actions(driver).keyDown(Keys.ARROW_DOWN).sendKeys("a").perform();
		fillExcelSheet();
		// setStateofBug();

	}

}

package testBase;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v105.page.model.NavigatedWithinDocument;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import pageObjects.BugPage;
import pageObjects.Login;
import pageObjects.QueryPage;
import pageObjects.ServiceCasePage;
import utilities.ExcelUtility;
import testBase.BuildingDesignAreaPath;

public class CreateBug extends BaseClass {

	QueryPage qp;
	Login lg;
	ServiceCasePage scp;
	BugPage bp;
	ExcelUtility excel;

	static BuildingDesignAreaPath bdesAreaPath = new BuildingDesignAreaPath();

	@Test
	public void createBugs() throws InterruptedException, UnsupportedFlavorException, IOException {
		lg = new Login(driver);
		scp = new ServiceCasePage(driver);
		bp = new BugPage(driver);

		excel = new ExcelUtility(System.getProperty("user.dir") + "\\src\\test\\java\\BugsCreated.xlsx");
		wait.until(ExpectedConditions.visibilityOf(lg.inputEmail));
		lg.inputEmail("Sanket.vaidya@bentley.com");
		lg.clickNxtBtn();
		wait.until(ExpectedConditions.visibilityOf(lg.enterPassword));
		lg.enterPassword("NextGeneration@2799");
		lg.signIn();
		wait.until(ExpectedConditions.visibilityOf(lg.yesBtn));
		lg.clickYesBtn();
		Thread.sleep(3000);
		String noOfRequests = driver.findElement(By.xpath("//span[@role='presentation']")).getText();
		System.out.println(noOfRequests);
		int requests = Integer.parseInt(noOfRequests.split("of ")[1]);
		int p = 0;
		int RowCount = excel.getRowCount("Sheet1");

		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'grid-row')]"));
		for (int i = 1; i < 2; i++) {

			String id = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][1]"))
					.getText();
			String state = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][4]"))
					.getText();
			String areaPath = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][7]"))
					.getText();

			String actualAreaPath = bdesAreaPath.getAreaPath(areaPath);

			if (state.equalsIgnoreCase("Committed")) {

				try {
					// new Actions(driver).doubleClick(rows.get(i+1)).perform();
					driver.findElement(By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]")).click();
					new Actions(driver).keyDown(Keys.ENTER).perform();

					wait.until(ExpectedConditions.visibilityOf(scp.serviceCaseId));

					String serviceCaseID = scp.getServiceCaseID();

					excel.setCellData("Sheet1", RowCount + i + 1, i, serviceCaseID);

					wait.until(ExpectedConditions.visibilityOf(scp.ServiceCaseState));

					scp.changeServiceCaseStatus("Added to Backlog");

					scp.getServiceNowPriority();
					Clipboard clipboardSerPriority = Toolkit.getDefaultToolkit().getSystemClipboard();
					Transferable contentsSerPriority = clipboardSerPriority.getContents(null);
					String TSGPriority = (String) contentsSerPriority.getTransferData(DataFlavor.stringFlavor);

					String Requestor = scp.getRequestedBy();

					// Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOf(scp.accountName));

					new Actions(driver).scrollToElement(scp.accountName).perform();
					scp.getAccountName();

					Thread.sleep(10000);

					Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
					Transferable contents = clipboard.getContents(null);
					String accountName = (String) contents.getTransferData(DataFlavor.stringFlavor);

					// Thread.sleep(10000);

					wait.until(ExpectedConditions.visibilityOf(scp.ultimateId));
					new Actions(driver).scrollToElement(scp.ultimateId).perform();
					scp.getUltimateID();

					Thread.sleep(10000);

					Clipboard clipboardID = Toolkit.getDefaultToolkit().getSystemClipboard();
					Transferable contentsID = clipboardID.getContents(null);
					String UltimateID = (String) contentsID.getTransferData(DataFlavor.stringFlavor);

					String clientID = UltimateID + ", " + accountName;

					// Thread.sleep(10000);

					wait.until(ExpectedConditions.visibilityOf(scp.stepsToReproduce));
					new Actions(driver).scrollToElement(scp.stepsToReproduce).perform();
					scp.copyStepsToRepeoduce();

					// Thread.sleep(5000);
					wait.until(ExpectedConditions.visibilityOf(scp.accountSize));
					boolean E365LabelExists = scp.E365labelExists();

					String serviceCaseId = scp.getServiceCaseID();

					System.out.println(clientID);

					scp.contextMenuBtnclick();
					scp.copyWorkItemBtnClick();
					Thread.sleep(10000);
					scp.selectProject();

					for (int c = 1; c <= 26; c++) {
						new Actions(driver).keyDown(Keys.ARROW_UP).perform();
					}
					new Actions(driver).keyDown(Keys.ENTER).perform();
					Thread.sleep(15000);
					if (p == 0) {
						scp.selectWorkItemType();

						Thread.sleep(3000);

						new Actions(driver).keyDown(Keys.ARROW_DOWN).perform();

						new Actions(driver).keyDown(Keys.ENTER).perform();
					}
					;

					scp.includeLinks();
					scp.includeAttachments();
					scp.clickokBtn();

					// Thread.sleep(10000);
					wait.until(ExpectedConditions.visibilityOf(bp.reproSteps));
					bp.copyStepstoRepro();

					// Thread.sleep(10000);

					wait.until(ExpectedConditions.visibilityOf(bp.tag));
					bp.clickTag();
					Thread.sleep(2000);

					new Actions(driver).sendKeys("Service Case").perform();
					new Actions(driver).keyDown(Keys.ENTER).perform();

					Thread.sleep(2000);
					if (E365LabelExists) {
						new Actions(driver).sendKeys("E365").perform();
						new Actions(driver).keyDown(Keys.ENTER).perform();
					}
					new Actions(driver).keyDown(Keys.ESCAPE).perform();

					Thread.sleep(2000);

					WebElement AreaPath = driver.findElement(By.xpath("(//input[@value='Facilities Engineering'])[1]"));
					AreaPath.click();
					Thread.sleep(2000);
					new Actions(driver).sendKeys(actualAreaPath).perform();
					new Actions(driver).keyDown(Keys.ENTER).perform();

					new Actions(driver).scrollToElement(bp.addLink).perform();
					String relLink = bp.getRelatedLink();
					System.out.println(relLink);

					if (relLink.trim().equals(serviceCaseId))
						bp.deleteLink();

					bp.clickAddLink();
					bp.clickExistingItem();
					wait.until(ExpectedConditions.visibilityOf(bp.linkType));
					bp.addlinkType("Successor");
					bp.addWorkItem(serviceCaseId);
					Thread.sleep(5000);
					bp.clickOKBtn();

					Thread.sleep(2000);

					Thread.sleep(2000);

					new Actions(driver).scrollToElement(bp.clientDetails).perform();
					bp.copyClientDetails(clientID);

					bp.enterTSGSeverity(TSGPriority);
					bp.enterRequestor(Requestor);

					wait.until(ExpectedConditions.visibilityOf(bp.SaveAndCloseBtn));

				//	bp.clickSaveAndCloseBtn();

					wait.until(ExpectedConditions.visibilityOf(scp.SaveBtn));

					scp.clickSave();

					Thread.sleep(5000);

					driver.navigate().back();

					Thread.sleep(5000);
					p++;
				} catch (Exception e) {
					driver.get(
							"https://dev.azure.com/bentleycs/Facilities%20Engineering/_queries/query/748c32f2-d840-4507-b6b7-4cf347959232/");
					driver.switchTo().alert().accept();
				}

			}
		}
	}

}

package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BugPage extends BasePage {

	public BugPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="(//li[@class='tag-item tags-add-button tag-item-delete-experience']//span//span)[2]")
	public WebElement tag;
	
	@FindBy(xpath="(//input[contains(@class,'tags-input')])[1]")
	public WebElement tagBox;
	
	@FindBy(xpath="(//input[contains(@class,'tags-input')])[2]")
	public WebElement tagBox2;
	
	@FindBy(xpath="//span[@class='tag-box tag-box-selectable']//span")
	public WebElement addTag;
	
	@FindBy(xpath="(//input[@value='Facilities Engineering'])[1]")
	public WebElement areaPath;
	
	@FindBy(xpath="//div[@data-placeholder='Click to add Repro Steps']")
	public WebElement reproSteps;
	
	@FindBy(xpath="//div[@data-placeholder='Click to add Client Details']")
	public WebElement clientDetails;
	
	@FindBy(xpath="(//button[@class='add-new-item-component-button'])[3]")
	public WebElement addLink;
	
	@FindBy(xpath="//button[@name='Existing item']")
	public WebElement existingItem;
	
	@FindBy(xpath="//input[@data-is-interactable='true']")
	public WebElement linkType;
	
	@FindBy(id="work-item-ids")
	public WebElement workItem;
	
	@FindBy(id="ok")
	public WebElement BtnOK;
	
	@FindBy(xpath="//button[@class='la-item-delete']")
	public WebElement delLink;
	
	@FindBy(xpath="//input[@aria-label='TSG Severity']")
	public WebElement TSGSeverity;
	
	@FindBy(xpath="//input[@aria-label='Requestor']")
	public WebElement Requestor;
	
	@FindBy(xpath="//li[@command='save-and-close-work-item']")
	public WebElement SaveAndCloseBtn;
	
	@FindBy(xpath="(//a[@class='caption'])[2]")
	public WebElement Bugref;
	
	@FindBy(xpath="(//span[@aria-label='ID Field'])[2]")
	public WebElement BugID;
	
	@FindBy(xpath="//div[@class='la-primary-data-id']")
	public WebElement relatedLink;
	
	public void clickTag() {
		tag.click();
	}
	
	public void enterTagName(String tagName) {
		tagBox.sendKeys(tagName);
		tagBox.sendKeys(Keys.ENTER);
	}
	
	public void clickAddTag() {
		addTag.click();
	}
	
	public void entersecondTagName(String tagName) {
		tagBox2.sendKeys(tagName);
		tagBox2.sendKeys(Keys.ENTER);
	}
	
	public void sendAreaPath(String AreaPath) {
		areaPath.sendKeys(AreaPath);
	}
	
	public void copyStepstoRepro() {
		reproSteps.sendKeys(Keys.CONTROL,"v");
	}
	
	public void copyClientDetails(String client) {
		clientDetails.sendKeys(client);
	}
	
	public void clickExistingItem() {
		existingItem.click();
	}
	
	public void clickAddLink() {
		addLink.click();
	}
	
	public void addlinkType(String link) {
		linkType.sendKeys(Keys.CONTROL,"a");
		linkType.sendKeys(Keys.DELETE);
		linkType.sendKeys(link);
	}
	public void addWorkItem(String item) throws InterruptedException {
		workItem.sendKeys(Keys.CONTROL,"a");
		workItem.sendKeys(Keys.DELETE);
		workItem.sendKeys(item);
		workItem.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		workItem.sendKeys(Keys.ENTER);
	}
	
	public void clickOKBtn() {
		BtnOK.click();
	}
	
	public void deleteLink() {
		delLink.click();
	}
	
	public void enterTSGSeverity(String severity) {
		TSGSeverity.sendKeys(severity);
		new Actions(driver).keyDown(Keys.ESCAPE).perform();
	}
	
	public void enterRequestor(String requestor) {
		Requestor.sendKeys(requestor);
	}
	
	public void clickSaveAndCloseBtn() {
		SaveAndCloseBtn.click();
	}
	
	public String bugLink() {
		
		return Bugref.getText();
	}
	
	public String getbugID() {
		return BugID.getText();
	}
	
	public String getRelatedLink() {
		
		return relatedLink.getText();
				
	}

}

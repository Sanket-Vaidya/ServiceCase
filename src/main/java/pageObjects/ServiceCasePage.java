package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ServiceCasePage extends BasePage {
	public ServiceCasePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//ul[@role='menubar']//li[@aria-label='Actions'])[1]")
	public WebElement contextMenuBtn;

	@FindBy(xpath = "//span[text()='Create copy of work item...']")
	public WebElement copyWorkItemBtn;

	@FindBy(id = "project")
	public WebElement project;

	@FindBy(xpath = "//input[@id='wit']")
	public WebElement WorkItemType;

	@FindBy(xpath = "//label[text()='Include existing links']")
	public WebElement links;

	@FindBy(xpath = "//label[text()='Include existing attachments']")
	public WebElement attachments;

	@FindBy(id = "ok")
	public WebElement okBtn;
	
	@FindBy(xpath="//div[@data-placeholder='Click to add Description']")
	public WebElement stepsToReproduce;
	
	@FindBy(xpath="//input[@aria-label='Account and User Name']")
	public WebElement accountName;
	
	@FindBy(xpath="//input[@aria-label='Ultimate ID']")
	public WebElement ultimateId;
	
	@FindBy(xpath="//span[@aria-label='ID Field']")
	public WebElement serviceCaseId;
	
	@FindBy(xpath="//span[@aria-label='E365']")
	public List<WebElement> labelE365;
	
	@FindBy(xpath="//span[@aria-label='Account Size section.']")
	public WebElement accountSize;
	
	@FindBy(xpath="//label[text()='Aggregated Account Size']")
	public WebElement aggregatedAccountSize;
	
	@FindBy(xpath="//input[@aria-label='State Field']")
	public WebElement ServiceCaseState;
	
	@FindBy(xpath="//input[@aria-label='ServiceNow Priority']")
	public WebElement ServiceNowPriority;
	
	@FindBy(xpath="(//div[@aria-label='Search users and groups']//span)[4]")
	public WebElement RequestedBy;
	
	@FindBy(xpath="//li[@command='save-work-item']")
	public WebElement SaveBtn;

	public void contextMenuBtnclick() {
		contextMenuBtn.click();
	}

	public void copyWorkItemBtnClick() {
		copyWorkItemBtn.click();
	}

	public void selectProject() {
		project.click();
	}

	public void selectWorkItemType() {
		WorkItemType.click();
	}

	public void includeLinks() {
		links.click();
	}

	public void includeAttachments() {
		attachments.click();
	}

	public void clickokBtn() {
		okBtn.click();
	}
	
	public void copyStepsToRepeoduce() {
		stepsToReproduce.sendKeys(Keys.CONTROL,"a");
		stepsToReproduce.sendKeys(Keys.CONTROL,"c");
		
	}
	
	public void getAccountName() {
		accountName.sendKeys(Keys.CONTROL,"a");
		accountName.sendKeys(Keys.CONTROL,"c");
		
	}
	
	public void getUltimateID() {
		ultimateId.sendKeys(Keys.CONTROL,"a");
		ultimateId.sendKeys(Keys.CONTROL,"c");
		
	}
	
	public String getServiceCaseID() {
		return serviceCaseId.getText();
	}
	
	public boolean E365labelExists() {
		boolean E365Label;
		new Actions(driver).scrollToElement(aggregatedAccountSize).perform();
		driver.switchTo().frame(6);
		if(labelE365.size()>0)
			E365Label=true;
		else E365Label=false;
		driver.switchTo().defaultContent();
		return E365Label;
	}
	
	public void changeServiceCaseStatus(String state) {
		ServiceCaseState.sendKeys(Keys.CONTROL,"a");
		ServiceCaseState.sendKeys(Keys.DELETE);
		ServiceCaseState.sendKeys(state);
		ServiceCaseState.sendKeys(Keys.ENTER);
	}
	
	public void getServiceNowPriority() {
		
		ServiceNowPriority.sendKeys(Keys.CONTROL,"a");
		ServiceNowPriority.sendKeys(Keys.CONTROL,"c");
	}
	
	public String getRequestedBy() {
	return	RequestedBy.getText();
	}
	
	public void clickSave() {
		SaveBtn.click();
	}
	


}

package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QueryPage extends BasePage {

	public QueryPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@role='presentation' and @class='grid-canvas'] ")
	public WebElement table;
	
	@FindBy(xpath="//div[contains(@class,'grid-row')]")
	public List<WebElement> rows;
	
	@FindBy(xpath="//span[text()='Bug Defect Service Cases-BuildingDesign']")
	public WebElement pageOpen;
	
	
	
	

}

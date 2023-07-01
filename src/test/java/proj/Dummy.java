package proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dummy {
	
	WebDriver driver;
	
	public WebElement tag=driver.findElement(By.xpath("(//li[@class='tag-item tags-add-button tag-item-delete-experience']//span//span)[2]"));
	@Test
	public void tags() {
		
		tag.click();

	}
}
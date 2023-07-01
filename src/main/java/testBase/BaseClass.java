package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExcelUtility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriverWait wait;
	// public ResourceBundle rb;
	public Logger logger;
	static ExcelUtility excel;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {

		if (br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		logger = LogManager.getLogger(this.getClass());
		// rb =
		// ResourceBundle.getBundle("D:\\serviceCase\\proj\\src\\test\\java\\config.properties");
		wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// driver.get("http://localhost/opencart/upload/");
		driver.get(
				"https://dev.azure.com/bentleycs/Facilities%20Engineering/_queries/query/748c32f2-d840-4507-b6b7-4cf347959232/");

	}

/*	@AfterClass
	public void tearDown() {
		driver.quit();
	}*/

	public String captureScreen(String tname) {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takescreenshot = (TakesScreenshot) driver;

		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

	public static void fillExcelSheet() throws IOException {

		excel = new ExcelUtility(System.getProperty("user.dir") + "\\src\\test\\java\\ServiceCaseData.xlsx");
		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'grid-row')]"));
		List<String> idNo = new ArrayList<String>();
		int RowCount = excel.getRowCount("Sheet1");
		for (int i = 1; i <= RowCount; i++) {

			idNo.add(excel.getCellData("Sheet1", i, 0));
		}
		System.out.println(rows.size());
		int p = 0;

		for (int i = 0; i < rows.size(); i++) {

			String id = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][1]"))
					.getText();
			String AreaPath = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][7]"))
					.getText();
			String state = driver
					.findElement(
							By.xpath("//div[contains(@class,'grid-row')][" + (i + 1) + "]//div[@class='grid-cell'][4]"))
					.getText();
			System.out.println(AreaPath);
			String[] arr = AreaPath.split("\\\\");
			arr[0] = "Facilities Engineering";
			String newAreaPath = "";
			for (String string : arr) {
				if (string == arr[arr.length - 2])
					continue;
				else {
					if (string == arr[arr.length - 1])
						newAreaPath += string;
					else {
						newAreaPath += string + "\\";
					}
				}

			}

			System.out.println(id);

			if (idNo.contains(id))
				System.out.println("ID already present in excel sheet");
			else {
				idNo.add(id);
				excel.setCellData("Sheet1", RowCount + p + 1, 0, id);
				excel.setCellData("Sheet1", RowCount + p + 1, 2, newAreaPath);
				excel.setCellData("Sheet1", RowCount + p + 1, 1, "Bugs Not Created");
				p++;
				// excel.fillRedColor("Sheet1",RowCount+i, 1);
			}

			try {
				for (int c = 0; c < idNo.size(); c++) {
					if (Integer.parseInt(id) == Integer.parseInt(idNo.get(c))) {
						excel.setCellData("Sheet1", c + 1, 5, state);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
	
	

}

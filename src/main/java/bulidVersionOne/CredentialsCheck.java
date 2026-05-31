package bulidVersionOne;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CredentialsCheck {
	public  ChromeDriver driver;
	
	@DataProvider(name="fetchData")
	public String [][] setData() {
		String [][] data = new String[3][5];
		// Bhuvanesh
		data[0][0]="https://dev300891.service-now.com/";
		data[0][1]="admin";
		data[0][2]="03-xMN$nqSmU";
		data[0][3]="bhuvanesh.moorthy@testleaf.com";
		data[0][4]="Qeagle@2025";
		// seenivasan
		data[1][0]="https://dev181504.service-now.com/";
		data[1][1]="admin";
		data[1][2]="F/*jyM6Q6pHh";
		data[1][3]="seenivasan.shanmugam@testleaf.com";
		data[1][4]="Ss@120508";
		
		// Harrish
		
		data[2][0]="https://dev353629.service-now.com/";
		data[2][1]="admin";
		data[2][2]="jO2/kVIsw^V3";
		data[2][3]="harrish.alaguponniah@testleaf.com";
		data[2][4]="Harri123@";

		// vinoth
		data[3][0]="https://dev331650.service-now.com/";
		data[3][1]="admin";
		data[3][2]="Ig@-R6iFfOv1";
		data[3][3]="vinothkumar.sanmugaraj@testleaf.com";
		data[3][4]="vinothSV@09";
		
		// vinoth Automation
		data[4][0]="https://dev318657.service-now.com/";
		data[4][1]="admin";
		data[4][2]="rNq8Tl@%U9Zg";
		data[4][3]="vinothkumar.automation@gmail.com";
		data[4][4]="vinothSV@09";
		return data;
	}
	

	
	
	@Test(dataProvider = "fetchData")
	public void runBuildBhuvanesh(String url,String uname, String pword,String mid,String mpword) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();

		options.addArguments(
		    "--start-maximized",
		    "--disable-notifications",
		    "--disable-infobars",
		    "--disable-extensions",
		    "--disable-gpu",
		    "--no-sandbox",
		    "--disable-dev-shm-usage",
		    "--disable-web-security",
		    "--disable-features=IsolateOrigins,site-per-process",
		    "--headless=new",
		    "--window-size=1920,1080"
		);

		


				
		driver = new ChromeDriver(options);
		Wait<ChromeDriver> wait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(300))   // hibernation can take time
		        .pollingEvery(Duration.ofSeconds(30))
		        .ignoring(NoSuchElementException.class)
		        .ignoring(StaleElementReferenceException.class);
		driver.manage().window().maximize();
		driver.get(url);
		try {
			
			driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uname);
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pword);
			WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
			login.click();
			 driver.quit();
		} catch (Exception e) {
			Shadow sh = new Shadow(driver);
			
			if (driver.getPageSource().contains("Instance Hibernating page")) {
			   
			    wait.until(ExpectedConditions
			            .elementToBeClickable(By.xpath("//button[contains(text(),'Sign in')]")))
			            .click();

			    sh.setImplicitWait(30);
			    sh.findElementByXPath("//*[text()='Sign In']").click();

			    wait.until(ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//input[@name='username']")))
			            .sendKeys(mid);

			    wait.until(ExpectedConditions.elementToBeClickable(
			            By.xpath("//button[@type='submit']")))
			            .click();

			    wait.until(ExpectedConditions.visibilityOfElementLocated(
			            By.xpath("//input[@name='password']")))
			            .sendKeys(mpword);

			    driver.findElement(By.xpath("//button[@type='submit']")).click();
			    Thread.sleep(60000);
			    WebElement onlineStatus = wait.until(driver -> {
			        WebElement el = sh.findElementByXPath("//span[text()='Online']");
			        return el.isDisplayed() ? el : null;
			    });
			    Assert.assertTrue(onlineStatus.isDisplayed());
			    
			    driver.quit();
			} else {
			    // Normal login flow
			    wait.until(ExpectedConditions.visibilityOfElementLocated(
			            By.id("user_name"))).sendKeys(uname);

			    driver.findElement(By.id("user_password"))
			            .sendKeys(pword);

			    driver.findElement(By.xpath("//button[text()='Log in']")).click();
			    
			    driver.quit();
			}

			}
	}
	

}

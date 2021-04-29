package org.sample.projectjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dataproviders.DataProviderExcel;

public class SurfWebSitesTest {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setupDriver() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
				
	}
	
	@Test(dataProvider="getSiteURLs", dataProviderClass=DataProviderExcel.class)
	public void surfSites(String siteUrl) {
		
		driver.get(siteUrl);
		
		driver.manage().window().maximize();
		
		System.out.println("Browsing site: " + driver.getTitle());		
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		System.out.println("Quiting driver!!");
		
		driver.quit();
		
	}

}

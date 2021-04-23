package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SurfBrowsersTest {
	
	private WebDriver driver;
	
	@Given("^Initialize driver$")
	public void initializing_driver() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/resources/drivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
	}
	
	@Given("^The site to browse is \"([^\"]*)\"$")
	public void the_site_to_browse_is(String siteUrl) {
		
		
		driver.get(siteUrl);
		
		driver.manage().window().maximize();
		
		System.out.println("Browsing site: " + driver.getTitle());
		
		
		
	}

	@Then("^User shall get the title \"([^\"]*)\"$")
	public void user_shall_get_the_title(String title) {
		
		System.out.println("Asserting actual matching the expected.");
		
		Assert.assertEquals(driver.getTitle(), title);
		
		driver.quit();
		
	}
	
	

}

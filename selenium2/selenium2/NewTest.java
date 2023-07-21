package selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "https://demo.guru99.com/test/newtours/index.php";
	public WebDriver driver;

	@BeforeTest
	  public void setBaseUrl() {
		driver = new ChromeDriver();
		driver.get(baseUrl);		
	  }
	
  @Test
  public void verifyHomepageTitile() {
	  String expectedTitile = "Mercury Tours";
	  String actualTitile = driver.getTitle();
	  Assert.assertEquals(actualTitile, expectedTitile);
  }
}

package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public String baseUrl = "https://www.anphatpc.com.vn/";
	public WebDriver driver;

	@BeforeTest
	  public void setBaseUrl() {
		driver = new ChromeDriver();
		driver.get(baseUrl);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='popupContactClose']")).click();
	  }

	
  @Test(priority = 0)
  public void verifyHomepageTitile() {
	  String expectedTitile = "An Phát Computer Showroom máy tính được yêu thích nhất 2023 - anphatpc.com.vn";
	  String actualTitile = driver.getTitle();
	  Assert.assertEquals(actualTitile, expectedTitile);
  }
  @Test(priority = 1)
  public void verifySearchingbar() {
	  WebElement myElement = driver.findElement(By.xpath("//input[@id='js-search']"));
	  myElement.sendKeys("Laptop Asus");
	  driver.findElement(By.xpath("//button[@class='submit-search']]")).click();
	  String expectedTitile = "Danh sách Laptop Asus";
	  String actualTitile = driver.getTitle();
	  Assert.assertEquals(actualTitile, expectedTitile);
  }

  @AfterTest
  public void endtest() {
	  driver.close();
  }
}

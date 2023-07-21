package selenium2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.anphatpc.com.vn/");
			WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Đăng nhập')]"));
	        element.click();

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	            
	            
	            
	            WebElement username = driver.findElement(By.xpath("//input[@id='txtEmail']"));
	            username.sendKeys("StormIce1603@gmail.com");

	            WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
	            password.sendKeys("abc123");

	            // Submit form
	            WebElement loginButton = driver.findElement(By.xpath("//button[@id='btnLogin']"));
	            loginButton.click();

	            try {
	                Thread.sleep(5000);
	            } catch (InterruptedException e1) {
	                e1.printStackTrace();
	            }

	            driver.quit();
	        }
			}
			
	}



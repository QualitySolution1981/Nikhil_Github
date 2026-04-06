package Nikhil;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DoubleClick {
  WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		 driver = new ChromeDriver();
	        
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
	  }

	
	@Test
  public void f() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("window.scrollBy(0,200)", "");

	    

	    Thread.sleep(5000);
	    Thread.sleep(5000);

	    

	  Actions action=new Actions(driver);

	  WebElement dble_clc=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));

	  action.doubleClick(dble_clc);
  }
 
  @AfterTest
  public void afterTest() {
  }

}

package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility1 {
	


		
		//Waits
		
		@SuppressWarnings("deprecation")
		public static void implicitlyWait(int time,WebDriver driver) 
		{
			driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
		
		@SuppressWarnings("deprecation")
		public static WebElement explicitWait(WebDriver driver,WebElement element,int time)
		{
			WebDriverWait wait = new WebDriverWait(driver,time);
			
			WebElement elementReturn = wait.until(ExpectedConditions.visibilityOf(element));
			
			return elementReturn;
		}

}

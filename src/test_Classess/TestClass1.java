package test_Classess;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import base_Classess.Base_Class1;
import pom_Classess.LogInPage;


public class TestClass1 {

	WebDriver driver;

	@Test

	public void VerifyUserNameCanLOgIn() throws InterruptedException
	{

	  driver = Base_Class1.getWebDriver();
		
		LogInPage k= new LogInPage(driver);  //pass driver as argument

		k.EnterEmailID();
		
		Reporter.log("Entered EmailID");

		k.EnterPassword();

		Reporter.log("Entered Password");
		
		k.ClickOnSubmitButton();

		Reporter.log("Click on SubmiTButton");


	}

	@Test

	public void test2()
	{
		System.out.println("Execiting test 2");
	}

	@Test

	public void test3()
	{
		System.out.println("Execiting test 3");
	}

	@Test

	public void test4()
	{
		System.out.println("Execiting test 4");
	}
	@Test

	public void test5()
	{
		System.out.println("Execiting test 5");
	}
}

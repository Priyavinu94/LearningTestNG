package practiceTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceTestNG {
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("Executed before the class starts executing");
	}
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening the Browser");
	}
	
	@Test(priority = 1)
	public void printTitle() {
		System.out.println("Google");
		Assert.fail();
	}
	
	@Test(priority = 2, dependsOnMethods = "printTitle")
	public void viewSearchBar() {
		System.out.println("Search Google or type Url");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing the Browser");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("Executed after the class finishes executing");
	}
}

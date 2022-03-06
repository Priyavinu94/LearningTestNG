import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNG {
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening Browser");
	}
	
	@Test(priority = 2, dependsOnMethods = "printHelloManvir")
	public void printHelloKetaki() {
		System.out.println("Hello Ketaki");
	}
	
	@Test(priority = 1)
	public void printHelloManvir() {
		System.out.println("Hello Manvir");
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = "printHelloKetaki")
	public void printHelloPriya() {
		System.out.println("Hello Priya");
	}
	
	@Test(priority = 4)
	public void printHelloVinod() {
		System.out.println("Hello Vinod");
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing Browser");
	}
}

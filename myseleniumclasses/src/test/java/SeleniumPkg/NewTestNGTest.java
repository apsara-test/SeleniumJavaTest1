package SeleniumPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewTestNGTest {
	
	WebDriver driver=null;
	
  @Test
  public void OpenBrowser() {
	  		
	ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
			
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(spark);
			
			ExtentTest test = extent.createTest("MyFirstTest");
			test.pass("Text details");
			test.log(Status.PASS, "Text details");
			
			//extent.createTest("MyFirstTest")
		//	  .log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
			//extent.flush();
			
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumProject\\NewProjectSelenium\\SeleniumCourse\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https:www.google.com");
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			test.pass("Test key press Pass");
			
			driver.findElement(By.name("btnK")).click();
			test.pass("Test click Pass");
			
			driver.close();
			test.pass("Browser Closed");
			driver.quit();
			test.pass("Test Completed");
			
			extent.flush();
			
		}
  
  /*@Test(priority=1)
  public void TestFailedTest() {
  
	  System.out.println("Failed test");
	  Assert.assertEquals("apps", "ap");

  }*/
  
}


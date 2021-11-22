package SeleniumPkg;

import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.util.Assert;


public class TestMaven {

	
	 WebDriver driver=null;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
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

}

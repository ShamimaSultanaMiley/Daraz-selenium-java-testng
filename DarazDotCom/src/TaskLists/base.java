package TaskLists;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class base {

	WebDriver driver;

	@BeforeSuite
	public void driverSetUp() {
		System.setProperty("webdriver.chrome.driver", "J:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	} 
	
@BeforeMethod	
public void goToDaraz() throws InterruptedException {
	driver.get("https://www.daraz.com.bd/");
//	   driver.findElement(By.cssSelector("div.c-TFglq button:last-child")).click();
//	   driver.findElement(By.xpath("//a[@href='https://www.daraz.com.bd/#hp-official-stores']")).click();
	  
	
}
	@AfterSuite
	public void driverClose() {
		driver.close();
		
		
	}
	
}
//package TaskLists;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//
//public class base {
//
//    WebDriver driver;
//
//    @BeforeSuite
//    public void driverSetUp() {
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
//        chromeOptions.setImplicitWaitTimeout(Duration.ofSeconds(30));
//
//        System.setProperty("webdriver.chrome.driver", "J:\\driver\\chromedriver.exe");
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();
//        
//    } 
//
//    @BeforeMethod    
//    public void goToDaraz() throws InterruptedException {
//        driver.get("https://daraz.com/");
//        driver.findElement(By.cssSelector("div.c-TFglq button:last-child")).click();
//        driver.findElement(By.xpath("//a[@href='https://www.daraz.com.bd/#hp-official-stores']")).click();
//        Thread.sleep(3000);
//    }
//
//    @AfterSuite
//    public void driverClose() {
//        driver.close();
//    }
//}

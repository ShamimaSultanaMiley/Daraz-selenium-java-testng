package TaskLists;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class home_page_test extends base{
	@Test(priority=1)
	public void testSearchBoxExists() {
		Boolean isExists=driver.findElement(By.id("q")).isDisplayed();
		System.out.println("Actual output for searchbox" +isExists);
		Boolean expected =true;
		Assert.assertEquals(isExists, expected);
	}
	@Test(priority=2)
	public void testAddToCartOptionExists() {

		Boolean isDisplayed = driver.findElement(By.xpath("//div[@class='lzd-nav-cart']")).isDisplayed();
		System.out.println("Actual for Add to cart :" + isDisplayed);
		Boolean expected = true;
		Assert.assertEquals(isDisplayed, expected);
	}
	
	
	@Test(priority=3)
	public void testTotalCategoryTypes() throws InterruptedException {
  Thread.sleep(2000);

  
		List<WebElement>totalCategory = driver.findElements(By.xpath("//div[@class='card-categories-li hp-mod-card-hover align-left']"));
		int total =totalCategory.size();
		System.out.println("Total Category Types " +total);
		//Assert.assertTrue(total==16);
		Assert.assertEquals(total, 16);
		
		
	}	
	@Test(priority=4)
	public void categoryNames()  {
		
	List<WebElement>totalCategory = driver.findElements(By.xpath("//div[@class='card-categories-li hp-mod-card-hover align-left']"));
	int total =totalCategory.size();
	System.out.println("Total Category Types " +total);
	int index=1;
	for (WebElement category : totalCategory) {
		String categoryName=category.findElement(By.xpath(".//div[@class='card-categories-name'] /span")).getText();
		if(categoryName=="\r\n"
				+ "                  In-Ear Headphones\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  In-Ear Headphones\r\n"
					+ "                ");
		}
		
		else if(categoryName=="\r\n"
				+ "                  Wireless Earbuds\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Wireless Earbuds\r\n"
					+ "                ");
		}
		
		else if(categoryName=="\r\n"
				+ "                  Business\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Business\r\n"
					+ "                ");
		}
		
		else if(categoryName=="\r\n"
				+ "                  Onions\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Onions\r\n"
					+ "                ");
		}
		
		else if(categoryName=="\r\n"
				+ "                  Drawing Pad\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Drawing Pad\r\n"
					+ "                ");
		}
		
		else if(categoryName=="\r\n"
				+ "                  Soybean Oil\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Soybean Oil\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Hand Washes and Sanitizers\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Hand Washes and Sanitizers\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Trimmers, Groomers & Clippers\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Trimmers, Groomers & Clippers\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Casual\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Casual\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Wipes & Refills\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Wipes & Refills\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Door hardware & locks\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Door hardware & locks\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Trunks & Boxers\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Trunks & Boxers\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Clocks\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Clocks\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Basic\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Basic\r\n"
					+ "                ");
		}
		
		
		else if(categoryName=="\r\n"
				+ "                  Baking Tools & Accessories\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Baking Tools & Accessories\r\n"
					+ "                ");
		}
		else if(categoryName=="\r\n"
				+ "                  Fashion Wallets\r\n"
				+ "                ") {
			assertEquals(categoryName, "\r\n"
					+ "                  Fashion Wallets\r\n"
					+ "                ");
		}
		
		System.out.println("Category Name [" +index+ "] : " +categoryName);
		index++;
		
		
		
	}
				
				
			}
	
	
	
	@Test(priority=5)
	public void testTotalPaymentMethods() {
		
		List<WebElement>totalPaymentMethods =	driver.findElements(By.xpath("//div[@class='payment__card__wrapper']/span"));
	  int total=totalPaymentMethods.size();
		System.out.println("Total Payment Methods are " +total);
		//Assert.assertEquals(total, 9);
		Assert.assertTrue(total==9);
	}


}

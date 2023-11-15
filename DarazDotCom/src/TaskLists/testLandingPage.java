package TaskLists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testLandingPage extends base {

	@Test(priority=1)
	public void testSearchBoxExists() {
		Boolean isExists = driver.findElement(By.xpath("//input[@class='search-box__input--O34g']")).isDisplayed();
		System.out.println("Actual for SearchBox in landing page :" + isExists);
		Boolean expected = true;
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
	public void testAddToCartOptionActivated() {
        
		Boolean isEnabled = driver.findElement(By.xpath("//div[@class='lzd-nav-cart']")).isEnabled();
		System.out.println("Actual for add to cart active   :" + isEnabled);
		Boolean expected = true;
		Assert.assertEquals(isEnabled, expected);
	}

}


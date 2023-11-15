package TaskLists;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testSearchFirstPage extends base {

	@Test(priority = 1)
	public void testTotalSearchResult() {

		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");

		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();

		String totalSearchResult = driver.findElement(By.xpath("//div[@class=' tips--QRnmZ']")).getText();
		System.out.println("Total Search Result " + totalSearchResult);

		String expected = "5,357 items found for \"hp laptop core i5\"";
		Assert.assertEquals(totalSearchResult, expected);
	}

	@Test(priority = 2)
	public void testSearchResultForFirstPage() {
		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");		
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();
		
		driver.findElement(By.xpath("//div[@data-qa-locator='product-item']"));
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']"));
		
		int total = itemList.size();
		System.out.println("In First Page ,number of search iteams " + total);
		Assert.assertEquals(total, 40);

	}

}

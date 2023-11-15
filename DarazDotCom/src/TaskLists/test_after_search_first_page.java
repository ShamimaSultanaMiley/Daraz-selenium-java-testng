package TaskLists;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test_after_search_first_page extends base{
	
	@Test(priority = 1)
	public void totalSearchResultForFirstpage() {

		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();
		
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']"));
		int total = itemList.size();
		System.out.println("In First Page ,number of search iteams " + total);
		Assert.assertEquals(total, 40);

	}

	@Test(priority = 2)
	public void totalSearchResults_LowToHigh() {

		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();
		
		driver.findElement(By.cssSelector("div.sortSelect--jvN80")).click();
		
		driver.findElement(By.xpath("//div[text()='Price Low to High']")).click();
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']"));
		
		int total = itemList.size();
		System.out.println("In First Page ,number of search iteams for low to high " + total);
		Assert.assertEquals(total, 40);
	}
	
	@Test(priority = 3)
	public void totalSearchResults_HighToLow() {

		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();
		
		driver.findElement(By.cssSelector("div.sortSelect--jvN80")).click();
		
		driver.findElement(By.xpath("//div[text()='Price High to Low']")).click();
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']"));
		
		int total = itemList.size();
		System.out.println("In First Page ,number of search iteams for high to low" + total);
		Assert.assertEquals(total, 40);
	}
	
	@Test(priority = 4)
	public void totalSearchResults_BestMatch() {

		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();
		
		driver.findElement(By.cssSelector("div.sortSelect--jvN80")).click();
		
		driver.findElement(By.xpath("//li[@title='Best Match']/div[text()='Best Match']")).click();
		List<WebElement> itemList = driver.findElements(By.xpath("//div[@data-qa-locator='product-item']"));
		
		int total = itemList.size();
		System.out.println("total SearchResults for BestMatch = " + total);
		Assert.assertEquals(total, 40);
	}

	@Test(priority = 5)
	public void typesOfPromotionAndServices() {
		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();

		List<WebElement> promotionAndServicesList = driver.findElements(By.xpath("//div[@class='service-wrap--hd8d6']/div[@class='service-item--PR9FA']"));
		int total = promotionAndServicesList.size();
		System.out.println("total Promotion And Services List = " + total);

		for (WebElement service : promotionAndServicesList) {
			String serviceName = service.findElement(By.xpath(".//div")).getText();
			System.out.println(" Promotion And Services name = " + serviceName);

			if (serviceName == "Free Delivery") {

				Assert.assertTrue(serviceName == "Free Delivery", "Spelling incorrect");
			}

			else if (serviceName == "Best Price Guaranteed") {

				Assert.assertTrue(serviceName == "Best Price Guaranteed", "Spelling incorrect");
			} else if (serviceName == "Authentic Brands") {

				Assert.assertTrue(serviceName == "Authentic Brands", "Spelling incorrect");
			}

			else if (serviceName == "Daraz Verified") {

				Assert.assertTrue(serviceName == "Daraz Verified", "Spelling incorrect");
			} else if (serviceName == "Cash On Delivery") {

				Assert.assertTrue(serviceName == "Cash On Delivery", "Spelling incorrect");
			} else if (serviceName == "Installment") {

				Assert.assertTrue(serviceName == "Installment", "Spelling incorrect");
			}

			else if (serviceName == "Mega Deals") {

				Assert.assertTrue(serviceName == "Mega Deals", "Spelling incorrect");
			} else if (serviceName == "Hot Deals") {

				Assert.assertTrue(serviceName == "Hot Deals", "Spelling incorrect");
			}

		}
	}

	@Test(priority=6)
	public void typesOfWarranty() {
		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();

		List<WebElement> typesOfWarrantyList = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[9]/div[2]/div/div/label"));
		int total = typesOfWarrantyList.size();
		System.out.println("total types Of Warranty List = " + total);

		for (WebElement warranty : typesOfWarrantyList) {
			String warrantyName = warranty.findElement(By.xpath(".//span[2]")).getText();
			System.out.println(" Promotion And Services name = " + warrantyName);

			if (warrantyName == "Seller Warranty") {

				Assert.assertTrue(warrantyName == "Seller Warranty", "Spelling incorrect");
			} else if (warrantyName == "Brand Warranty") {

				Assert.assertTrue(warrantyName == "Brand Warranty", "Spelling incorrect");
			}

			else if (warrantyName == "No Warranty") {

				Assert.assertTrue(warrantyName == "No Warranty", "Spelling incorrect");
			}
		}
	}
	
	@Test(priority=7)
	public void typesOfLocation() {
		driver.findElement(By.cssSelector("input#q")).sendKeys("hp laptop core i5");
		driver.findElement(By.cssSelector("button.search-box__button--1oH7")).click();

		List<WebElement> typesOfLocationList = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div/div[2]/div/div[7]/div[2]/div/div/label"));
		int total = typesOfLocationList.size();
		System.out.println("total types Of Location List = " + total);

		for (WebElement location : typesOfLocationList) {
			String locationName = location.findElement(By.xpath(".//span[2]")).getText();
			System.out.println(" Location name = " + locationName);

			if (locationName == "China") {

				Assert.assertTrue(locationName == "China", "Spelling incorrect");
			} else if (locationName == "Bangladesh") {

				Assert.assertTrue(locationName == "Bangladesh", "Spelling incorrect");
			}

			
		}
	}
	
}

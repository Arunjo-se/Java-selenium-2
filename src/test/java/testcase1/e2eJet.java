package testcase1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class e2eJet {

	WebDriver driver = new ChromeDriver();

	@Test
	public void f() throws InterruptedException {

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='DEL']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();

		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();

		System.out.println("test: " + driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			Assert.assertTrue(true);
			System.out.println("1st");

		}

		else

		{

			Assert.assertFalse(false);
			System.out.println("2nd");

		}

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		
		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driver.findElement(By.cssSelector("input[value='Search']")).click();

		// driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	}

	@BeforeSuite
	public void beforeSuite() {

		// driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();
	}

}

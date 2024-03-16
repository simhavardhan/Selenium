package Scrolling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollingWindowandObject {

	public static void main(String[] args) {
		
		WebDriver bm = new ChromeDriver();
		bm.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		bm.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =(JavascriptExecutor)bm;
		js.executeScript("window.scroll(0,700)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> amount = bm.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int add=0;
		for(int i=0; i<amount.size();i++) {
			add = add+ Integer.parseInt(amount.get(i).getText());       
		}
		int Expectsum = Integer.parseInt(bm.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
		Assert.assertEquals(add, Expectsum);
		System.out.println(Expectsum);
		System.out.println(add);

	}

}

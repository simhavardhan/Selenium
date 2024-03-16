package CheckBoxes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {

	public static void main(String[] args) {
         
		WebDriver t = new ChromeDriver();
		t.manage().window().maximize();
		t.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertTrue(t.findElement(By.xpath("//div[@class='fleft home-StudentDiscount tooltip home-Discount home-Discount3 IAF-mobile'] //input[@type='checkbox']")).isDisplayed());
		t.findElement(By.xpath("//div[@id='ctl00_mainContent_IndArm']")).click();
		Assert.assertTrue(t.findElement(By.cssSelector("div[style*='mar'] div[class*=StudentDiscount] input[type*=check]")).isSelected());
	   
	}

}

package NewFeatureMultipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver ma = new ChromeDriver();
		ma.manage().window().maximize();
		ma.get("https://rahulshettyacademy.com/angularpractice/");
		ma.switchTo().newWindow(WindowType.TAB);
		Set<String> windows = ma.getWindowHandles();
		Iterator<String> window = windows.iterator();
		String Parentwindow = window.next();
		String Childwindow = window.next();
		ma.get("https://rahulshettyacademy.com/");
		ma.switchTo().window(Childwindow);
		String coursename = ma.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		ma.switchTo().window(Parentwindow);
	    ma.findElement(By.xpath("//input[@minlength='2']")).sendKeys(coursename);
	}

}

package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocator {

	public static void main(String[] args) {
		
		WebDriver ab = new ChromeDriver();
		ab.manage().window().maximize();
		ab.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement Text =ab.findElement(By.xpath("//input[@name='name']"));
		String name = ab.findElement(with(By.tagName("label")).above(Text)).getText();
		System.out.println(name);
		WebElement checkbox = ab.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		ab.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		WebElement radiobutton = ab.findElement(By.xpath("//input[@id='inlineRadio1']"));
		String name2 = ab.findElement(with(By.tagName("label")).toRightOf(radiobutton)).getText();
		System.out.println(name2);
		WebElement dob = ab.findElement(By.xpath("//label[@for='dateofBirth']"));
		ab.findElement(with(By.tagName("input")).below(dob)).click();
		
		

	}

}

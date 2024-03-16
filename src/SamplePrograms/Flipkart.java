package SamplePrograms;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;


public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver rv = new ChromeDriver();
		rv.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		rv.manage().window().maximize();
		rv.get("https://www.flipkart.com/");
		Actions c = new Actions(rv);
		
		c.moveToElement(rv.findElement(By.xpath("//div[@class='_1ch8e_ _1mZ8pZ'] //div[@class='YBLJE4']"))).contextClick().build().perform();
		rv.findElement(By.xpath("//a[@class='_3490ry'][1]")).click();
		
		

	}

}

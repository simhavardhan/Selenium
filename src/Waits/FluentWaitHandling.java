package Waits;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitHandling {

	public static void main(String[] args) {
       
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/dynamic-loading");
		dr.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is')]")).click();
		dr.findElement(By.cssSelector(".btn.btn-primary")).click();
		Wait<WebDriver> w = new FluentWait<WebDriver>(dr).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
	        WebElement element = w.until(new Function<WebDriver,WebElement>(){
			
			@Override
			public WebElement apply(WebDriver dr) {
				WebElement loadelement = dr.findElement(By.cssSelector("div#finish h4"));
				if(loadelement.isDisplayed()) {
				return loadelement;
				}
				else {
					return null;
				}
			}
			
		});
		System.out.println(element.getText());
		
	}

}

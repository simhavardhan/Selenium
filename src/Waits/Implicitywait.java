package Waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitywait {
         
		static int count=0;
		public static void main(String[] args) {
	     
			WebDriver re = new ChromeDriver();
			re.manage().window().maximize();
			
			re.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			re.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String[] items = {"Brocolli","Cauliflower","Cucumber","Beans","Tomato","Potato","Mushroom","Apple","Corn","Musk Melon","Raspberry","Walnuts"};
			addcartto(re,items);
			
		}
		
		public static void addcartto(WebDriver re, String[] items) {
			
			List<WebElement> products = re.findElements(By.cssSelector(".product-name"));
			List<WebElement> Addtocart = re.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']"));
			for(int i=0;i<products.size();i++) {
				List listofitems = Arrays.asList(items);
				String Productname = products.get(i).getText();
				String FinalProductname = Productname.split("-")[0].trim();
				if(listofitems.contains(FinalProductname)) {
					count++;
					Addtocart.get(i).click();
					if(count==listofitems.size()) {
						break;
					}
				}
			}
			re.findElement(By.xpath("//img[@alt='Cart']")).click();
			re.findElement(By.xpath("//div[@class='cart-preview active'] //div[@class='action-block'] //button[@type='button']")).click();
			re.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		    re.findElement(By.cssSelector(".promoBtn")).click();
		    String promomsg = re.findElement(By.cssSelector(".promoInfo")).getText();
		    System.out.println(promomsg);
	}

}

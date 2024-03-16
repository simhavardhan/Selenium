package Waits;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitywaitongreenkart {
      static int count =0;
      static WebDriverWait wait;
	public static void main(String[] args) {
        
		WebDriver we = new ChromeDriver();
		we.manage().window().maximize();
		we.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 wait = new WebDriverWait(we,Duration.ofSeconds(5));
		we.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] items = {"Cauliflower","Tomato","Potato","Apple","Mango"};
		process(we,items);
		
	}
	
	public static void process(WebDriver we,String[] items) {
		
		List<WebElement> itemslocators = we.findElements(By.cssSelector(".product-name"));
		List<WebElement> addcartlocators = we.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']"));
		for(int i=0; i<itemslocators.size();i++) {
			List listofitems = Arrays.asList(items);
			
			String productname = itemslocators.get(i).getText();
			String finalproductname = productname.split("-")[0].trim();
			//System.out.println(finalproductname);
			if(listofitems.contains(finalproductname)) {
				count++;
				addcartlocators.get(i).click();
				if(count==listofitems.size()) {
					break;
				}
				
			}
		}
		we.findElement(By.xpath("//img[@alt='Cart']")).click();
		we.findElement(By.xpath("//div[@class='cart-preview active'] //div[@class='action-block'] //button[@type='button']")).click();
		we.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
	    we.findElement(By.cssSelector(".promoBtn")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
	    String promomsg = we.findElement(By.cssSelector(".promoInfo")).getText();
	    System.out.println(promomsg);
	}

}

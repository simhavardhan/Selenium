package SamplePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class StansalonTest2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver vr = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(vr,Duration.ofSeconds(5));
	     vr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     vr.get("https://rahulshettyacademy.com/client");
	     JavascriptExecutor j= (JavascriptExecutor)vr;
	     vr.manage().window().maximize();
	     vr.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("simhavardhan170@gmail.com");
	     vr.findElement(By.xpath("//div//input[@id='userPassword']")).sendKeys("17051999@Ss");
	     vr.findElement(By.xpath("//input[@id='login']")).click();
	     List<WebElement> addcart = vr.findElements(By.xpath("//button[@class='btn w-10 rounded']"));
	     for(int i=0; i<addcart.size();i++) {
		  //w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn w-10 rounded']")));
	    	addcart.get(i).click();
	    	System.out.println(vr.findElements(By.cssSelector("h5[style='text-transform: uppercase;']")).get(i).getText() + ": Item is Added into the cart");
	    	Thread.sleep(2000);
	     }
	     vr.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
	     j.executeScript("window.scrollBy(0,800)");
	     System.out.println("Total amount : " + vr.findElement(By.xpath("//li[@class='totalRow'][2]//span[@class='value']")).getText());
	     Thread.sleep(3000);
	     vr.findElement(By.cssSelector("li button[type='button']")).click();
	     Thread.sleep(3000);
	     WebElement expirymonth = vr.findElement(By.xpath("//select[1]"));
	     Select sd = new Select(expirymonth);
	     sd.selectByVisibleText("09");
	     System.out.println("ExpiryMonth Of Your Card : " + sd.getFirstSelectedOption().getText());
	     WebElement expirydate = vr.findElement(By.xpath("//select[2]"));
	     Select sdd = new Select(expirydate);
	     sdd.selectByVisibleText("30");
	     System.out.println("Expirydate Of Your Card : " + sdd.getFirstSelectedOption().getText());
	     WebElement NameText =vr.findElement(By.xpath("//div[contains(text(),'Name on Card')]"));
	     vr.findElement(with(By.tagName("input")).toRightOf(NameText)).sendKeys("5657");
	     WebElement ApplycouponText =vr.findElement(By.xpath("//div[contains(text(),'Apply Coupon')]"));
	     vr.findElement(with(By.tagName("input")).above(ApplycouponText)).sendKeys("Vardhan");
	     vr.findElement(By.xpath("//input[@name='coupon']")).sendKeys("rahulshettyacademy");
	     vr.findElement(By.xpath("//button[@type='submit']")).click();
	     w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='mt-1 ng-star-inserted']")));
	    String Coupontext = vr.findElement(By.cssSelector("p[class='mt-1 ng-star-inserted']")).getText();
	    System.out.println(Coupontext);
	     String country = "India";
	     
	     vr.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys(country);
	     List<WebElement> countryloctors = vr.findElements(By.xpath("//button[@type='button']"));
	     for(int i=0; i<countryloctors.size();i++) {
	    	 String EachCountryName = countryloctors.get(i).getText();
	    	 if(EachCountryName.equalsIgnoreCase(country)) {
	    		 countryloctors.get(i).click();
	    	 }
	     }
	     vr.findElement(By.cssSelector("a[class='btnn action__submit ng-star-inserted']")).click();
	     Thread.sleep(1000);
	    System.out.println(vr.findElement(By.cssSelector(".hero-primary")).getText());
	}

}

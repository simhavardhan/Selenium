package RealtimeinterviewQuestion;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class Numberofitemsadded {
	static int count=0;
	public static void main(String[] args) {
     
		WebDriver re = new ChromeDriver();
		re.manage().window().maximize();
		
		re.get("https://rahulshettyacademy.com/seleniumPractise/#/");
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
	}

}

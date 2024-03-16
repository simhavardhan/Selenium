package RealtimeinterviewQuestion;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

public class RealtimeInterviewQuestion {
	
	public static void main(String args[]) {
		
		WebDriver er = new ChromeDriver();
		er.manage().window().maximize();
		er.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String r = "Cucumber";
		List<WebElement> Products = er.findElements(By.cssSelector("h4.product-name"));
		System.out.println(Products.size());
		List<WebElement> Addtocart = er.findElements(By.xpath("//div[@class='product-action'] //button[@type='button']"));
//		System.out.println(Products.get(0).getText());
//		System.out.println(Products.get(1).getText());
		for(int i=0;i<Products.size();i++) {
	    String ProductsName = Products.get(i).getText();
	  //  System.out.println(ProductsName);
	    String FinalProductName = ProductsName.split("-")[0].trim();
	  //  System.out.println(FinalProductName);
		if(FinalProductName.equalsIgnoreCase(r)) {
			Addtocart.get(i).click();
			break;
		}
		}
	}

}

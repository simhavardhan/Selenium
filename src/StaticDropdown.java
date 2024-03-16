import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {

		WebDriver r = new ChromeDriver();
		
		r.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement t = r.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select s = new Select(t);
	    s.selectByIndex(3);
	    System.out.println(s.getFirstSelectedOption().getText());
	    s.selectByValue("INR");
	    System.out.println(s.getFirstSelectedOption().getText());
	    s.selectByVisibleText("AED");
	    System.out.println(s.getFirstSelectedOption().getText());

	}

}

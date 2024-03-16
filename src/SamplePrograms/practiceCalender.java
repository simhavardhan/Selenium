package SamplePrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCalender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver m = new ChromeDriver();
		m.get("https://www.path2usa.com/travel-companion/");
		m.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		m.manage().window().maximize();
		Thread.sleep(2000);
	
		JavascriptExecutor ja =(JavascriptExecutor)m;
		ja.executeScript("window.scroll(0,1000)");
		Thread.sleep(2000);
		
		m.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		List<WebElement> days = m.findElements(By.cssSelector(".dayContainer span"));
	    String month =  m.findElement(By.xpath("//span[@class='cur-month'] ")).getText();
	    WebElement nextmonth =m.findElement(By.cssSelector(".flatpickr-next-month svg"));
	    
	    String day="30";
	    String selectmonth="March";
	    while(!month.equals(selectmonth)) {
	    	nextmonth.click();
	    	Thread.sleep(2000);
	    	if(m.findElement(By.xpath("//span[@class='cur-month'] ")).getText().equals(selectmonth)) {
	    		break;
	    	}
	    }
	    for(int i=0; i<days.size();i++) {
	    	
	    	if(m.findElements(By.cssSelector(".dayContainer span")).get(i).getText().equals(day)) {
	    		
	    		m.findElements(By.cssSelector(".dayContainer span")).get(i).click();
	    	}
	    }
	    
	}

}

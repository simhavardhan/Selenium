package MultipleWindows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class MultipleWindowsHandling {

	public static void main(String[] args) {
        
		WebDriver bd = new ChromeDriver();
		bd.manage().window().maximize();
		bd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		bd.get("https://rahulshettyacademy.com/loginpagePractise/#");
		bd.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues/ResumeAssistance/Material')]")).click();
		int totalopenedwindows = bd.getWindowHandles().size();
		System.out.println(totalopenedwindows);
	    Set<String> windows = bd.getWindowHandles();
	    System.out.println(windows);
	    Iterator<String> itr = windows.iterator();
	    String parentwindow = itr.next();
	   
	    while(itr.hasNext()) {
	    	
	    	 String childwindow = itr.next();
	    	if(childwindow != parentwindow) {
	    		//System.out.println(childwindow);
	    		bd.switchTo().window(childwindow);
	    		break;
	    	}
	    }
	   String mailid = bd.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	   System.out.println(mailid);
	   bd.close();
	   bd.switchTo().window(parentwindow);
	   bd.findElement(By.xpath("//input[@type='text']")).sendKeys(mailid);
	   
	}

}

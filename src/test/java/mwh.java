
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class mwh {

	public static void main(String[] args) 
	{
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32_83.0.4103.39\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		String baseurl = "http://demo.guru99.com/popup.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		String mainwindow = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1.size());

		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
		String childwindow = i1.next();
		if(!mainwindow.equals(childwindow))
		driver.switchTo().window(childwindow);
		driver.findElement(By.name("emailid")).sendKeys("tania@gmail.com");
		driver.findElement(By.name("btnLogin")).submit();
		}



		
		
		
	}

}

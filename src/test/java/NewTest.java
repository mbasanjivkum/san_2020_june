import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest
{
	public WebDriver driver;
	public String baseurl = "http://www.google.com" ;
	public String driverpath = "C:\\Users\\dell\\Downloads\\chromedriver_win32_83.0.4103.39\\chromedriver.exe";

	  @Test
	  public void f()
	  {
	 
	 driver.findElement(By.xpath("//*[@class='gb_g']")).click();
	  }
	 
	  @BeforeTest
	  public void beforeTest()
	  {
	 
	 System.setProperty("webdriver.chrome.driver",driverpath);
	 driver = new ChromeDriver();
	 driver.get(baseurl);
	  }

	  @AfterTest
	  public void afterTest() {
	 
	 driver.close();
	  }

}

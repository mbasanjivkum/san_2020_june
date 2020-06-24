
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class new_tour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	     System.setProperty ("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32_83.0.4103.39\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     String baseurl = "http://demo.guru99.com/test/newtours/register.php";
	     driver.get("http://demo.guru99.com/test/newtours/register.php");
	     driver.manage().window().maximize();
	     /*driver.findElement(By.name("firstName")).sendKeys("Tania");
	     driver.findElement(By.name("lastName")).sendKeys("Roy");
	     driver.findElement(By.name("phone")).sendKeys("123456789");
	     driver.findElement(By.id("userName")).sendKeys("tania.roy207@gmail.com");
	     driver.findElement(By.name("address1")).sendKeys("abc");
	     driver.findElement(By.name("city")).sendKeys("ABC");
	     driver.findElement(By.name("state")).sendKeys("AbcdEfg");
	     driver.findElement(By.name("postalCode")).sendKeys("6678"); */
	     /*Select countrydropdown = new Select (driver.findElement(By.name("country")));
	     List<WebElement> numberofcountries = countrydropdown.getOptions();
	     int count = numberofcountries.size();
	     System.out.println(count);
	     countrydropdown.selectByValue("ANDORRA");
	     int i=0 ;
	     for (WebElement we : numberofcountries )
	     {
	    String countryname = numberofcountries.get(i).getText();
	    System.out.println(countryname);
	    i++;
	    if (i==4)
	    break;
	     } */
	     
	     Actions builder= new Actions(driver);
	     WebElement link_Home = driver.findElement(By.linkText("Home"));
	     WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]"
	      + "/table/tbody/tr/td[1]"
	      + "/table/tbody/tr/td/"
	      + "table/tbody/tr/td/"
	      + "table/tbody/tr[1]/td[1]"));
	     Action mouseoverhome = builder.moveToElement(link_Home).build();
	     
	    String bgcolor = td_home.getCssValue("background-color").toString();
	   
	    String[] numbers = bgcolor.replace("rgba(", "").replace(")", "").split(",");
	    int number1=Integer.parseInt(numbers[0]);
	    numbers[1] = numbers[1].trim();
	    int number2=Integer.parseInt(numbers[1]);
	    numbers[2] = numbers[2].trim();
	    int number3=Integer.parseInt(numbers[2]);
	    
	    String hex = String.format("#%02x%02x%02x", number1,number2,number3);
	    
	    System.out.println(hex);
	    
	    
	    // System.out.println(bgcolor);
	    mouseoverhome.perform();
	    //System.out.println(bgcolor);
	}

}

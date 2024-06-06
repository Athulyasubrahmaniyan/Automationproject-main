package Testpkg;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pagepkg.Yaamipagepkg;
import Utilities.Yaamiutil;


public class Yaamitestpkg {
	WebDriver driver;
	String baseurl="https://www.yaamidesigns.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	@Test(priority=4)
	public void test() throws Exception
	{
	Yaamipagepkg ob=new Yaamipagepkg(driver);
	
	ob.flogin();
	String xl="C:\\Users\\User\\Desktop\\Book5.xlsx";
	String Sheet="Sheet1";
	int rowcount=Yaamiutil.getRowCount(xl,Sheet);
	for(int i=1;i<=rowcount;i++)
	{
		String username=Yaamiutil.getcellvalues(xl,Sheet,i,0);
		System.out.println("username--"+username);
		String password=Yaamiutil.getcellvalues(xl, Sheet, i, 1);
		System.out.println("password--"+password);
		ob.setValues(username,password);
		ob.login();
		}
	
	ob.Logo();
	ob.narrivals();
	ob.sorting();
	ob.addit();
	ob.addcart();
	ob.viewcart();
	ob.checkout();
	ob.details();
	
	driver.navigate().back();
	}
	@Test(priority=1)
	public void url()
	{
		String currenturl=driver.getCurrentUrl();
		String expurl="https://www.yaamidesigns.com/";
		if(currenturl.equals(expurl))
		{
			System.out.println("verified");
		}
		else
		{
			System.out.println("failed");
		}

	}
	@Test(priority=3)
	public void screenShot() throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileHandler.copy(src, new File("C:\\Users\\User\\Desktop\\screenshot\\yaami.png"));
		
	}
	@Test(priority=2)
	public void link()
	{
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement c:li)
		{
			System.out.println(c.getText()+"-----"+c.getAttribute("href"));
		}

}
		
 

 }



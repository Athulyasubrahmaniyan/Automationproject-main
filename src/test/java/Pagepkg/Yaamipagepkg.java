package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yaamipagepkg {
WebDriver driver;
@FindBy(xpath="//*[@id=\"container-box\"]/div[2]/div/div[1]/a/img")
WebElement logo;
@FindBy(xpath="//*[@id=\"container-box\"]/div[2]/div/div[3]/a[1]")
WebElement login;
@FindBy(xpath="//*[@id=\"username\"]")
WebElement yuname;
@FindBy(xpath="//*[@id=\"password\"]")
WebElement ypswd;
@FindBy(xpath="//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
WebElement ylogin;
@FindBy(xpath="//*[@id=\"menu-main-menu-1\"]/li[1]/a")
WebElement arrivals;
@FindBy(xpath="//*[@id=\"main\"]/form/select")
WebElement sort;
@FindBy(xpath="//*[@id=\"main\"]/ul/li[4]/a/img")
WebElement add;
@FindBy(xpath="//*[@id=\"product-45566\"]/div[2]/form/div/div/div[2]/button")
WebElement cart;
@FindBy(xpath="//*[@id=\"container-box\"]/div[2]/div/div[3]/a[2]/img")
WebElement vcart;
@FindBy(xpath="//*[@id=\"container-box\"]/div[3]/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/a")
WebElement cout;
@FindBy(xpath="//*[@id=\"billing_first_name\"]")
WebElement fname;
@FindBy(xpath="//*[@id=\"billing_last_name\"]")
WebElement lname;
@FindBy(xpath="//*[@id=\"billing_address_1\"]")
WebElement address;
@FindBy(xpath="//*[@id=\"billing_city\"]")
WebElement city;

@FindBy(xpath="//*[@id=\"billing_postcode\"]")
WebElement pcode;
@FindBy(xpath="//*[@id=\"billing_email\"]")
WebElement eadress;
@FindBy(xpath="//*[@id=\"billing_phone\"]")
WebElement phno;


public Yaamipagepkg(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void flogin()
{
	login.click();
}

public void setValues(String uname,String pswd)
{
	yuname.clear();
	yuname.sendKeys(uname);
	yuname.clear();
	ypswd.sendKeys(pswd);
}
public void login()
{
	ylogin.click();
}
public void Logo()
{
	logo.isDisplayed();
}
public void narrivals()
{
	arrivals.click();
}
public void sorting()
{
	sort.click();
}
public void addit()
{
	add.click();
}
public void addcart()
{
	cart.click();
}
public void viewcart()
{
	vcart.click();
}
public void checkout() {
	cout.click();
}
public void details()
{
	fname.sendKeys("Athulya");
	lname.sendKeys("S");
	address.sendKeys("abc");
	city.sendKeys("kochi");
	pcode.sendKeys(String.valueOf(653456));
	phno.sendKeys(String.valueOf(1234567890));
	eadress.sendKeys("abc@gmail.com");
}
		
}
	


package Module2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom2.Details1;
import pom2.Homepage1;
import pom2.Loginpage1;

public class Test2 {

	WebDriver driver;
	Loginpage1 l;
	Homepage1 h;
	Details1 d;

	@BeforeClass
	public void setuo() {

//	Set system properties to get browser
	System.setProperty("webdriver.chrome.driver", "/Users/goutamraju/Desktop/Drivers/chromedriver-mac-arm641/chromedriver");
	 driver = new ChromeDriver();

	}


	@BeforeMethod
	public void loginapp() {

	driver.get("http://admin.hospiol.com/site/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	l=new Loginpage1(driver);
	l.Username();
	l.Password();
	l.login();
	System.out.println("loggin successful");

	}

	@Test
	public void homep() {

		h= new Homepage1(driver);
		System.out.println("add bill page came");
		h.Radilogy();
		h.getbill();

		d= new Details1(driver);
		d.Addname();
		d.Doctorname();
		d.Cashname();
		d.discount();
		d.Calculator();
		System.out.println("almost donw");

	}

	@AfterMethod
	public void Aftrm() {
		System.out.println("done methods");
	}

	@AfterClass
	public void aftrclas() {
		System.out.println("done automation");
	}

}

package com.hsopial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom1.Homepage;
import pom1.Loginpage;
import pom1.Radiology;


public class Test1 {

	WebDriver driver;
	Loginpage l;
	Homepage h;
	Radiology r;

	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/goutamraju/Desktop/Drivers/chromedriver-mac-arm641/chromedriver");
	    driver = new ChromeDriver();
	}

	@BeforeMethod
	public void url() {
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);


		l = new Loginpage(driver);
		l.Username();
		l.Password();
		l.login();

	    h = new Homepage(driver);

		}

@Test
public void Check() {
System.out.println("hi");

//	h.Radilogy();
//	h.Radtest();
//	h.AddTest();

	/*Details d = new Details(driver);
	d.Addname();
	d.Shortname();
	d.Catgtname();
	d.Catgchrge();
	d.Catgtname();
	d.Savebutton(); */

	 r= new Radiology(driver);

	r.SelectRadiology();
	r.SelectRadiologytest();
	r.SelectAddRadiology();
	r.SelectName();
	r.SelectChargeCategory();
	r.ChargeN();
	r.SelectChargeName();

	System.out.println("seleted");





}

@AfterMethod
public void Close() throws InterruptedException {
	Thread.sleep(1000);
//	driver.quit();

	}
@AfterClass
public void after() {
	System.out.println("done");
}

}

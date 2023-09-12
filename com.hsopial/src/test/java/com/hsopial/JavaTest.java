package com.hsopial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom1.Details;
import pom1.Homepage;
import pom1.Loginpage;

public class JavaTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/goutamraju/Desktop/Drivers/chromedriver_mac_arm64/chromedriver");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.get("http://admin.hospiol.com/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		Loginpage l = new Loginpage(driver);
		l.Username();
		l.Password();
		l.login();

		System.out.println("loggined in ");

		Homepage h = new Homepage(driver);

		h.Radilogy();
		h.Radtest();
		h.AddTest();

		System.out.println("reached home page");

		Details d = new Details(driver);
		d.Addname();
		d.Shortname();
		d.Catgtname();
		d.Catgchrge();
		Thread.sleep(1000);
		d.chrgname();
		d.TestparaName();
		d.Savebutton();
		System.out.println("saved successfully");


//		driver.quit();

	}


	}



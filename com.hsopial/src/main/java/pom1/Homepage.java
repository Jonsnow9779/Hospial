package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//a[@href='http://admin.hospiol.com/admin/radio/gettestreportbatch']")
	private WebElement sRadi;

	@FindBy(xpath="//button[@class='btn btn-primary btn-sm radiology addtest']")
	private WebElement AddRtest;

	@FindBy(xpath="//a[@class='btn btn-primary btn-sm']")
	private WebElement Rtest;



	WebDriver driver;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}

	 public void Radilogy() {
		 sRadi.click();
	 }

	 public void Radtest() {
		 Rtest.click();
	 }
	 public void AddTest() {
		 AddRtest.click();
	 }



}

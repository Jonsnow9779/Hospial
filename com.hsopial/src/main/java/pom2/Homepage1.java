package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	@FindBy(xpath="//a[@href='http://admin.hospiol.com/admin/radio/gettestreportbatch']")
	private WebElement sRadi;

	@FindBy(xpath="//button[@id='load1']")
	private WebElement bill;




	WebDriver driver;
	public Homepage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}

	 public void Radilogy() {
		 sRadi.click();
	 }

	 public void getbill() {
		 bill.click();
	 }





}

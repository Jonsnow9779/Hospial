package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@name='username']")
	private WebElement name;

	@FindBy(xpath="//input[@name='password']")
	private WebElement pas;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;


	WebDriver driver;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this );
		this.driver = driver;
	}

	public void Username() {
		name.sendKeys("abhishek@marolix.com");

	}

	public void Password() {
		pas.sendKeys("Reset@123");

	}

	public void login() {
		button.click();
	}

}

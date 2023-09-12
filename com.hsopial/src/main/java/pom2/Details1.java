package pom2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Details1 {

	@FindBy(xpath="//*[@id=\"row1\"]/td[1]/select")
	private WebElement Tname;

	@FindBy(xpath="//*[@id=\"consultant_doctor\"]")
	private WebElement Dname;

	@FindBy(xpath="//*[@id=\"bill\"]/div[2]/div[2]/div/div/div/div/div[3]/div[3]/div/select")
	private WebElement Cname;

	@FindBy(xpath="//input[@id='discount_percent']")
	private WebElement sisc;


	@FindBy(xpath="//*[@id=\"bill\"]/div[3]/div/button[1]")
	private WebElement calc;




	WebDriver driver;
	public Details1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}

	public void Addname() {
		Select s1= new Select(Tname);
		s1.selectByIndex(1);
	}

	public void Doctorname() {
		Select s2 = new Select(Dname);
		s2.selectByIndex(1);
	}

	public void Cashname() {
		Select s3 =new Select(Cname);
		s3.selectByIndex(0);
//		Cname.click();
	}

	public void discount() {
		sisc.sendKeys("40");
	}

	public void Calculator() {
		calc.click();
	}


}

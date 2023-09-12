package pom1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Radio1 {

	@FindBy(xpath="//i[@class=\"fas fa-microscope\"]")
	private WebElement Radiology;

	@FindBy(xpath="//a[@class=\"btn btn-primary btn-sm\"]")
	private WebElement Radiologytest;

	@FindBy(xpath="//button[text()=' Add Radiology Test']")
	private WebElement AddRdio;

	@FindBy(xpath="//select[@class='form-control select2 select2-hidden-accessible']")
	private WebElement catname;

	@FindBy(xpath="//select[@name='charge_category_id']")
	private WebElement chargecat;

	@FindBy(xpath="//*[@id=\"code\"]")
	private WebElement ChargN;

	@FindBy(xpath="//option[@value='292']")   //(/ul[@class='select2-results__options']//li)
	private List<WebElement> chargename;

	WebDriver driver;
	Actions Act;
	WebDriverWait wait;

	public Radio1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
		Act = new Actions(driver);
		wait= new WebDriverWait(driver, 10);
	}


	public void Radiologyc() {
		Act.moveToElement(Radiology).click().build().perform();

	}

	public void Radiotestc() {
		Act.moveToElement(Radiologytest).click().build().perform();
	}

	public void AddRadio() {
		AddRdio.click();
	}


	public void Catname() {

		/*for(WebElement CN:catname) {
			if(CN.getText().equals("WATER'S VIEW")) {
				CN.click();
			}
		}*/

		Select s1= new Select(catname);
		s1.selectByIndex(2);
		System.out.println("selected category name");


	}

	public void Chargecat() {
		/*for(WebElement CC:chargecat) {
			if(CC.getText().endsWith("Appointment Charges")) {
				CC.click();
			}
		}*/

		Select s2= new Select(chargecat);
		s2.selectByVisibleText("Appointment Charges");
		System.out.println("selected Charge category");

	}


	public void ChargeN() {
		wait.until(ExpectedConditions.visibilityOf(ChargN));
//		Act.moveToElement(ChargN).click().build().perform();

		Select s3 = new Select(ChargN);
		s3.selectByVisibleText("General Visit");
		System.out.println("clicked on charge name");

	}



	public void Chargename() {

		wait.until(ExpectedConditions.visibilityOf(ChargN));

		for(WebElement Ch:chargename) {
			if(Ch.getText().endsWith("General Visit")) {
				Ch.click();
			}
		}
	}

}

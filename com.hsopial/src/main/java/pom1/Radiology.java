package pom1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiology {

	@FindBy(xpath="//ul[@class='sidebar-menu verttop']//li")
	private List<WebElement> Radiology;

	@FindBy(xpath="//a[text()=' Radiology Test']")
	private WebElement Addtest;

	@FindBy(xpath="//button[text()=' Add Radiology Test']")
     private WebElement RadioAddTest;

	@FindBy(xpath="//select[@name='charge_category_id']")
	private WebElement CName;

	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private List<WebElement> chargeCategory;

	@FindBy(xpath="//select[@id='code']")
	private WebElement ChargeN;

	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private List<WebElement> ChargeName;

	private Actions act;
	private WebDriverWait wait;

	public Radiology(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//	sel=new Select(chargecategory);
		 act=new Actions(driver);
		//alt=driver.switchTo().alert();
		 wait=new WebDriverWait(driver, 10);
	}
	public void SelectRadiology() {

		 for(WebElement t:Radiology)
	       {
	    	   if(t.getText().equals("Radiology"))
	    	   {
	    		   t.click();
	    		   break;

	    	   }

	       }
	}

	public void SelectRadiologytest() {
		act.moveToElement(Addtest).click().build().perform();
	}

	public void SelectAddRadiology() {
		RadioAddTest.click();
		//sel.selectByVisibleText("Appointment Charges");
	}
	public void SelectName() {
		wait.until(ExpectedConditions.visibilityOf(CName));
		act.moveToElement(CName).click().build().perform();

	}
	public void SelectChargeCategory() {


		 for(WebElement t:chargeCategory)
	       {
	    	   if(t.getText().equals("Appointment Charges"))
	    	   {
	    		   t.click();
	    		  // act.moveToElement(t).click().build().perform();
	    		   break;
	    	   }
	       }
	}


	public void ChargeN() {
		wait.until(ExpectedConditions.visibilityOf(ChargeN));
		act.moveToElement(ChargeN).click().build().perform();
	}
	public void SelectChargeName() {
		for(WebElement t:chargeCategory)
	       {
	    	   if(t.getText().equals("General Visit"))
	    	   {
	    		   act.moveToElement(t).click().build().perform();
	    		   break;

	    	   }

	       }
	}


}



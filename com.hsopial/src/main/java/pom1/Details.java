package pom1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Details {

	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div/div/div[1]/div[1]/div[1]/div/input")
	private WebElement Tname;

	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div/div/div[1]/div[1]/div[2]/div/input")
	private WebElement Sname;

	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div/div/div[1]/div[1]/div[4]/div/div/select")
	private WebElement Cname;


	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/select")
	private WebElement chgrec;

	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private WebElement chname;

	//select[@class='form-control charge select2 select2-hidden-accessible']

	@FindBy(xpath="//ul[@class='select2-results__options']//li")
	private List<WebElement> chname2;

	@FindBy(xpath="//*[@id=\"parameter_name_1\"]")
	private WebElement tsnm;

	@FindBy(xpath="//*[@id=\"formaddbtn\"]")
	private WebElement sav;

	WebDriver driver;
	public Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}

	public void Addname() {
		Tname.sendKeys("xray");
	}

	public void Shortname() {
		Sname.sendKeys("xr");
	}

	public void Catgtname() {
		Select s =new Select(Cname);
		s.selectByVisibleText("X-RAY PNS (WATER'S VIEW)");
//		Cname.click();
	}

	public void Catgchrge() {
		Select r= new Select(chgrec);
		r.selectByIndex(5);
//		chgrec.click();
	}

public void chrgname() {
//	Select t= new Select(chname);
//	t.selectByVisibleText("AC Room Charge");
	chname.click();
//	chname2.click();

	for(WebElement tik:chname2) {
		if(tik.getText().equals("AC Room Charge")) {
		tik.click();
		break;
		}
	}

}



public void TestparaName() {
	Select y= new Select(tsnm);
	y.selectByIndex(2);
}

public void Savebutton() {
	sav.click();
}

}

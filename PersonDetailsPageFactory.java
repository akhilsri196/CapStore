package pom.structure;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PersonDetailsPageFactory extends PathPages {

	private static String page = "PersonalDetails.html";
	private static String title = "Personal Details";

	public PersonDetailsPageFactory(Browser browser) {
		super(page, title, browser);
		PageFactory.initElements(super.getBrowser().driver, this);
	}

	@Override
	public Browser getBrowser() {
		return super.getBrowser();
	}

	@FindBy(name = "txtFN")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "txtLastName")
	@CacheLookup
	WebElement lname;

	@FindBy(name = "Email")
	@CacheLookup
	WebElement email;

	@FindBy(name = "Phone")
	@CacheLookup
	WebElement mobile;

	@FindBy(name = "address1")
	@CacheLookup
	WebElement line1;

	@FindBy(name = "address2")
	@CacheLookup
	WebElement line2;

	@FindBy(name = "city")
	@CacheLookup
	WebElement city;

	@FindBy(name = "state")
	@CacheLookup
	WebElement state;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[11]/td/a")
	@CacheLookup
	WebElement nextbutton;

	public WebElement getLine1() {
		return line1;
	}

	public void setLine1(String ln1) {
		line1.sendKeys(ln1);
	}

	public WebElement getLine2() {
		return line2;
	}

	public void setLine2(String ln2) {
		line1.sendKeys(ln2);
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(String firstname) {
		fname.sendKeys(firstname);
	}

	public WebElement getNextbutton() {
		return nextbutton;
	}

	public void setNextbutton() {
		nextbutton.click();
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(String lastname) {
		lname.sendKeys(lastname);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		email.sendKeys(mail);
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String num) {
		mobile.sendKeys(num);
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(String scity) {

		Select selCity = new Select(city);
		selCity.selectByVisibleText(scity);

	}

	public WebElement getState() {
		return state;
	}

	public void setState(String sstate) {
		Select selState = new Select(state);
		selState.selectByVisibleText(sstate);
	}

}

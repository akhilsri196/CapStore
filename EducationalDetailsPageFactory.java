package pom.structure;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationalDetailsPageFactory extends PathPages {

	private static String page = "EducationalDetails.html";
	private static String title = "Educational Details";	
	
	public EducationalDetailsPageFactory(Browser browser) {
		super(page, title, browser);
		PageFactory.initElements(super.getBrowser().driver, this);
	}
	

	@Override
	public Browser getBrowser() {
		return super.getBrowser();
	}

	@FindBy(name = "graduation")
	@CacheLookup
	WebElement graduation;

	@FindBy(name = "percentage")
	@CacheLookup
	WebElement percent;
	
	@FindBy(name = "passingYear")
	@CacheLookup
	WebElement passingyr;
	
	@FindBy(name = "projectName")
	@CacheLookup
	WebElement projectnm;
	
	@FindBy(name="technologies")
	@CacheLookup
	List<WebElement> checkBoxButton;
	
	@FindBy(name = "technologies")
	@CacheLookup
	WebElement tech;
	
	@FindBy(id = "btnRegister")
	@CacheLookup
	WebElement RegisterButton;
	
	

	public WebElement getGraduation() {
		return graduation;
	}


	public void setGraduation(String grad) {
	graduation.sendKeys(grad);
	}


	public WebElement getPercent() {
		return percent;
	}


	public void setPercent(String percentage) {
		percent.sendKeys(percentage);
	}


	public WebElement getPassingyr() {
		return passingyr;
	}


	public void setPassingyr(String passyear) {
		passingyr.sendKeys(passyear);
	}


	public WebElement getProjectnm() {
		return projectnm;
	}


	public void setProjectnm(String projectname) {
		projectnm.sendKeys(projectname);
	}
	
	public WebElement getCheckBoxButton() {
		return (WebElement) checkBoxButton;
	}

	public void setCheckBoxButton(String val) {
		if(val.equals(".Net"))
			checkBoxButton.get(0).click();
		else if(val.equals("Java")) 
			checkBoxButton.get(1).click();
		else if(val.equals("PHP"))
			checkBoxButton.get(2).click();
		else
			checkBoxButton.get(3).click();
	}

	public WebElement getTech() {
		return tech;
	}


	public void setTech(String technology) {
		tech.sendKeys(technology);
	}


	public WebElement getRegisterButton() {
		return RegisterButton;
	}


	public void setRegisterButton() {
		RegisterButton.click();
	}
	
	
	
	
	

}

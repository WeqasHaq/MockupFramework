package basePackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryModel extends baseClass {

	
	@FindBy (how=How.ID, using = "txtUsername")
	public static WebElement Username;
	
	
	
	
	@FindBy (how=How.ID,using ="txtPassword")
	public static WebElement passWord;
	

	@FindBy (how=How.ID,using="btnLogin")
	public static WebElement loginButton;

	
	
	
	
public	pageFactoryModel() {
	PageFactory.initElements(driver, this);
	//PageFactory.initElements(driver, pageFactoryModel.class);
}



public void user() {
	Username.sendKeys("admin");
	
}

public void pass() {
	passWord.sendKeys("admin123");

}
	
//	public static void main(String[] args) {
//		pageFactoryModel p=new pageFactoryModel(driver); 
//				p.setUp();
//	PageFactory.initElements(driver, pageFactoryModel.class);
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	Username.sendKeys("admin");
//	passWord.sendKeys("admin123");
//	
//	
//	//this is the second class
//	//to handle elements within the class
//	//must create PageFactory.initElements(driver, classnamewherePageObjectIsPresent.class)
//	PageFactory.initElements(driver, secondPageFactory.class);
//	secondPageFactory.loginButton.click();
//	
//	}

}

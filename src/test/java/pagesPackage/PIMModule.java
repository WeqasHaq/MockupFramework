package pagesPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import basePackage.baseClass;

public class PIMModule extends baseClass {
	
	
	public PIMModule(){ 
		PageFactory.initElements(driver, this);

	}
	@FindBy (id="btnAdd")
	public static WebElement Addbutton; 
	
	@FindBy (xpath="//div[@id='tableWrapper']")
	public static WebElement table;
	
	@FindBy(id="firstName")
	public static WebElement firstName;
	
	@FindBy(id="lastName")
	public static WebElement lastname;
	
	@FindBy (id="btnSave")
	public static WebElement saveButton;
	
	
	@FindBy(how=How.ID,using="menu_pim_viewPimModule")
	public static	WebElement PIMmoduleButton;
	
	@FindBy(id="btnDelete")
	public static WebElement Deletebtn;
	
	
	public String titleAssert() {
		return driver.getTitle();
	}
	
	@FindBy(xpath="//input[@value='Edit']")
	public static WebElement editButton;
	
	@FindBy(xpath="//input[@id='personal_optGender_1']")
	public static WebElement GenderRadio;
	
	@FindBy(xpath="//select[@id='personal_cmbNation']")
	public static WebElement NationalitySelect;

	public static By edit=(By.xpath("//input[@value='Edit']"));
	
	
	@FindBy(id="personal_cmbMarital")
	public static WebElement MaritalStatus;
	
public static	By saveEmployeeList=(By.xpath("//input[@value='Save']"));
	

	@FindBy(xpath="//div[@id='deleteConfModal']//div[@class='modal-footer']//input[@value='Ok']")
	public static WebElement OkButton;
	
	
	
	
	
	
	
	
	
}

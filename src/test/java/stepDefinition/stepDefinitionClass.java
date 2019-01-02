package stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import CommonMethods.CommonMethods;
import basePackage.baseClass;
import basePackage.pageFactoryModel;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pagesPackage.PIMModule;

public class stepDefinitionClass extends baseClass {

	pageFactoryModel p = new pageFactoryModel();

	@Given("^Navigate to URL$")
	public void navigate_to_URL() throws Throwable {

	}

	@Given("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		pageFactoryModel p = new pageFactoryModel();
		// PageFactory.initElements(driver, pageFactoryModel.class);
		pageFactoryModel.Username.sendKeys("admin");
		p.pass();

	}

	@Given("^I click login$")
	public void i_click_login() throws Throwable {
		pageFactoryModel.loginButton.click();
	}

	@Then("^I assert title$")
	public void i_assert_title() throws Throwable {
		PIMModule p = new PIMModule();
		System.out.println(p.titleAssert());
		String expected = "OrangeHRM";
		String actual = p.titleAssert();

		Assert.assertEquals(expected, actual);

	}
	
	

	
	@Then("^Get list of table$")
	public void get_list_of_table() throws Throwable {

		List<WebElement> list = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for(int i=1; i<=list.size();i++) {
			//System.out.println(list.get(i)+"This is for line 72----------");
		//System.out.println(list.toString()+"This is for line 73 -------------");
			
		String a=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]")).getText();
					System.out.println("this is for line 76 --------"+a);
					for(WebElement lists:list) {
						
					if(a.contains("Weqas")) {
						WebElement b=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]//input[@type='checkbox']"));
						JavascriptExecutor js = (JavascriptExecutor) driver;  
						WebElement element=driver.findElement(By.xpath("//a[contains (text(), 'Weqas')]"));
						js.executeScript("arguments[0].scrollIntoView(true);", element);
			
						b.click();
						break;
					}
					//lists.click();
					}
					
		}
	}
	@Then("^Click delete$")
	public void click_delete() throws Throwable {
		CommonMethods c=new CommonMethods();
		c.clickMethods(PIMModule.Deletebtn);//	PIMModule.Deletebtn
		c.clickMethods(PIMModule.OkButton);
	}

	// -------------Scenario 2 Add
	@Given("^I enter invalid \"([^\"]*)\" and also \"([^\"]*)\"$")

	public void hello() throws Throwable {

		pageFactoryModel.Username.sendKeys("admin");
		Thread.sleep(2000);
		pageFactoryModel.passWord.sendKeys("admin123");
	}

	@Then("^I click PIM$")
	public void i_click_PIM() throws Throwable {
		PIMModule p = new PIMModule();
		
		PIMModule.PIMmoduleButton.click();

	}

	@And("^I click Add$")
	public void i_click_Add() throws Throwable {
		CommonMethods c=new CommonMethods();
		c.clickMethods(PIMModule.Addbutton);
	}

	@And("^I Enter FirstName and LastName$")
	public void i_Enter_FirstName_and_LastName() throws Throwable {
		CommonMethods b=new CommonMethods();
		b.enterText(PIMModule.firstName, "Weqas");
		b.enterText(PIMModule.lastname, "Haq");
		
		
	}

	@And("^Click save button$")
	public void click_save_button() throws Throwable {
		CommonMethods b=new CommonMethods();
		b.clickMethods(PIMModule.saveButton);
	}
	

	@And("^Click Edit$")
	public void click_Edit() throws Throwable {
		CommonMethods b=new CommonMethods();
		Thread.sleep(1500);
	//	b.clickMethods(PIMModule.editButton);
		b.ExplicitWait(PIMModule.edit);
	}

	@And("^Click male Gender$")
	public void click_male_Gender() throws Throwable {
		CommonMethods b=new CommonMethods();
		
		b.clickMethods(PIMModule.GenderRadio);
	}

	@And("^Select Nationality$")
	public void select_Nationality() throws Throwable {
		CommonMethods b=new CommonMethods();
		b.selectMethod(PIMModule.NationalitySelect, "136");
		
	List<WebElement> list=	driver.findElements(By.xpath("//select[@id='personal_cmbNation']"));
		
		for(WebElement lists:list) {
			System.out.println(lists.getText());
			if(lists.getText().contains("German")) {
				b.selectMethodtext(PIMModule.NationalitySelect, "German");
				break;
			}
		}
//		for(int i=1;i<=list.size();i++) {
//			
//			System.out.println(list.get(i));
//			
//		}
	}

	@And("^Select Marital Status$")
	public void select_Marital_Status() throws Throwable {
		CommonMethods b=new CommonMethods();
		//b.selectMethod(PIMModule.MaritalStatus, "Single");
		List<WebElement> m=driver.findElements(By.id("personal_cmbMarital"));
		for(WebElement list:m) {
			System.out.println(list.getText());
			if(list.getText().contains("Single")) {
				b.selectMethod(PIMModule.MaritalStatus, "Single");
				break;
			}
			 
			
		}
		
	}

	@And("^Click Save$")
	public void click_Save() throws Throwable {
	
		CommonMethods b=new CommonMethods();
		b.ExplicitWait(PIMModule.saveEmployeeList);
		
	}

	//-----------feature login.feature-----------------------------
	
	@Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
		CommonMethods b=new CommonMethods();
		b.enterText(pageFactoryModel.Username, arg1);
		b.enterText(pageFactoryModel.passWord, arg2);
	}

}

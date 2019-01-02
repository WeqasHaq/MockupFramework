package CommonMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.baseClass;

public class CommonMethods extends baseClass{
	
	
	public void clickMethods(WebElement element) {
		element.click();
		
	}
	
	public void actionMethods(WebElement element) {
		Actions action= new Actions(driver);
		action.moveToElement((WebElement) ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
public void selectMethod(WebElement element,String value) {
	Select sel=new Select(element);
	sel.selectByValue(value);
}
public void selectMethod(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
}

public void selectMethodtext(WebElement element,String visableText) {
	Select sel=new Select(element);
	sel.selectByVisibleText(visableText);
}

public void ExplicitWait(By xpath) {
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(xpath)).click();
}

public void enterText(WebElement text, String texts) {
	
	text.sendKeys(texts);
}

}

package stepDefinition;

import basePackage.baseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends baseClass{
	@Before
	public void startUp() {
		baseClass.setUp();
	}
	@After
	public void tearsDown() {
		//baseClass.tearDown();
	}

}

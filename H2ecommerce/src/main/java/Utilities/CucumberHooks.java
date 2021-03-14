package Utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BrowserControl {
	
	/**
	 * Hooks to run before scenario
	 */
	@Before
	public void setUp() {
		openBrowser();
	}
	
	/**
	 * Hooks to run after scenario
	 */
	@After
	public void tearDown() {
		closeBrowser();
	}

}

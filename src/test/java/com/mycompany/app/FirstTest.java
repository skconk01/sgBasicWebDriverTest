package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



/**
 * Unit test for simple App.
 */
public class FirstTest {

	@Test
    public void driverIsTheKing() {
		
		WebDriver driver = new HtmlUnitDriver();
		//driver.get("http://www.compendiumdev.co.uk/selenium");
		//http://localhost:9090/home
		driver.get("http://localhost:9090/home");
		
		
        assertTrue( driver.getTitle().startsWith("The Game"));
    }
}

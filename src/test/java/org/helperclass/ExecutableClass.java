package org.helperclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		ChromeBrowser();
		LaunchUrl("https://www.facebook.com/");
		MaxWindow();
		takeSnap("Pic1");
		PageTitle();
		PageUrl();
		WebElement txtUser=driver.findElement(By.id("email"));
		fillTextBox(txtUser,"Greens");
		takeSnap("Pic2");
		WebElement txtPass=driver.findElement(By.id("pass"));
		fillTextBox(txtPass,"1234567");
		takeSnap("Pic3");
		
	}

}

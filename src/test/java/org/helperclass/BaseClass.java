package org.helperclass;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Alert al;
	public static JavascriptExecutor js;
	public static Select s;
	public static Frame f;
	public static Actions a;
	public static Robot r;
	public static void ChromeBrowser() {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Nirmala Gopinath\\eclipse-workspace\\FrameClass1\\Lib\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	public static void MaxWindow() {
		driver.manage().window().maximize();
	}
	public static void PageTitle() {
		String Title=driver.getTitle();
		System.out.println(Title);
	}
	public static void PageUrl() {
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}
	public static void fillTextBox(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void btnClick(WebElement element) {
		element.click();
	}
	public static void Close() {
		driver.close();
	}
	public static void Quit() {
		driver.quit();
	}
	public static void Attribute(WebElement element,String value) {
		System.out.println(element.getAttribute(value));
	}
	public static void Text(WebElement element) {
		System.out.println(element.getText());
	}
	//Actions class
	
	public static void MouseOver(WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void DragAndDrop(WebElement element,WebElement element1) {
		Actions a=new Actions(driver);
		a.dragAndDrop(element, element1).perform();
	}
	public static void ActionsUp(WebElement element) {
		Actions a=new Actions(driver);
		a.keyUp(element,Keys.SHIFT).perform();
	}
	public static void ActionsDown(WebElement element) {
		Actions a=new Actions(driver);
		a.keyDown(element,Keys.SHIFT).perform();
	}
	public static void Click(WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void RightClick(WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	//Robot class//Cut-Ctrl+x
	public static void Cut() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
	}
	//copy-control+c
	public static void Copy() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
	}
	//Paste-control+v
	public static void Paste() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
}
	//Tab
	public static void KeyTab() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}
	//Down
	public static void KeyDown() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	//Enter
	public static void KeyEnter() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	//Alert
	public static void AlertHandleAccept() {
		driver.switchTo().alert().accept();
	}
	public static void AlertHandleDismiss() {
		driver.switchTo().alert().dismiss();
	}
	//Frames
	public static void FrameHandleString(String value) {
		driver.switchTo().frame(value);
	}
	public static void FrameHandleWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public static void FrameHandleIndex(int index) {
		driver.switchTo().frame(index);
	}
	public static void OutsideFrame() {
		driver.switchTo().parentFrame();
	}
	public static void DefaultFrame() {
		driver.switchTo().defaultContent();
	}
	//JAvaScript Executor
	public static void ScrollDown(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView(true)",element);
		
	}
	public static void ScrollUp(WebElement element) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);
	}
	public static void JavaScriptValue(WebElement element,String value) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','value')", element);
	}
	public static void JavaScriptValue1(WebElement element,String value) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value')", element);
	}
	public static void ClickWE(WebElement element,String value) {
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].Click()", element);
	}
	//Multiple ScreenShorts
	public static void takeSnap(String PicName) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File s=tk.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\Nirmala Gopinath\\eclipse-workspace\\FrameClass1\\Sshots\\"+PicName+".png");
		FileUtils.copyFile(s, d);
	}
	//Drop Down
	public static void DropDownSelValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void DropDownSelText(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	public static void DropDownSelIndex(WebElement element,int Inddex) {
		Select s=new Select(element);
		s.selectByIndex(Inddex);
	}
	public static void DropDownMultiple(WebElement element) {
		Select s=new Select(element);
		s.isMultiple();
	}
	public static void DropDownOptions(WebElement element) {
		Select s=new Select(element);
		s.getOptions();
	}
	public static void DropDownDeSelValue(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	public static void DropDownDeSelText(WebElement element,String value) {
		Select s=new Select(element);
		s.deselectByVisibleText(value);
	}
	public static void DropDownDeSelIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public static void DropDownDeSelAll(WebElement element) {
		Select s=new Select(element);
		s.deselectAll();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
		
		
		
		
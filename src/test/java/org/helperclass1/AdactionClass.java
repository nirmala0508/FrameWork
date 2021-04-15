package org.helperclass1;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class AdactionClass {
	
	
	     public static WebDriver driver;
	     public static Actions a;
	     public static Robot r;
	     public static Alert al;
	     public static Frame f;
	     public static JavascriptExecutor js;
	     public static Select s;
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
		    String TitleName=driver.getTitle();
		    System.out.println(TitleName);
		}
	     public static void PageUrl() {
			String Url=driver.getCurrentUrl();
			System.out.println(Url);
		}
	     public static void fillTextbox(WebElement element,String value) {
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
	    //Actions
	     public static void MouseOver(WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
	     public static void DragAndDrop(WebElement element,WebElement element1) {
			Actions a=new Actions(driver);
			a.dragAndDrop(element,element1).perform();
	     }
	     public static void ActionsUp(WebElement element) {
			Actions a=new Actions(driver);
			a.keyUp(element,Keys.SHIFT).perform();
	     }
	     public static void ActionsDown(WebElement element) {
			Actions a=new Actions(driver);
			a.keyDown(element,Keys.SHIFT).perform();
	     }
	     public static void TwoClick(WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
	     }
	     public static void RightClick(WebElement element) {
			Actions a=new Actions(driver);
			a.contextClick(element).perform();
	     }
	     //Robot
	     //Cut-Ctrl+X
	     public static void Cut() throws AWTException {
	    	 r=new Robot();
	    	 r.keyPress(KeyEvent.VK_CONTROL);
	    	 r.keyPress(KeyEvent.VK_X);
	    	 r.keyRelease(KeyEvent.VK_CONTROL);
	    	 r.keyRelease(KeyEvent.VK_X);
	     }
	     //Copy-Ctrl+C
	     public static void Copy() throws AWTException {
	    	 r=new Robot();
	    	 r.keyPress(KeyEvent.VK_CONTROL);
	    	 r.keyPress(KeyEvent.VK_C);
	    	 r.keyRelease(KeyEvent.VK_CONTROL);
	    	 r.keyRelease(KeyEvent.VK_C);
	     }
	     //Paste-Ctrl+V
	     public static void Paste() throws AWTException {
	    	 r=new Robot();
	    	 r.keyPress(KeyEvent.VK_CONTROL);
	    	 r.keyPress(KeyEvent.VK_V);
	    	 r.keyRelease(KeyEvent.VK_CONTROL);
	    	 r.keyRelease(KeyEvent.VK_V);
	     }
	     //TAB
	     public static void KeyFuncTab() throws AWTException {
	    	 r=new Robot();
	    	 r.keyPress(KeyEvent.VK_TAB);
	    	 r.keyRelease(KeyEvent.VK_TAB);
	     }
	     //DOWN
	     public static void KeyFuncDown() throws AWTException {
	    	 r=new Robot();
	    	 r.keyPress(KeyEvent.VK_DOWN);
	    	 r.keyRelease(KeyEvent.VK_DOWN);
	     }
	     //ENTER
	     public static void KeyFuncEnter() throws AWTException {
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
	    public static void DefaultOutsideFrame() {
			driver.switchTo().defaultContent();
		}
	    //JavaScriptExecutor
	    public static void ScrollDown(WebElement element) {
		   js=(JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView(true)",element);
		}
	    public static void ScrollUp(WebElement element) {
	 	   js=(JavascriptExecutor)driver;
	 	   js.executeScript("arguments[0].scrollIntoView(false)",element);
	 	}
	    public static void JavaScriptValue(WebElement element,String value) {
	    	js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].setAttribute('value','value')",element);
	    }
	    public static void JavaScriptValue1(WebElement element,String value) {
	    	js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].getAttribute('value')",element);
	    }
	    public static void ClickWE(WebElement element,String value) {
	    	js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].Click()",element);
	    }
	    //Multiple Screenshots
	    public static void takeSnap(String PicName) throws IOException {
	    	TakesScreenshot tk=(TakesScreenshot)driver;
	    	File s=tk.getScreenshotAs(OutputType.FILE);
	    	File d=new File("C:\\Users\\Nirmala Gopinath\\eclipse-workspace\\FrameClass1\\Sshots"+PicName+".png");
	    	FileUtils.copyFile(s,d);
	    }
	    //DropDown
	    public static void DropDownSelValue(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByValue(value);
		}
	    public static void DropDownSelText(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByVisibleText(value);
		}
	     public static void DropDownSelIndex(WebElement element,int index) {
			Select s=new Select(element);
			s.selectByIndex(index);
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
	    //Wait
	    public static void SleepWait(long mills)throws InterruptedException {
	    	Thread.sleep(mills);
	    }
	    public static void ImplicitWait() {
	    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    }
	    
	}




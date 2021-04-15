package org.helperclass1;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AdactionExecutableClass extends AdactionClass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeBrowser();
		LaunchUrl("https://adactinhotelapp.com/");
		MaxWindow();
		PageTitle();
		PageUrl();
		WebElement txtUser=driver.findElement(By.id("username"));
		fillTextbox(txtUser,"Nirmala05");
		
		WebElement txtPass=driver.findElement(By.id("password"));
		fillTextbox(txtPass,"Nirmala05");
		
		takeSnap("Login Details");
		SleepWait(3000);
		
		WebElement btnLogin=driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement DropLoc=driver.findElement(By.id("location"));
		DropDownSelValue(DropLoc,"London");
		
		WebElement DropHotels=driver.findElement(By.id("hotels"));
		DropDownSelText(DropHotels,"Hotel Creek");
		
		WebElement DropRoomType=driver.findElement(By.id("room_type"));
		DropDownSelIndex(DropRoomType,4);
		
		WebElement DropNoOfRooms=driver.findElement(By.id("room_nos"));
		DropDownSelText(DropNoOfRooms,"1 - One");
		
		WebElement CheckInDate=driver.findElement(By.id("datepick_in"));
		fillTextbox(CheckInDate,"03/04/2021");
		
		WebElement CheckOutDate=driver.findElement(By.id("datepick_in"));
		fillTextbox(CheckOutDate,"04/04/2021");
		
		WebElement DropAdultsPerRoom=driver.findElement(By.id("adult_room"));
		DropDownSelText(DropAdultsPerRoom,"1 - One");
		
		WebElement DropChildrenPerRoom=driver.findElement(By.id("child_room"));
		DropDownSelIndex(DropChildrenPerRoom,0);
		
		takeSnap("Room Details");
		SleepWait(3000);
		
		WebElement btnSearch=driver.findElement(By.id("Submit"));
		btnSearch.click();
		
		WebElement RadioBtn=driver.findElement(By.id("radiobutton_0"));
		RadioBtn.click();
		
		takeSnap("Given Room Details");
		SleepWait(3000);
		
		WebElement Continue=driver.findElement(By.id("continue"));
		Continue.click();
		
		WebElement FirstName=driver.findElement(By.id("first_name"));
		fillTextbox(FirstName,"Nirmala");
		
		WebElement LastName=driver.findElement(By.id("last_name"));
		fillTextbox(LastName,"Gopinath");
		
		WebElement BillingAddress=driver.findElement(By.id("address"));
		fillTextbox(BillingAddress,"no 33 gandhi street chitlapakkam,Chennai-600064");
		
		WebElement CreditCardNo=driver.findElement(By.id("cc_num"));
		fillTextbox(CreditCardNo,"4358904132109875");
		
		WebElement DropCreditCardType=driver.findElement(By.id("cc_type"));
		DropDownSelText(DropCreditCardType,"VISA");
		
		WebElement DropExpiryDateMonth=driver.findElement(By.id("cc_exp_month"));
		DropDownSelIndex(DropExpiryDateMonth,5);
		
		WebElement DropExpiryDateYear=driver.findElement(By.id("cc_exp_year"));
		DropDownSelText(DropExpiryDateYear,"2022");
		
		WebElement CVVNo=driver.findElement(By.id("cc_cvv"));
		fillTextbox(CVVNo,"123");
		
		takeSnap("Booking Hotel");
		SleepWait(3000);
		
		WebElement BookNowBtn=driver.findElement(By.id("book_now"));
		BookNowBtn.click();
		
		SleepWait(5000);
	    takeSnap("Order Number");
	    
	    WebElement  sc= driver.findElement(By.name("order_no"));
	    ScrollDown(sc);
	    
	    takeSnap("Order No");
	    
	    WebElement OrderNo=driver.findElement(By.id("order_no"));
	    System.out.println("Order Number:\n");
	    Attribute(OrderNo,"value");
	}
	}




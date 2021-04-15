package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PojoClass2 extends AdactionClass1 {
	
	public PojoClass2() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
	  private WebElement Location;
	
	@FindBy(id="hotels")
	  private WebElement Hotels;
	
	@FindBy(id="room_type")
	  private WebElement RoomType;
	
	@FindBy(id="room_nos")
	  private WebElement NumberOfRooms;
	
	@FindBy(id="datepick_in")
	  private WebElement CheckInDate;
	
	@FindBy(id="datepick_in")
	  private WebElement CheckOutDate;
	
	@FindBy(id="adult_room")
	  private WebElement AdultsPerRoom;
	
	@FindBy(id="child_room")
	  private WebElement ChildrenPerRoom;
	
	@FindBy(id="Submit")
	  private WebElement btnSearch;
	
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotels() {
		return Hotels;
	}
	public WebElement getRoomType() {
		return RoomType;
	}
	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}
	public WebElement getCheckInDate() {
		return CheckInDate;
	}
	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}
	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}
	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
}





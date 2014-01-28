package com.ibs.hotels.form;
import java.math.BigDecimal;
public class Hotel {
private String hotelName;
private String hotelAddress;

private BigDecimal roomRent;
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getHotelAddress() {
	return hotelAddress;
}
public void setHotelAddress(String hotelAddress) {
	this.hotelAddress = hotelAddress;
}
public BigDecimal getRoomRent() {
	return roomRent;
}
public void setRoomRent(BigDecimal roomRent) {
	this.roomRent = roomRent;
}
public Hotel(String hotelName, String hotelAddress, BigDecimal roomRent) {
	super();
	this.hotelName = hotelName;
	this.hotelAddress = hotelAddress;
	this.roomRent = roomRent;
}

}

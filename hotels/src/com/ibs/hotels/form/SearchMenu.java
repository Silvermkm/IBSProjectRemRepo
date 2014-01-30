package com.ibs.hotels.form;

//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
/*import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;*/

public class SearchMenu {
	/*@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(
	            dateFormat, false));
	}*/
	private String location;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date checkIn;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date checkOut;
	private int noOfRooms;
	private List<String> currency;

	public List<String> getCurrency() {
		return currency;
	}

	public void setCurrency(List<String> currency) {
		this.currency = currency;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public SearchMenu() {
		super();
	}

	public SearchMenu(String location, Date checkIn, Date checkOut,
			int noOfRooms,List<String> currency) {
		super();
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noOfRooms = noOfRooms;
		this.currency=currency;
	}

	@Override
	public String toString() {
		
		return "location="+location+",checkIn="+checkIn+",checkOut="+checkOut+"Number of Rooms="+noOfRooms+"Currency"+currency;
	}
	

}

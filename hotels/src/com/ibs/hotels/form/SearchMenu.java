package com.ibs.hotels.form;

//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
<<<<<<< HEAD
/*import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;*/
=======
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
>>>>>>> origin/sckbranch

public class SearchMenu {
	private String location;
	private Date checkIn;
	private Date checkOut;
<<<<<<< HEAD
	private int noOfRooms;
	private List<String> currency;

	public List<String> getCurrency() {
		return currency;
	}

	public void setCurrency(List<String> currency) {
		this.currency = currency;
	}
=======

	@NumberFormat(style = Style.NUMBER)
	private Integer noOfRooms;
>>>>>>> origin/sckbranch

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

	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public SearchMenu() {
		super();
	}

	public SearchMenu(String location, Date checkIn, Date checkOut,
<<<<<<< HEAD
			int noOfRooms,List<String> currency) {
=======
			Integer noOfRooms) {
>>>>>>> origin/sckbranch
		super();
		this.location = location;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.noOfRooms = noOfRooms;
		this.currency=currency;
	}

	@Override
	public String toString() {
<<<<<<< HEAD
		
		return "location="+location+",checkIn="+checkIn+",checkOut="+checkOut+"Number of Rooms="+noOfRooms+"Currency"+currency;
=======

		return "location=" + location + ",checkIn=" + checkIn + ",checkOut="
				+ checkOut + "Number of Rooms=" + noOfRooms;
>>>>>>> origin/sckbranch
	}
	

}

package com.ibs.hotels.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ibs.hotels.form.Hotel;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO{
	
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom ){
		List<Hotel> htlLst = new ArrayList<Hotel>();
		htlLst.add(new Hotel("Taj", "Mumbai", new BigDecimal(15000)));
		htlLst.add(new Hotel("Marriot", "Mumbai",  new BigDecimal(8000)));
		htlLst.add(new Hotel("Paradise", "Mumbai",  new BigDecimal(7000)));
		htlLst.add(new Hotel("DTDC", "Mumbai",  new BigDecimal(6000)));
		return htlLst;
	}

}

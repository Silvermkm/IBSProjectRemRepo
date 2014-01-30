package com.ibs.hotels.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.ibs.hotels.form.*;
import org.springframework.stereotype.Repository;
@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO{
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom ,List<String> currency ){
		List<Hotel> htlLst = new ArrayList<Hotel>();
		System.out.println("currency="+currency);
		if(currency.equals("USD"))
		{
			htlLst.add(new Hotel("Taj", "Mumbai", new BigDecimal(15000/61)));
			htlLst.add(new Hotel("Marriot", "Mumbai",  new BigDecimal(8000/61)));
			htlLst.add(new Hotel("Paradise", "Mumbai",  new BigDecimal(7000/61)));
			htlLst.add(new Hotel("DTDC", "Mumbai",  new BigDecimal(6000/61)));
		}
		else
		{
			htlLst.add(new Hotel("Taj", "Mumbai", new BigDecimal(15000/80)));
			htlLst.add(new Hotel("Marriot", "Mumbai",  new BigDecimal(8000/80)));
			htlLst.add(new Hotel("Paradise", "Mumbai",  new BigDecimal(7000/80)));
			htlLst.add(new Hotel("DTDC", "Mumbai",  new BigDecimal(6000/80)));
		}
		return htlLst;
	}

}

package com.ibs.hotels.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.ibs.hotels.form.Hotel;
import com.ibs.hotels.json.HotelListResponse;
import com.ibs.hotels.json.MapJson;

@Repository("searchDAO")
public class SearchDAOImpl implements SearchDAO{
	
	@Autowired
	private RestTemplate restTemplate;
	
	public List<Hotel> listHotels(String location,Date checkIn,Date checkOut, int noOfRoom ){
		
		/**************Rest Testing start**********************/
		String url = "http://api.ean.com/ean-services/rs/hotel/v3/list?apiKey=3n2ek8y77sgyx7ur7zwk79fm&arrivalDate=03/22/2014&departureDate=03/24/2014&room1=1,5,12&city=Chicago&numberOfResults=2";
		 
		//Create a list for the message converters
		 
	//ArrayList<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		 
		//Add the Jackson Message converter
		//messageConverters.add(new MappingJacksonHttpMessageConverter());
		//messageConverters.add(new MarshallingHttpMessageConverter());
		
		 
		//Add the message converters to the restTemplate
		//restTemplate.setMessageConverters(messageConverters);
		 
		//A simple GET request, the response will be mapped to Example.class
		
		Object response = restTemplate.getForObject(url, Object.class);
		System.out.println(response);
		System.out.println("Satheesh");
		//HotelListRespons result = restTemplate.getForObject(url, HotelListRespons.class);
		LinkedHashMap<String,HotelListResponse> javaResp =(LinkedHashMap<String,HotelListResponse>)response;
		//HotelListResponse value = null;
		for (Map.Entry<String, HotelListResponse> entry : javaResp.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println(value);
		}
		
		MapJson respMapJson = restTemplate.getForObject(url, MapJson.class);
		
		//System.out.println(result);
		/**************Rest Testing End**********************/
		List<Hotel> htlLst = new ArrayList<Hotel>();
		htlLst.add(new Hotel("Taj", "Mumbai", new BigDecimal(15000)));
		htlLst.add(new Hotel("Marriot", "Mumbai",  new BigDecimal(8000)));
		htlLst.add(new Hotel("Paradise", "Mumbai",  new BigDecimal(7000)));
		htlLst.add(new Hotel("DTDC", "Mumbai",  new BigDecimal(6000)));
		return htlLst;
	}

}

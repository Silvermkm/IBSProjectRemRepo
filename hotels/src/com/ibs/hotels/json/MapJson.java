package com.ibs.hotels.json;

import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
public class MapJson {
	@XmlElement
    private LinkedHashMap<String, HotelListResponse> hotelListResponse;

	public LinkedHashMap<String, HotelListResponse> getHotelListResponse() {
		return hotelListResponse;
	}

	public void setHotelListResponse(
			LinkedHashMap<String, HotelListResponse> hotelListResponse) {
		this.hotelListResponse = hotelListResponse;
	} 
	
	
}

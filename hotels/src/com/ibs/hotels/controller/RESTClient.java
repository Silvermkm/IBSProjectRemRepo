package com.ibs.hotels.controller;

import java.util.ArrayList;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.ibs.hotels.json.HotelListResponse;

public class RESTClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://api.ean.com/ean-services/rs/hotel/v3/list?" +
				"&apiKey=3n2ek8y77sgyx7ur7zwk79fm" +
				"&arrivalDate=03/22/2014" +
				"&departureDate=03/24/2014" +
				"&room1=1,5,12" +
				"&city=Chicago" +
				"&numberOfResults=2";
		RestTemplate restTemplate = new RestTemplate();
		 
		//Create a list for the message converters
		 
		ArrayList<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		 
		//Add the Jackson Message converter
		messageConverters.add(new MappingJacksonHttpMessageConverter());
		 
		//Add the message converters to the restTemplate
		restTemplate.setMessageConverters(messageConverters);
		 
		//A simple GET request, the response will be mapped to Example.class
		HotelListResponse result = restTemplate.getForObject(url, HotelListResponse.class);
		
		System.out.println(result);
		 
	}

}

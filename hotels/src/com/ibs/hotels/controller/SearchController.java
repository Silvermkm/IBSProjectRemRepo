package com.ibs.hotels.controller;

import java.text.SimpleDateFormat;
<<<<<<< HEAD
import org.apache.log4j.Logger;
=======
>>>>>>> origin/sckbranch
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
<<<<<<< HEAD
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
=======
import org.springframework.core.convert.ConversionService;
>>>>>>> origin/sckbranch
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ibs.hotels.form.Hotel;
import com.ibs.hotels.form.SearchMenu;
import com.ibs.hotels.form.SearchMenuValidator;
import com.ibs.hotels.service.SearchService;

@Controller
public class SearchController {
	protected static Logger logger = Logger.getLogger("controller");

	@Autowired
	private SearchMenuValidator searchValidator;
	
	private ConversionService conversionService;
	
	/*private FormattingConversionServiceFactoryBean conversionService;*/


	@InitBinder
<<<<<<< HEAD
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
=======
	private void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
>>>>>>> origin/sckbranch
		binder.setValidator(searchValidator);
		binder.setConversionService(conversionService);
	}

	@Autowired
	private SearchService searchService;

	@RequestMapping("/search")
	public ModelAndView showContacts() {

		return new ModelAndView("searchHome", "newSearch", new SearchMenu());
	}

	@ModelAttribute("currencies")
	public List<String> getAllCurrencies() {
		logger.debug("Retrieving all currencies and adding it to ModelAttribute");

		// Prepare data
		List<String> currencies = new ArrayList<String>();
		currencies.add("usd");

		currencies.add("Euro");

		return currencies;
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public ModelAndView listHotels(
			@ModelAttribute("newSearch") SearchMenu srch,
			/* @ModelAttribute("newSearch") @Valid SearchMenu srch, */
			BindingResult result) {
<<<<<<< HEAD

=======
		searchValidator.validate(srch, result);
>>>>>>> origin/sckbranch
		if (result.hasErrors()) {
			return new ModelAndView("searchHome", "newSearch", srch);
		} else {
			List<Hotel> htlLst = new ArrayList<Hotel>();
			Map<String, Object> map = new HashMap<String, Object>();
			System.out.println(srch);
			htlLst = searchService.listHotels(srch.getLocation(),
<<<<<<< HEAD
					srch.getCheckIn(), srch.getCheckOut(), srch.getNoOfRooms(),
					srch.getCurrency());

=======
					srch.getCheckIn(), srch.getCheckOut(), srch.getNoOfRooms());
>>>>>>> origin/sckbranch
			map.put("newSearch", srch);
			map.put("hotelList", htlLst);
			map.put("currencies", srch.getCurrency());

			return new ModelAndView("searchResult", map);
		}
	}

	@Valid
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}

}

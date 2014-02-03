package com.ibs.hotels.form;

//import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import javax.xml.ws.handler.MessageContext;
//import org.apache.axis.MessageContext;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

<<<<<<< HEAD
/*import org.springframework.binding.message.MessageBuilder;
 import org.springframework.binding.validation.ValidationContext;*/

//import com.sun.org.apache.xerces.internal.impl.dv.ValidationContext;
@Component
=======
>>>>>>> origin/sckbranch
public class SearchMenuValidator implements Validator {

	@Override
	public boolean supports(Class<?> cls) {
<<<<<<< HEAD
=======

>>>>>>> origin/sckbranch
		return SearchMenu.class.isAssignableFrom(cls);
	}

	@Override
	public void validate(Object cls, Errors err) {
		SearchMenu mnu = (SearchMenu) cls;

		// Validations for Empty inputs -Start
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "location",
				"search.location.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "checkIn",
				"search.checkIn");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "checkOut",
				"search.checkOut");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "noOfRooms",
				"search.noOfRooms");
		// Validations for Empty inputs -End
		Integer noOfRooms = 0;
		noOfRooms = mnu.getNoOfRooms();
		Date checkIn = mnu.getCheckIn();

		Date checkOut = mnu.getCheckOut();
<<<<<<< HEAD
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = new java.util.Date();
		// System.out.println("Current Date : " + dateFormat.format(date));
		if (checkIn != null && checkOut != null) {
			if (checkIn.before(date)) {
				err.rejectValue("checkIn", "search.checkIn.lessthan");
			}
		}
		
=======
		System.out.println(checkOut);
		System.out.println(checkIn);
>>>>>>> origin/sckbranch

		// VALIDATIONS FOR CHECKIN AND CHECKOUTS
		if (checkIn != null && checkOut != null) {
			if (checkOut.before(checkIn)) {
				err.rejectValue("checkOut", "search.checkOut.greater");
			}
		}
		if (noOfRooms != null && noOfRooms < 1) {
			err.rejectValue("noOfRooms", "search.noOfRooms.lessThenOne");
		}

<<<<<<< HEAD
=======
		if (checkOut != null && checkIn != null) {
			if (checkOut.before(checkIn)) {
				err.rejectValue("checkOut", "search.checkOut.beforeCheckIn");
			}

		}

>>>>>>> origin/sckbranch
	}

}

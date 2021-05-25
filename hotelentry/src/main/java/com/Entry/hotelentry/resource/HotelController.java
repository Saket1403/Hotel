package com.Entry.hotelentry.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Entry.hotelentry.model.Hotel;
import com.Entry.hotelentry.reprository.hotelRepro;

@RestController
public class HotelController {

	@Autowired
	private hotelRepro repro;
	
	@PostMapping("/addentry")
	public String saveEntry(@RequestBody Hotel hotel) {
		repro.save(hotel);
		return "Thankyou for booking";
	}
}

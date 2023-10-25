package com.nt.niranjana.controller;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/wish")
@RestController
public class WishController 
{
	@Autowired
	private Calendar calendar;
	
	@GetMapping("/msg")
	public String wishMethod()
	{
		int hour  = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("WishController:wishMethod..");
		if(hour<12)
			return "Good Morning Baby";
		else if(hour>12 || hour<16)
			return "Good AfterNoon Baby";
		else if(hour>16 || hour<20)
			return "Good Evenning Baby";
		else
			return "Good Night Baby";
	}

}

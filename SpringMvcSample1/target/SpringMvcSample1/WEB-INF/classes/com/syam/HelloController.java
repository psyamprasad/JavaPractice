package com.syam;

import java.text.DateFormat;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	@RequestMapping("/",method = RequestMethod.GET)  
    public String display(Local local,Model model)  
    {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date=new Date();
		DateFormat dateformat=DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
        return "index";  
    }  
	
	

}

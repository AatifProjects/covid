package com.example.covidTracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyController {

	@RequestMapping("dummy")
	public ModelAndView dummy() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dummy.jsp");
		return (mv);
	}
	
}

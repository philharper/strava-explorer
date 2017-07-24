package uk.co.philharper.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.philharper.facades.ActivityFacade;

@Controller
public class WelcomeController {
	
	@Autowired
	ActivityFacade defaultActivityFacade;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", defaultActivityFacade.getActivity());
		return "index";
	}

}
package uk.co.philharper.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.philharper.facades.ActivityFacade;

@Controller
public class WelcomeController {
	
	@Value("${strava.client.secret}")
	private String secret;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "redirect:https://www.strava.com/oauth/authorize?client_id=13688&response_type=code&redirect_uri=http://localhost:8080/authorised";
	}
	
	@RequestMapping("/authorised")
	public String authorised(Map<String, Object> model, @RequestParam(value = "code") String code) {
		model.put("message", code);
		model.put("secret", secret);
		return "index";
	}

}
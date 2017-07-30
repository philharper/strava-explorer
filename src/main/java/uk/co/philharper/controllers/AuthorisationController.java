package uk.co.philharper.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.co.philharper.entities.Activity;
import uk.co.philharper.entities.Athlete;
import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.facades.AuthorisationFacade;


@Controller
public class AuthorisationController {
	
	@Value("${strava.client.id}")
	public String clientId;
	
	@Autowired
	AuthorisationFacade defaultAuthorisationFacade;
	
	@Autowired
	ActivityFacade defaultActivityFacade;

	@RequestMapping("/")
	public String initialAuthorisation(Map<String, Object> model) {
		return "redirect:https://www.strava.com/oauth/authorize?client_id=" + clientId + "&response_type=code&redirect_uri=http://localhost:8080/authorised";
	}
	
	@RequestMapping("/authorised")
	public String authorised(Map<String, Object> model, @RequestParam(value = "code") String code) {
		Athlete athlete = defaultAuthorisationFacade.authoriseApplication(code);
		List<Activity> activities = defaultActivityFacade.getActivities(new Date(), 50);
		model.put("athlete", athlete);
		model.put("activities", activities);
		return "index";
	}

}
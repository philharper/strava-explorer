package uk.co.philharper.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.co.philharper.facades.ActivityFacade;

@Controller
public class ActivityController {

	@Autowired
	ActivityFacade defaultActivityFacade;
	
	@RequestMapping("/activity/{user}/{activityId}")
	public String activity(Map<String, Object> model, @PathVariable(value = "userId") int userId, @PathVariable(value = "activityId") String activityId) {
		model.put("activity", defaultActivityFacade.getActivity(activityId, userId));
		return "activity";
	}
}

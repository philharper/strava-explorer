package uk.co.philharper.facades.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.Activity;
import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.services.ActivityService;
import uk.co.philharper.services.UserService;

@Component
public class DefaultActivityFacade implements ActivityFacade {

	@Autowired
	ActivityService defaultActivityService;
	
	@Autowired
	UserService defaultUserService;
	
	public Activity getActivity(String activityId, int userId) {
		return defaultActivityService.getActivity(activityId, defaultUserService.getUser(userId).getBearerToken());
	}

	@Override
	public List<Activity> getActivities(Date beforeDate, int pageSize, int userId) {
		return defaultActivityService.getActivities(beforeDate, pageSize, defaultUserService.getUser(userId).getBearerToken());
	}

}

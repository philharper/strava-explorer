package uk.co.philharper.facades.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.Activity;
import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.services.ActivityService;

@Component
public class DefaultActivityFacade implements ActivityFacade {

	@Autowired
	ActivityService defaultActivityService;
	
	public Activity getActivity(String activityId) {
		return defaultActivityService.getActivity(activityId);
	}

	@Override
	public List<Activity> getActivities(Date beforeDate, int pageSize) {
		return defaultActivityService.getActivities(beforeDate, pageSize);
	}

}

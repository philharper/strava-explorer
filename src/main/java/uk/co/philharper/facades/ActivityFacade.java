package uk.co.philharper.facades;

import java.util.Date;
import java.util.List;

import uk.co.philharper.entities.Activity;

public interface ActivityFacade {
	
	public Activity getActivity(String activityId, int userId);
	public List<Activity> getActivities(Date beforeDate, int pageSize, int userId);

}

package uk.co.philharper.dao;

import java.util.List;

import uk.co.philharper.entities.Activity;

public interface ActivityDAO {

	public Activity getActivity(String activityId, String bearerToken);
	public List<Activity> getActivities(long beforeDate, int pageSize, String bearerToken);
	
}

package uk.co.philharper.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.dao.ActivityDAO;
import uk.co.philharper.entities.Activity;
import uk.co.philharper.services.ActivityService;

@Component
public class DefaultActivityService implements ActivityService {

	@Autowired
	ActivityDAO restActivityDao;
	
	@Override
	public Activity getActivity(String activityId) {
		return restActivityDao.getActivity(activityId);
	}

	@Override
	public List<Activity> getActivities(Date beforeDate, int pageSize) {
		return restActivityDao.getActivities(beforeDate.getTime(), pageSize);
	}

}

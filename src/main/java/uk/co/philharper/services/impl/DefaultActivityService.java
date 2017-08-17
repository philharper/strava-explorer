package uk.co.philharper.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.dao.ActivityDAO;
import uk.co.philharper.dao.impl.MySqlUserDAO;
import uk.co.philharper.entities.Activity;
import uk.co.philharper.services.ActivityService;

@Component
public class DefaultActivityService implements ActivityService {

	@Autowired
	ActivityDAO restActivityDao;
	
	@Autowired
	MySqlUserDAO mySqlUserDao;
	
	@Override
	public Activity getActivity(String activityId, String bearerToken) {
		return restActivityDao.getActivity(activityId, bearerToken);
	}

	@Override
	public List<Activity> getActivities(Date beforeDate, int pageSize, String bearerToken) {
		return restActivityDao.getActivities(beforeDate.getTime(), pageSize, bearerToken);
	}

}

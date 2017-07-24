package uk.co.philharper.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.dao.ActivityDAO;
import uk.co.philharper.services.ActivityService;

@Component
public class DefaultActivityService implements ActivityService {

	@Autowired
	ActivityDAO restActivityDao;
	
	@Override
	public String getActivity() {
		return restActivityDao.getActivity();
	}

}

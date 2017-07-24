package uk.co.philharper.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.services.ActivityService;

@Component
public class DefaultActivityFacade implements ActivityFacade {

	@Autowired
	ActivityService defaultActivityService;
	
	public String getActivity() {
		return defaultActivityService.getActivity();
	}

}

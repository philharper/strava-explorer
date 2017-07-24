package uk.co.philharper.facades.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.services.ActivityService;

public class DefaultActivityFacadeTest {
	
	@Mock
	ActivityService mockAtivityService;
	
	@Autowired
	ActivityFacade activityFacade;

	@Test
	public void getActivityCallsGetActivityOnActivityService() {
		activityFacade.getActivity();
		verify(mockAtivityService).getActivity();
	}

}

package uk.co.philharper.facades.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.services.ActivityService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultActivityFacadeTest {
	
	@Mock
	ActivityService mockActivityService;
	
	@InjectMocks
	DefaultActivityFacade defaultActivityFacade;

	@Test
	public void getActivityCallsGetActivityOnActivityService() {
		defaultActivityFacade.getActivity();
		verify(mockActivityService).getActivity();
	}

}

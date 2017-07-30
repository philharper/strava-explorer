package uk.co.philharper.facades.impl;

import static org.mockito.Mockito.verify;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.services.ActivityService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultActivityFacadeTest {
	
	@Mock
	ActivityService mockActivityService;
	
	@InjectMocks
	DefaultActivityFacade defaultActivityFacade;

	@Test
	public void getActivityCallsGetActivityOnActivityService() {
		defaultActivityFacade.getActivity("123");
		verify(mockActivityService).getActivity("123");
	}
	
	@Test
	public void getActivitiesCallsGetActivitiesOnActivityService() {
		Date date = new Date(1);
		defaultActivityFacade.getActivities(date, 2);
		verify(mockActivityService).getActivities(date, 2);
	}

}

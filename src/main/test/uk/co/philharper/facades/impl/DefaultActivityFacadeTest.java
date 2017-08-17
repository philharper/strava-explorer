package uk.co.philharper.facades.impl;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.entities.User;
import uk.co.philharper.services.ActivityService;
import uk.co.philharper.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultActivityFacadeTest {
	
	@Mock
	ActivityService mockActivityService;
	
	@Mock
	UserService mockUserService;
	
	@InjectMocks
	DefaultActivityFacade defaultActivityFacade;
	
	@Before
	public void before() {
		User user = new User();
		user.setBearerToken("fg45");
		when(mockUserService.getUser(1)).thenReturn(user);
	}

	@Test
	public void getActivityCallsGetActivityOnActivityService() {
		defaultActivityFacade.getActivity("123", 1);
		verify(mockActivityService).getActivity("123", "fg45");
	}
	
	@Test
	public void getActivitiesCallsGetActivitiesOnActivityService() {
		Date date = new Date(1);
		defaultActivityFacade.getActivities(date, 2, 1);
		verify(mockActivityService).getActivities(date, 2, "fg45");
	}
	
	@Test
	public void getActivityGetsBearerTokenFromUserService() {
		defaultActivityFacade.getActivity("123", 1);
		verify(mockUserService).getUser(1);
	}
	
	@Test
	public void getActivitiesGetsBearerTokenFromUserService() {
		Date date = new Date(1);
		defaultActivityFacade.getActivities(date, 2, 1);
		verify(mockUserService).getUser(1);
	}
}

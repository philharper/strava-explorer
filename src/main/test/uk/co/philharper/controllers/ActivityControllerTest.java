package uk.co.philharper.controllers;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.entities.Activity;
import uk.co.philharper.facades.ActivityFacade;

@RunWith(SpringJUnit4ClassRunner.class)
public class ActivityControllerTest {

	@Mock
	ActivityFacade mockDefaultDefaultActivityFacade;
	
	@InjectMocks
	ActivityController activityController;
	
	@Before
	public void before() {
		Activity activity = new Activity();
		when(mockDefaultDefaultActivityFacade.getActivity("1234", 123)).thenReturn(activity);
	}
	
	@Test
	public void authorisedCallsAuthoriseApplicationOnAuthorisationFacade() {
		Map<String, Object> model = new HashMap<String, Object>();
		activityController.activity(model, 123, "98765");
		verify(mockDefaultDefaultActivityFacade).getActivity("98765", 123);
	}
	
}

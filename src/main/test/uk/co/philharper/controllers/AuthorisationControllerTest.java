package uk.co.philharper.controllers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.entities.Activity;
import uk.co.philharper.entities.AuthorisationResponse;
import uk.co.philharper.facades.ActivityFacade;
import uk.co.philharper.facades.AuthorisationFacade;

@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorisationControllerTest {
	
	@Mock
	AuthorisationFacade mockDefaultAuthorisationFacade;
	
	@Mock
	ActivityFacade mockDefaultDefaultActivityFacade;
	
	@InjectMocks
	AuthorisationController authorisationController;
	
	@Before
	public void before() {
		AuthorisationResponse authorisationResponse = new AuthorisationResponse();
		authorisationResponse.setAccess_token("1234");
		when(mockDefaultAuthorisationFacade.authoriseApplication("98765")).thenReturn(authorisationResponse);
		Activity activity = new Activity();
		activity.setId(1);
		List<Activity> activities = new ArrayList<Activity>();
		activities.add(activity);
		when(mockDefaultDefaultActivityFacade.getActivities(new Date(1), 2)).thenReturn(activities);
	}
	
	@Test
	public void initialAuthorisationRedirectsUserToStravaAuthorisationPage() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("code", "1234");
		authorisationController.clientId = "98765";
		assertThat(authorisationController.initialAuthorisation(model), is(equalTo("redirect:https://www.strava.com/oauth/authorize?client_id=98765&response_type=code&redirect_uri=http://localhost:8080/authorised")));
	}
	
	@Test
	public void authorisedCallsAuthoriseApplicationOnAuthorisationFacade() {
		Map<String, Object> model = new HashMap<String, Object>();		
		model.put("code", "1234");
		authorisationController.authorised(model, "98765");
		verify(mockDefaultAuthorisationFacade).authoriseApplication("98765");
	}

}

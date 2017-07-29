package uk.co.philharper.controllers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.facades.AuthorisationFacade;

@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorisationControllerTest {
	
	@Mock
	AuthorisationFacade authorisationFacade;
	
	@InjectMocks
	AuthorisationController authorisationController;
	
	@Test
	public void initialAuthorisationRedirectsUserToStravaAuthorisationPage() {
		Map<String, Object> model = null;
		authorisationController.clientId = "98765";
		assertThat(authorisationController.initialAuthorisation(model), is(equalTo("redirect:https://www.strava.com/oauth/authorize?client_id=98765&response_type=code&redirect_uri=http://localhost:8080/authorised")));
	}
	
	@Test
	public void authorisedCallsAuthoriseApplicationOnAuthorisationFacade() {
		Map<String, Object> model = null;
		authorisationController.authorised(model, "98765");
		verify(authorisationFacade).authoriseApplication("98765");
	}

}

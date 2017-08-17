package uk.co.philharper.facades.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.entities.Athlete;
import uk.co.philharper.entities.AuthorisationResponse;
import uk.co.philharper.entities.User;
import uk.co.philharper.services.AuthorisationService;
import uk.co.philharper.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultAuthorisationFacadeTest {
	
	@Mock
	AuthorisationService authorisationService; 
	
	@Mock
	UserService userService; 	
	
	@InjectMocks
	DefaultAuthorisationFacade defaultAuthorisationFacade;
	
	@Captor
	ArgumentCaptor<User> userCaptor;
	
	@Before
	public void before() {
		AuthorisationResponse authResponse = new AuthorisationResponse();
		authResponse.setAccess_token("gh67");
		Athlete athlete = new Athlete();
		athlete.setId(897654);
		athlete.setFirstname("phil");
		authResponse.setAthlete(athlete);
		when(authorisationService.authoriseApplication("1234")).thenReturn(authResponse);
	}
	
	@Test
	public void authoriseApplicationIsCalledOnAuthorisationService() {
		defaultAuthorisationFacade.authoriseApplication("1234");
		verify(authorisationService).authoriseApplication("1234");
	}
	
	@Test
	public void authoriseApplicationSavesAuthDetailsToOnUserService() {
		defaultAuthorisationFacade.authoriseApplication("1234");
		
		verify(userService).saveUser(userCaptor.capture());
		assertThat(userCaptor.getValue().getStravaId(), is(equalTo(987654)));
		assertThat(userCaptor.getValue().getUserName(), is(equalTo("phil")));
		assertThat(userCaptor.getValue().getBearerToken(), is(equalTo("gh67")));
	}

}

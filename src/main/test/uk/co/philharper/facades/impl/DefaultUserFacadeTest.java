package uk.co.philharper.facades.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultUserFacadeTest {

	@Mock
	UserService userService; 
	
	@InjectMocks
	DefaultUserFacade defaultUserFacade;
	
	@Test
	public void authoriseApplicationIsCalledOnAuthorisationService() {
		defaultUserFacade.getUser(1);
		verify(userService).getUser(1);
	}
	
}

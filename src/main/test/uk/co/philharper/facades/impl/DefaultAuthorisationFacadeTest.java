package uk.co.philharper.facades.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.services.AuthorisationService;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultAuthorisationFacadeTest {
	
	@Mock
	AuthorisationService authorisationService; 
	
	@InjectMocks
	DefaultAuthorisationFacade defaultAuthorisationFacade;
	
	@Test
	public void authoriseApplicationIsCalledOnAuthorisationService() {
		defaultAuthorisationFacade.authoriseApplication("1234");
		verify(authorisationService).authoriseApplication("1234");
	}

}

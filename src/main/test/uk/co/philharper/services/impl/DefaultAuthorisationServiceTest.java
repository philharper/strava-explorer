package uk.co.philharper.services.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.security.authorisation.Authorisation;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultAuthorisationServiceTest {
	
	@Mock
	Authorisation mockStravaAuthorisation;
	
	@InjectMocks
	DefaultAuthorisationService defaultAuthorisationService;
	
	@Test
	public void authoriseApplicationIsCalledOnStravaAuthorisation() {
		defaultAuthorisationService.authoriseApplication("1234");
		verify(mockStravaAuthorisation).authoriseApplication("1234");
	}
	
}

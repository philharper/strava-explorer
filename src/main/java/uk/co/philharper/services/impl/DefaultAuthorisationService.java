package uk.co.philharper.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.AuthorisationResponse;
import uk.co.philharper.security.authorisation.Authorisation;
import uk.co.philharper.services.AuthorisationService;

@Component
public class DefaultAuthorisationService implements AuthorisationService {
	
	@Autowired
	Authorisation stravaAuthorisation;

	@Override
	public void authoriseApplication(String code) {
		stravaAuthorisation.authoriseApplication(code);
	}

}

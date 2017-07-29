package uk.co.philharper.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.facades.AuthorisationFacade;
import uk.co.philharper.services.AuthorisationService;

@Component
public class DefaultAuthorisationFacade implements AuthorisationFacade {
	
	@Autowired
	AuthorisationService authorisationService;

	@Override
	public void authoriseApplication(String code) {
		authorisationService.authoriseApplication(code);
	}

}

package uk.co.philharper.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.AuthorisationResponse;
import uk.co.philharper.entities.User;
import uk.co.philharper.facades.AuthorisationFacade;
import uk.co.philharper.services.AuthorisationService;
import uk.co.philharper.services.UserService;

@Component
public class DefaultAuthorisationFacade implements AuthorisationFacade {
	
	@Autowired
	AuthorisationService authorisationService;
	
	@Autowired
	UserService defaultUserService;

	@Override
	public AuthorisationResponse authoriseApplication(String code) {
		AuthorisationResponse authorisationResponse = authorisationService.authoriseApplication(code);
		User user = new User();
		user.setStravaId(authorisationResponse.getAthlete().getId());
		user.setUserName(authorisationResponse.getAthlete().getFirstname());
		user.setBearerToken(authorisationResponse.getAccess_token());
		defaultUserService.saveUser(user);
		return authorisationResponse;
	}

}

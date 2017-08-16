package uk.co.philharper.services;

import uk.co.philharper.entities.AuthorisationResponse;

public interface AuthorisationService {

	public AuthorisationResponse authoriseApplication(String code);
	
}

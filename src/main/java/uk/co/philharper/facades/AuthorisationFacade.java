package uk.co.philharper.facades;

import uk.co.philharper.entities.AuthorisationResponse;

public interface AuthorisationFacade {

	public AuthorisationResponse authoriseApplication(String code);
	
}

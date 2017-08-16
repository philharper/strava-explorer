package uk.co.philharper.security.authorisation;

import uk.co.philharper.entities.AuthorisationResponse;

public interface Authorisation {
	
	public AuthorisationResponse authoriseApplication(String code);

}

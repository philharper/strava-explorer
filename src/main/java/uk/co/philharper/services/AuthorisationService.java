package uk.co.philharper.services;

import uk.co.philharper.entities.Athlete;

public interface AuthorisationService {

	public Athlete authoriseApplication(String code);
	
}

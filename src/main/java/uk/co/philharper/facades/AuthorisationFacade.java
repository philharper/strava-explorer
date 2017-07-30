package uk.co.philharper.facades;

import uk.co.philharper.entities.Athlete;

public interface AuthorisationFacade {

	public Athlete authoriseApplication(String code);
	
}

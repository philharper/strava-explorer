package uk.co.philharper.security.authorisation;

import uk.co.philharper.entities.Athlete;

public interface Authorisation {
	
	public Athlete authoriseApplication(String code);

}

package uk.co.philharper.facades.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.User;
import uk.co.philharper.facades.UserFacade;
import uk.co.philharper.services.UserService;

@Component
public class DefaultUserFacade implements UserFacade {
	
	@Autowired
	UserService defaultUserService;

	@Override
	public User getUser(int userId) {
		return defaultUserService.getUser(userId);
	}

	
	
}

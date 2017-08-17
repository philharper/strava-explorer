package uk.co.philharper.services;

import uk.co.philharper.entities.User;

public interface UserService {
	
	public User getUser(int userId);
	public void saveUser(User user);

}

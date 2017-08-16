package uk.co.philharper.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.dao.impl.MySqlUserDAO;
import uk.co.philharper.entities.User;
import uk.co.philharper.services.UserService;

@Component
public class DefaultUserService implements UserService {
	
	@Autowired
	MySqlUserDAO MySqlUserDao;

	@Override
	public User getUser(int userId) {
		return MySqlUserDao.findOne(Long.valueOf(userId));
	}

}

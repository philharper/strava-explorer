package uk.co.philharper.dao.impl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.User;

@Component
public interface MySqlUserDAO extends CrudRepository<User, Long> {
	
}

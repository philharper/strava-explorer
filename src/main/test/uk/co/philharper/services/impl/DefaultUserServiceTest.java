package uk.co.philharper.services.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.dao.impl.MySqlUserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultUserServiceTest {
	
	@Mock
	MySqlUserDAO mockUserDao;
	
	@InjectMocks
	DefaultUserService defaultUserService;
	
	@Test
	public void getUserCallsGetuserOnUserDao() {
		defaultUserService.getUser(1);
		verify(mockUserDao).findOne(Long.valueOf(1));
	}

}

package uk.co.philharper.services.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.dao.ActivityDAO;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultActivityServiceTest {

	@Mock
	ActivityDAO mockActivityDao;
	
	@InjectMocks
	DefaultActivityService defaultActivityService;

	@Test
	public void getActivityCallsGetActivityOnActivityDao() {
		defaultActivityService.getActivity();
		verify(mockActivityDao).getActivity();
	}
	
}

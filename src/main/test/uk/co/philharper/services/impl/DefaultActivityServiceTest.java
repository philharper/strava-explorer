package uk.co.philharper.services.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import uk.co.philharper.dao.ActivityDAO;
import uk.co.philharper.entities.Activity;

@RunWith(SpringJUnit4ClassRunner.class)
public class DefaultActivityServiceTest {

	@Mock
	ActivityDAO mockActivityDao;
	
	@InjectMocks
	DefaultActivityService defaultActivityService;
	
	List<Activity> activitiesListResponse;
	
	@Before
	public void before() {
		activitiesListResponse = new ArrayList<Activity>();
		when(mockActivityDao.getActivities(654987321, 5, "12fg")).thenReturn(activitiesListResponse);
	}

	@Test
	public void getActivityCallsGetActivityOnActivityDao() {
		defaultActivityService.getActivity("123", "12fg");
		verify(mockActivityDao).getActivity("123", "12fg");
	}
	
	@Test
	public void getActivitiesCallsDaoWithEpochDate() {
		defaultActivityService.getActivities(new Date(654987321), 5, "12fg");
		verify(mockActivityDao).getActivities(654987321, 5, "12fg");
	}
	
	@Test
	public void getActivitiesReturnsListOfActivities() {		
		List<Activity> activities = defaultActivityService.getActivities(new Date(654987321), 5, "12fg");
		assertThat(activitiesListResponse, is(equalTo(activities)));		
	}
	
}

package uk.co.philharper.dao.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import uk.co.philharper.entities.Activity;

@RunWith(SpringJUnit4ClassRunner.class)
public class RestActivityDAOTest {
	
	@Mock
	RestTemplate mockRestTemplate = new RestTemplate();

	@InjectMocks
	RestActivityDAO restActivityDao;
	
	private HttpEntity<Object> httpEntity;

	@Before
	public void before() {
		restActivityDao.activitiesUrl = "activitiesUrl";
		restActivityDao.activityUrl = "activityUrl";
		
		HttpHeaders headers =  new HttpHeaders();
		headers.add("Authorization", "Bearer fg45");
		httpEntity = new HttpEntity<Object>(headers);

		List<Activity> activities = new ArrayList<Activity>();
		Activity activity = new Activity();
		activity.setId(123);
		activities.add(activity);
		
		ResponseEntity<Object> activityListResponseEntity = new ResponseEntity<Object>(activities, HttpStatus.OK);
		when(mockRestTemplate.exchange("activitiesUrl?before=1&per_page=2", HttpMethod.GET, httpEntity, Object.class)).thenReturn(activityListResponseEntity);
	
		ResponseEntity<Activity> activityResponseEntity = new ResponseEntity<Activity>(activity, HttpStatus.OK);
		when(mockRestTemplate.exchange("activityUrl/1", HttpMethod.GET, httpEntity, Activity.class)).thenReturn(activityResponseEntity);
	}
	
	@Test
	public void getActivityCallsRestTemplateWithUrlAndBearerToken() {		
		restActivityDao.getActivity("1", "fg45");
		verify(mockRestTemplate).exchange("activityUrl/1", HttpMethod.GET, httpEntity, Activity.class);
	}

	@Test
	public void getActivityReturnActivityFromRestCall() {
		Activity activityResponse = restActivityDao.getActivity("1", "fg45");
		assertThat(activityResponse.getId(), is(equalTo(123)));
	}
	
	@Test
	public void getActivitiesCallsRestTemplateWithUrlAndBearerToken() {		
		restActivityDao.getActivities(1, 2, "fg45");
		verify(mockRestTemplate).exchange("activitiesUrl?before=1&per_page=2", HttpMethod.GET, httpEntity, Object.class);
	}

	@Test
	public void getActivitiesReturnSegmentFromRestCall() {
		List<Activity> activityListResponse = restActivityDao.getActivities(1, 2, "fg45");
		assertThat(activityListResponse.get(0).getId(), is(equalTo(123)));
	}

}

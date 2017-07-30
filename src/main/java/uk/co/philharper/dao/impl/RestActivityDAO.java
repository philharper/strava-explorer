package uk.co.philharper.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import uk.co.philharper.dao.ActivityDAO;
import uk.co.philharper.entities.Activity;

@Component
public class RestActivityDAO implements ActivityDAO {

	@Value("${strava.activities.url}")
	public String activitiesUrl;
	
	@Value("${strava.activity.url}")
	public String activityUrl;

	public String bearerToken = "54a25cd042e97b4d67e2e0f6e6e09ca150ef4262";

	RestTemplate restTemplate = new RestTemplate();

	@Override
	public Activity getActivity(String activityId) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + bearerToken);
		return restTemplate.exchange(activityUrl + "/" + activityId,
				HttpMethod.GET, new HttpEntity<Activity>(headers), Activity.class).getBody();
	}

	@Override
	public List<Activity> getActivities(long beforeDate, int pageSize) {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + bearerToken);
		ResponseEntity<Object> activityListResponse = restTemplate.exchange(createUrl(beforeDate, pageSize),
				HttpMethod.GET, new HttpEntity<Object>(headers), Object.class);
		List<Activity> aL = (List<Activity>) activityListResponse.getBody();

		return aL;
	}

	private String createUrl(long beforeDate, int pageSize) {
		return activitiesUrl + "?before=" + beforeDate + "&per_page=" + pageSize;
	}

}

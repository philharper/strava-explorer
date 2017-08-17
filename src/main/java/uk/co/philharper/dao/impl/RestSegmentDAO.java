package uk.co.philharper.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import uk.co.philharper.dao.SegmentDAO;
import uk.co.philharper.entities.Segment;

public class RestSegmentDAO implements SegmentDAO {

	@Value("${strava.segment.url}")
	public String segmentUrl;

	RestTemplate restTemplate = new RestTemplate();

	@Override
	public Segment getSegment(String segmentId, String bearerToken) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + bearerToken);
		ResponseEntity<Segment> segmentResponse = restTemplate.exchange(segmentUrl, HttpMethod.GET,
				new HttpEntity<Object>(headers), Segment.class);
		return segmentResponse.getBody();
	}

}

package uk.co.philharper.dao.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

import uk.co.philharper.entities.Segment;

@RunWith(SpringJUnit4ClassRunner.class)
public class RestSegmentDAOTest {

	@Mock
	RestTemplate mockRestTemplate = new RestTemplate();

	@InjectMocks
	RestSegmentDAO restSegmentDAO;
	
	private HttpEntity<Object> httpEntity;

	@Before
	public void before() {
		restSegmentDAO.segmentUrl = "testUrl";
		
		HttpHeaders headers =  new HttpHeaders();
		headers.add("Authorization", "Bearer fg45");
		httpEntity = new HttpEntity<Object>(headers);

		Segment segment = new Segment();
		segment.setActivity_type("activityType");
		ResponseEntity<Segment> segmentResponseEntity = new ResponseEntity<Segment>(segment, HttpStatus.OK);
		when(mockRestTemplate.exchange("testUrl", HttpMethod.GET, httpEntity, Segment.class)).thenReturn(segmentResponseEntity);
	}

	@Test
	public void getSegmentCallsRestTemplateWithUrlAndBearerToken() {		
		restSegmentDAO.getSegment("123456", "fg45");
		verify(mockRestTemplate).exchange("testUrl", HttpMethod.GET, httpEntity, Segment.class);
	}

	@Test
	public void getSegmentReturnSegmentFromRestCall() {
		Segment segmentResponse = restSegmentDAO.getSegment("123456", "fg45");
		assertThat(segmentResponse.getActivity_type(), is(equalTo("activityType")));
	}

}

package uk.co.philharper.security.authorisation.impl;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import uk.co.philharper.entities.AuthorisationResponse;

@RunWith(SpringJUnit4ClassRunner.class)
public class StravaAuthorisationTest {

	@Mock
	RestTemplate mockRestTemplate = new RestTemplate();
	
	@InjectMocks
	StravaAuthorisation stravaAuthorisation;


	@Test
	public void authoriseApplicationCallsAuthEndPoint() {	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		stravaAuthorisation.clientId = "fq356dw356s465w3";
		stravaAuthorisation.clientSecret = "d4tyw4s656dyt6fye5";
		stravaAuthorisation.stravaOauthUrl = "https://www.strava.com/oauth/tokens"; 
		
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("client_id", "fq356dw356s465w3");
		map.add("client_secret", "d4tyw4s656dyt6fye5");
		map.add("code", "12345");
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
		
		stravaAuthorisation.authoriseApplication("12345");
		verify(mockRestTemplate).postForEntity("https://www.strava.com/oauth/tokens", request, AuthorisationResponse.class);
	}
	
}

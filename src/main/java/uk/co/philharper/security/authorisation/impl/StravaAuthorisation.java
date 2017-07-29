package uk.co.philharper.security.authorisation.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import uk.co.philharper.entities.AuthorisationResponse;
import uk.co.philharper.security.authorisation.Authorisation;

@Component
public class StravaAuthorisation implements Authorisation {

	@Value("${strava.client.id}")
	public String clientId;

	@Value("${strava.client.secret}")
	public String clientSecret;

	@Value("${strava.oauth.url}")
	public String stravaOauthUrl; 

	@Override
	public void authoriseApplication(String code) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("client_id", clientId);
		map.add("client_secret", clientSecret);
		map.add("code", code);

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		ResponseEntity<AuthorisationResponse> authorisation = restTemplate.postForEntity(stravaOauthUrl, request,
				AuthorisationResponse.class);
	}

}

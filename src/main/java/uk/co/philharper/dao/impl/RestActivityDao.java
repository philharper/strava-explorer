package uk.co.philharper.dao.impl;

import org.springframework.stereotype.Component;

import uk.co.philharper.dao.ActivityDAO;

@Component
public class RestActivityDao implements ActivityDAO {

	@Override
	public String getActivity() {
		return "Hello world";
	}

}

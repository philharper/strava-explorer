package uk.co.philharper.facades.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.co.philharper.entities.Segment;
import uk.co.philharper.facades.SegmentFacade;
import uk.co.philharper.services.ActivityService;
import uk.co.philharper.services.UserService;

@Component
public class DefaultSegmentFacade implements SegmentFacade {

	@Autowired
	ActivityService defaultActivityService;

	@Autowired
	UserService defaultUserService;

	@Override
	public List<Segment> getSegmentEffort(String userId, String segmentId) {
		// TODO Auto-generated method stub
		return null;
	}

}

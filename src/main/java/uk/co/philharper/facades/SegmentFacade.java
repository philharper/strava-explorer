package uk.co.philharper.facades;

import java.util.List;

import uk.co.philharper.entities.Segment;

public interface SegmentFacade {

		public List<Segment> getSegmentEffort(String userId, String segmentId);
		
}

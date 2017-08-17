package uk.co.philharper.dao;

import uk.co.philharper.entities.Segment;

public interface SegmentDAO {

	public Segment getSegment(String segmentId, String bearerToken);
	
}

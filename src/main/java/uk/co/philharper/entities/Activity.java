package uk.co.philharper.entities;

import java.util.HashMap;
import java.util.List;

public class Activity {

    private Integer id;
    private Integer resource_state;
    private String external_id;
    private Integer upload_id;
    private Athlete athlete;
    private String name;
    private Double distance;
    private Integer moving_time;
    private Integer elapsed_time;
    private Double total_elevation_gain;
    private String type;
    private String start_date;
    private String start_date_local;
    private String timezone;
    private List<Double> start_latlng = null;
    private List<Double> end_latlng = null;
    private Integer achievement_count;
    private Integer pr_count;
    private Integer kudos_count;
    private Integer comment_count;
    private Integer athlete_count;
    private Integer photo_count;
    private Integer total_photo_count;
    private Map map;
    private Boolean trainer;
    private Boolean commute;
    private Boolean manual;
    private Boolean _private;
    private Boolean flagged;
    private Double average_speed;
    private Double max_speed;
    private Double average_watts;
    private Integer max_watts;
    private Integer weighted_average_watts;
    private Double kilojoules;
    private Boolean device_watts;
    private Boolean has_heartrate;
    private Double average_heartrate;
    private Double max_heartrate;
    private java.util.Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private List<SegmentEffort> segment_efforts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResource_state() {
        return resource_state;
    }

    public void setResource_state(Integer resource_state) {
        this.resource_state = resource_state;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Integer getUpload_id() {
        return upload_id;
    }

    public void setUpload_id(Integer upload_id) {
        this.upload_id = upload_id;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(Integer moving_time) {
        this.moving_time = moving_time;
    }

    public Integer getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(Integer elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public Double getTotal_elevation_gain() {
        return total_elevation_gain;
    }

    public void setTotal_elevation_gain(Double total_elevation_gain) {
        this.total_elevation_gain = total_elevation_gain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getStart_date_local() {
        return start_date_local;
    }

    public void setStart_date_local(String start_date_local) {
        this.start_date_local = start_date_local;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<Double> getStart_latlng() {
        return start_latlng;
    }

    public void setStart_latlng(List<Double> start_latlng) {
        this.start_latlng = start_latlng;
    }

    public List<Double> getEnd_latlng() {
        return end_latlng;
    }

    public void setEnd_latlng(List<Double> end_latlng) {
        this.end_latlng = end_latlng;
    }

    public Integer getAchievement_count() {
        return achievement_count;
    }

    public void setAchievement_count(Integer achievement_count) {
        this.achievement_count = achievement_count;
    }

    public Integer getPr_count() {
        return pr_count;
    }

    public void setPr_count(Integer pr_count) {
        this.pr_count = pr_count;
    }

    public Integer getKudos_count() {
        return kudos_count;
    }

    public void setKudos_count(Integer kudos_count) {
        this.kudos_count = kudos_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getAthlete_count() {
        return athlete_count;
    }

    public void setAthlete_count(Integer athlete_count) {
        this.athlete_count = athlete_count;
    }

    public Integer getPhoto_count() {
        return photo_count;
    }

    public void setPhoto_count(Integer photo_count) {
        this.photo_count = photo_count;
    }

    public Integer getTotal_photo_count() {
        return total_photo_count;
    }

    public void setTotal_photo_count(Integer total_photo_count) {
        this.total_photo_count = total_photo_count;
    }

    public uk.co.philharper.entities.Map getMap() {
        return map;
    }

    public void setMap(uk.co.philharper.entities.Map map) {
        this.map = map;
    }

    public Boolean getTrainer() {
        return trainer;
    }

    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    public Boolean getCommute() {
        return commute;
    }

    public void setCommute(Boolean commute) {
        this.commute = commute;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public Double getAverage_speed() {
        return average_speed;
    }

    public void setAverage_speed(Double average_speed) {
        this.average_speed = average_speed;
    }

    public Double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(Double max_speed) {
        this.max_speed = max_speed;
    }

    public Double getAverage_watts() {
        return average_watts;
    }

    public void setAverage_watts(Double average_watts) {
        this.average_watts = average_watts;
    }

    public Integer getMax_watts() {
        return max_watts;
    }

    public void setMax_watts(Integer max_watts) {
        this.max_watts = max_watts;
    }

    public Integer getWeighted_average_watts() {
        return weighted_average_watts;
    }

    public void setWeighted_average_watts(Integer weighted_average_watts) {
        this.weighted_average_watts = weighted_average_watts;
    }

    public Double getKilojoules() {
        return kilojoules;
    }

    public void setKilojoules(Double kilojoules) {
        this.kilojoules = kilojoules;
    }

    public Boolean getDevice_watts() {
        return device_watts;
    }

    public void setDevice_watts(Boolean device_watts) {
        this.device_watts = device_watts;
    }

    public Boolean getHas_heartrate() {
        return has_heartrate;
    }

    public void setHas_heartrate(Boolean has_heartrate) {
        this.has_heartrate = has_heartrate;
    }

    public Double getAverage_heartrate() {
        return average_heartrate;
    }

    public void setAverage_heartrate(Double average_heartrate) {
        this.average_heartrate = average_heartrate;
    }

    public Double getMax_heartrate() {
        return max_heartrate;
    }

    public void setMax_heartrate(Double max_heartrate) {
        this.max_heartrate = max_heartrate;
    }

    public java.util.Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public List<SegmentEffort> getSegment_efforts() {
		return segment_efforts;
	}

	public void setSegment_efforts(List<SegmentEffort> segment_efforts) {
		this.segment_efforts = segment_efforts;
	}

}

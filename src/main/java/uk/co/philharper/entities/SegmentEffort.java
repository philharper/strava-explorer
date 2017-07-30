
package uk.co.philharper.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SegmentEffort {

    private Long id;
    private Integer resource_state;
    private String name;
    private Segment segment;
    private Activity activity;
    private Athlete athlete;
    private Integer kom_rank;
    private Integer pr_rank;
    private Integer elapsed_time;
    private Integer moving_time;
    private String start_date;
    private String start_date_local;
    private Double distance;
    private Integer start_index;
    private Integer end_index;
    private Boolean hidden;
    private List<Achievement> achievements = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResource_state() {
        return resource_state;
    }

    public void setResource_state(Integer resource_state) {
        this.resource_state = resource_state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Segment getSegment() {
        return segment;
    }

    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public Integer getKom_rank() {
        return kom_rank;
    }

    public void setKom_rank(Integer kom_rank) {
        this.kom_rank = kom_rank;
    }

    public Integer getPr_rank() {
        return pr_rank;
    }

    public void setPr_rank(Integer pr_rank) {
        this.pr_rank = pr_rank;
    }

    public Integer getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(Integer elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public Integer getMoving_time() {
        return moving_time;
    }

    public void setMoving_time(Integer moving_time) {
        this.moving_time = moving_time;
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

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getStart_index() {
        return start_index;
    }

    public void setStart_index(Integer start_index) {
        this.start_index = start_index;
    }

    public Integer getEnd_index() {
        return end_index;
    }

    public void setEnd_index(Integer end_index) {
        this.end_index = end_index;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public List<Achievement> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}


package uk.co.philharper.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Segment {

    private Integer id;
    private Integer resource_state;
    private String name;
    private String activity_type;
    private Double distance;
    private Double average_grade;
    private Double maximum_grade;
    private Double elevation_high;
    private Double elevation_low;
    private List<Double> start_latlng = null;
    private List<Double> end_latlng = null;
    private Integer climb_category;
    private String city;
    private String state;
    private String country;
    private Boolean _private;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity_type() {
        return activity_type;
    }

    public void setActivity_type(String activity_type) {
        this.activity_type = activity_type;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getAverage_grade() {
        return average_grade;
    }

    public void setAverage_grade(Double average_grade) {
        this.average_grade = average_grade;
    }

    public Double getMaximum_grade() {
        return maximum_grade;
    }

    public void setMaximum_grade(Double maximum_grade) {
        this.maximum_grade = maximum_grade;
    }

    public Double getElevation_high() {
        return elevation_high;
    }

    public void setElevation_high(Double elevation_high) {
        this.elevation_high = elevation_high;
    }

    public Double getElevation_low() {
        return elevation_low;
    }

    public void setElevation_low(Double elevation_low) {
        this.elevation_low = elevation_low;
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

    public Integer getClimb_category() {
        return climb_category;
    }

    public void setClimb_category(Integer climb_category) {
        this.climb_category = climb_category;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

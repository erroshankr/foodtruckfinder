package com.oracle.truckfinder.beans;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "dayorder",
        "dayofweekstr",
        "starttime",
        "endtime",
        "permit",
        "location",
        "locationdesc",
        "optionaltext",
        "locationid",
        "start24",
        "end24",
        "cnn",
        "addr_date_create",
        "addr_date_modified",
        "block",
        "lot",
        "coldtruck",
        "applicant",
        "x",
        "y",
        "latitude",
        "longitude",
        "location_2"
})
public class Response {

    @JsonProperty("dayorder")
    private String dayorder;
    @JsonProperty("dayofweekstr")
    private String dayofweekstr;
    @JsonProperty("starttime")
    private String starttime;
    @JsonProperty("endtime")
    private String endtime;
    @JsonProperty("permit")
    private String permit;
    @JsonProperty("location")
    private String location;
    @JsonProperty("locationdesc")
    private String locationdesc;
    @JsonProperty("optionaltext")
    private String optionaltext;
    @JsonProperty("locationid")
    private String locationid;
    @JsonProperty("start24")
    private String start24;
    @JsonProperty("end24")
    private String end24;
    @JsonProperty("cnn")
    private String cnn;
    @JsonProperty("addr_date_create")
    private String addrDateCreate;
    @JsonProperty("addr_date_modified")
    private String addrDateModified;
    @JsonProperty("block")
    private String block;
    @JsonProperty("lot")
    private String lot;
    @JsonProperty("coldtruck")
    private String coldtruck;
    @JsonProperty("applicant")
    private String applicant;
    @JsonProperty("x")
    private String x;
    @JsonProperty("y")
    private String y;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("location_2")
    private Location2 location2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dayorder")
    public String getDayorder() {
        return dayorder;
    }

    @JsonProperty("dayorder")
    public void setDayorder(String dayorder) {
        this.dayorder = dayorder;
    }

    @JsonProperty("dayofweekstr")
    public String getDayofweekstr() {
        return dayofweekstr;
    }

    @JsonProperty("dayofweekstr")
    public void setDayofweekstr(String dayofweekstr) {
        this.dayofweekstr = dayofweekstr;
    }

    @JsonProperty("starttime")
    public String getStarttime() {
        return starttime;
    }

    @JsonProperty("starttime")
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    @JsonProperty("endtime")
    public String getEndtime() {
        return endtime;
    }

    @JsonProperty("endtime")
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    @JsonProperty("permit")
    public String getPermit() {
        return permit;
    }

    @JsonProperty("permit")
    public void setPermit(String permit) {
        this.permit = permit;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("locationdesc")
    public String getLocationdesc() {
        return locationdesc;
    }

    @JsonProperty("locationdesc")
    public void setLocationdesc(String locationdesc) {
        this.locationdesc = locationdesc;
    }

    @JsonProperty("optionaltext")
    public String getOptionaltext() {
        return optionaltext;
    }

    @JsonProperty("optionaltext")
    public void setOptionaltext(String optionaltext) {
        this.optionaltext = optionaltext;
    }

    @JsonProperty("locationid")
    public String getLocationid() {
        return locationid;
    }

    @JsonProperty("locationid")
    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    @JsonProperty("start24")
    public String getStart24() {
        return start24;
    }

    @JsonProperty("start24")
    public void setStart24(String start24) {
        this.start24 = start24;
    }

    @JsonProperty("end24")
    public String getEnd24() {
        return end24;
    }

    @JsonProperty("end24")
    public void setEnd24(String end24) {
        this.end24 = end24;
    }

    @JsonProperty("cnn")
    public String getCnn() {
        return cnn;
    }

    @JsonProperty("cnn")
    public void setCnn(String cnn) {
        this.cnn = cnn;
    }

    @JsonProperty("addr_date_create")
    public String getAddrDateCreate() {
        return addrDateCreate;
    }

    @JsonProperty("addr_date_create")
    public void setAddrDateCreate(String addrDateCreate) {
        this.addrDateCreate = addrDateCreate;
    }

    @JsonProperty("addr_date_modified")
    public String getAddrDateModified() {
        return addrDateModified;
    }

    @JsonProperty("addr_date_modified")
    public void setAddrDateModified(String addrDateModified) {
        this.addrDateModified = addrDateModified;
    }

    @JsonProperty("block")
    public String getBlock() {
        return block;
    }

    @JsonProperty("block")
    public void setBlock(String block) {
        this.block = block;
    }

    @JsonProperty("lot")
    public String getLot() {
        return lot;
    }

    @JsonProperty("lot")
    public void setLot(String lot) {
        this.lot = lot;
    }

    @JsonProperty("coldtruck")
    public String getColdtruck() {
        return coldtruck;
    }

    @JsonProperty("coldtruck")
    public void setColdtruck(String coldtruck) {
        this.coldtruck = coldtruck;
    }

    @JsonProperty("applicant")
    public String getApplicant() {
        return applicant;
    }

    @JsonProperty("applicant")
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    @JsonProperty("x")
    public String getX() {
        return x;
    }

    @JsonProperty("x")
    public void setX(String x) {
        this.x = x;
    }

    @JsonProperty("y")
    public String getY() {
        return y;
    }

    @JsonProperty("y")
    public void setY(String y) {
        this.y = y;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("location_2")
    public Location2 getLocation2() {
        return location2;
    }

    @JsonProperty("location_2")
    public void setLocation2(Location2 location2) {
        this.location2 = location2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
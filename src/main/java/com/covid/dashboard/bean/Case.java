package com.covid.dashboard.bean;

import java.math.BigDecimal;

public class Case {

	private String fips;
    private String admin2;
    private String provinceState;
    private String countryRegion;
    private String lastUpdate;
    private String lat;
    private String longitude;
    private Long confirmed;
    private Long deaths;
    private Long recovered;
    private Long active;
    private String combinedKey;
    private BigDecimal incidentRate;
    private BigDecimal fatalityRatio;
	public String getFips() {
		return fips;
	}
	public void setFips(String fips) {
		this.fips = fips;
	}
	public String getAdmin2() {
		return admin2;
	}
	public void setAdmin2(String admin2) {
		this.admin2 = admin2;
	}
	public String getProvinceState() {
		return provinceState;
	}
	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}
	public String getCountryRegion() {
		return countryRegion;
	}
	public void setCountryRegion(String countryRegion) {
		this.countryRegion = countryRegion;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Long getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Long confirmed) {
		this.confirmed = confirmed;
	}
	public Long getDeaths() {
		return deaths;
	}
	public void setDeaths(Long deaths) {
		this.deaths = deaths;
	}
	public Long getRecovered() {
		return recovered;
	}
	public void setRecovered(Long recovered) {
		this.recovered = recovered;
	}
	public Long getActive() {
		return active;
	}
	public void setActive(Long active) {
		this.active = active;
	}
	public String getCombinedKey() {
		return combinedKey;
	}
	public void setCombinedKey(String combinedKey) {
		this.combinedKey = combinedKey;
	}
	public BigDecimal getIncidentRate() {
		return incidentRate;
	}
	public void setIncidentRate(BigDecimal incidentRate) {
		this.incidentRate = incidentRate;
	}
	public BigDecimal getFatalityRatio() {
		return fatalityRatio;
	}
	public void setFatalityRatio(BigDecimal fatalityRatio) {
		this.fatalityRatio = fatalityRatio;
	}
    
}

package com.spring.blackcoffer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CSV")  // Specify the collection name
public class YourModel {
    @Id
    private String id;
    private int endYear;
    private double cityLng;
    private double cityLat;
    private int intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private int startYear;
    private int impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private int relevance;
    private String pestle;
    private String source;
    private String title;
    private int likelihood;

    public YourModel(String added, String city, double cityLat, double cityLng, int endYear, String country, String id, int impact, String insight, int intensity, int likelihood, String pestle, String published, String region, int relevance, String sector, String source, int startYear, String swot, String title, String topic, String url) {
        this.added = added;
        this.city = city;
        this.cityLat = cityLat;
        this.cityLng = cityLng;
        this.endYear = endYear;
        this.country = country;
        this.id = id;
        this.impact = impact;
        this.insight = insight;
        this.intensity = intensity;
        this.likelihood = likelihood;
        this.pestle = pestle;
        this.published = published;
        this.region = region;
        this.relevance = relevance;
        this.sector = sector;
        this.source = source;
        this.startYear = startYear;
        this.swot = swot;
        this.title = title;
        this.topic = topic;
        this.url = url;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public double getCityLng() {
        return cityLng;
    }

    public void setCityLng(double cityLng) {
        this.cityLng = cityLng;
    }
    public double getCityLat() {
        return cityLat;
    }

    public void setCityLat(double cityLat) {
        this.cityLat = cityLat;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getInsight() {
        return insight;
    }

    public void setInsight(String insight) {
        this.insight = insight;
    }

    public String getSwot() {
        return swot;
    }

    public void setSwot(String swot) {
        this.swot = swot;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        this.impact = impact;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public String getPestle() {
        return pestle;
    }

    public void setPestle(String pestle) {
        this.pestle = pestle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }
    // Add other fields, getters, and setters as needed
}

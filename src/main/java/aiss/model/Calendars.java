package aiss.model;

import com.google.api.services.calendar.model.ConferenceProperties;

public class Calendars {
	
	private String id;
	private String kind;
	private String description;
	private String location;
	private String summary;
	private String timeZone;
	private ConferenceProperties conferenceProperties;
	
	public Calendars(String summary) {
		this.summary = summary;
		}
	public Calendars(String summary, String description, String location, String timeZone, ConferenceProperties conferenceProperties) {
		this.summary = summary;
		this.description = description;
		this.location = location;
		this.timeZone = timeZone;
		this.conferenceProperties = conferenceProperties;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public ConferenceProperties getConferenceProperties() {
		return conferenceProperties;
	}

	public void setConferenceProperties(ConferenceProperties conferenceProperties) {
		this.conferenceProperties = conferenceProperties;
	}
	
}


	

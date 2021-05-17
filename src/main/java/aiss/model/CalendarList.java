
package aiss.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "etag",
    "id",
    "summary",
    "timeZone",
    "colorId",
    "backgroundColor",
    "foregroundColor",
    "selected",
    "accessRole",
    "defaultReminders",
    "notificationSettings",
    "primary",
    "conferenceProperties"
})
@Generated("jsonschema2pojo")
public class CalendarList {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("etag")
    private String etag;
    @JsonProperty("id")
    private String id;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("colorId")
    private String colorId;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("foregroundColor")
    private String foregroundColor;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("accessRole")
    private String accessRole;
    @JsonProperty("defaultReminders")
    private List<DefaultReminder> defaultReminders = null;
    @JsonProperty("notificationSettings")
    private NotificationSettings notificationSettings;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("conferenceProperties")
    private ConferenceProperties conferenceProperties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    public CalendarList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    @JsonProperty("etag")
    public String getEtag() {
        return etag;
    }

    @JsonProperty("etag")
    public void setEtag(String etag) {
        this.etag = etag;
    }

    public CalendarList withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CalendarList withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public CalendarList withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("timeZone")
    public String getTimeZone() {
        return timeZone;
    }

    @JsonProperty("timeZone")
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public CalendarList withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    @JsonProperty("colorId")
    public String getColorId() {
        return colorId;
    }

    @JsonProperty("colorId")
    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public CalendarList withColorId(String colorId) {
        this.colorId = colorId;
        return this;
    }

    @JsonProperty("backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    @JsonProperty("backgroundColor")
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public CalendarList withBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @JsonProperty("foregroundColor")
    public String getForegroundColor() {
        return foregroundColor;
    }

    @JsonProperty("foregroundColor")
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public CalendarList withForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public CalendarList withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    @JsonProperty("accessRole")
    public String getAccessRole() {
        return accessRole;
    }

    @JsonProperty("accessRole")
    public void setAccessRole(String accessRole) {
        this.accessRole = accessRole;
    }

    public CalendarList withAccessRole(String accessRole) {
        this.accessRole = accessRole;
        return this;
    }

    @JsonProperty("defaultReminders")
    public List<DefaultReminder> getDefaultReminders() {
        return defaultReminders;
    }

    @JsonProperty("defaultReminders")
    public void setDefaultReminders(List<DefaultReminder> defaultReminders) {
        this.defaultReminders = defaultReminders;
    }

    public CalendarList withDefaultReminders(List<DefaultReminder> defaultReminders) {
        this.defaultReminders = defaultReminders;
        return this;
    }

    @JsonProperty("notificationSettings")
    public NotificationSettings getNotificationSettings() {
        return notificationSettings;
    }

    @JsonProperty("notificationSettings")
    public void setNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
    }

    public CalendarList withNotificationSettings(NotificationSettings notificationSettings) {
        this.notificationSettings = notificationSettings;
        return this;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public CalendarList withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    @JsonProperty("conferenceProperties")
    public ConferenceProperties getConferenceProperties() {
        return conferenceProperties;
    }

    @JsonProperty("conferenceProperties")
    public void setConferenceProperties(ConferenceProperties conferenceProperties) {
        this.conferenceProperties = conferenceProperties;
    }

    public CalendarList withConferenceProperties(ConferenceProperties conferenceProperties) {
        this.conferenceProperties = conferenceProperties;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CalendarList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

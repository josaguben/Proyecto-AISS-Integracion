
package aiss.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.api.services.calendar.model.CalendarListEntry.NotificationSettings;
import com.google.api.services.calendar.model.ConferenceProperties;
import com.google.api.services.calendar.model.Event.Reminders;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "id",
    "summary",
    "description",
    "location",
    "timeZone",
    "summaryOverride",
    "colorId",
    "backgroundColor",
    "foregroundColor",
    "hidden",
    "selected",
    "accessRole",
    "defaultReminders",
    "notificationSettings",
    "primary",
    "deleted",
    "conferenceProperties"
})
@Generated("jsonschema2pojo")
public class CalendarList {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("id")
    private String id;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("location")
    private String location;
    @JsonProperty("timeZone")
    private String timeZone;
    @JsonProperty("summaryOverride")
    private String summaryOverride;
    @JsonProperty("colorId")
    private String colorId;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("foregroundColor")
    private String foregroundColor;
    @JsonProperty("hidden")
    private Boolean hidden;
    @JsonProperty("selected")
    private Boolean selected;
    @JsonProperty("accessRole")
    private String accessRole;
    @JsonProperty("defaultReminders")
    private Reminders defaultReminders;
    @JsonProperty("notificationSettings")
    private NotificationSettings notificationSettings;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("conferenceProperties")
    private ConferenceProperties conferenceProperties;
  
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CalendarList withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public CalendarList withLocation(String location) {
        this.location = location;
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

    @JsonProperty("summaryOverride")
    public String getSummaryOverride() {
        return summaryOverride;
    }

    @JsonProperty("summaryOverride")
    public void setSummaryOverride(String summaryOverride) {
        this.summaryOverride = summaryOverride;
    }

    public CalendarList withSummaryOverride(String summaryOverride) {
        this.summaryOverride = summaryOverride;
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

    @JsonProperty("hidden")
    public Boolean getHidden() {
        return hidden;
    }

    @JsonProperty("hidden")
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public CalendarList withHidden(Boolean hidden) {
        this.hidden = hidden;
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
    public Object getDefaultReminders() {
        return defaultReminders;
    }

    @JsonProperty("defaultReminders")
    public void setDefaultReminders(Reminders defaultReminders) {
        this.defaultReminders = defaultReminders;
    }

    public CalendarList withDefaultReminders(Reminders defaultReminders) {
        this.defaultReminders = defaultReminders;
        return this;
    }

    @JsonProperty("notificationSettings")
    public Object getNotificationSettings() {
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

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public CalendarList withDeleted(Boolean deleted) {
        this.deleted = deleted;
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

}

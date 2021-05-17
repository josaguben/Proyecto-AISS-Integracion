
package aiss.model;

import java.util.List;
import javax.annotation.Generated;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.model.ConferenceData;
import com.google.api.services.calendar.model.Event.Creator;
import com.google.api.services.calendar.model.Event.ExtendedProperties;
import com.google.api.services.calendar.model.Event.Organizer;
import com.google.api.services.calendar.model.Event.Reminders;
import com.google.api.services.calendar.model.Event.Source;
import com.google.api.services.calendar.model.EventAttendee;
import com.google.appengine.api.mail.MailService.Attachment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Event {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("htmlLink")
    @Expose
    private String htmlLink;
    @SerializedName("created")
    @Expose
    private DateTime created;
    @SerializedName("updated")
    @Expose
    private DateTime updated;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("colorId")
    @Expose
    private String colorId;
    @SerializedName("creator")
    @Expose
    private Creator creator;
    @SerializedName("organizer")
    @Expose
    private Organizer organizer;
    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("end")
    @Expose
    private End end;
    @SerializedName("endTimeUnspecified")
    @Expose
    private String endTimeUnspecified;
    @SerializedName("recurrence")
    @Expose
    private List<String> recurrence = null;
    @SerializedName("recurringEventId")
    @Expose
    private String recurringEventId;
    @SerializedName("originalStartTime")
    @Expose
    private OriginalStartTime originalStartTime;
    @SerializedName("transparency")
    @Expose
    private String transparency;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("iCalUID")
    @Expose
    private String iCalUID;
    @SerializedName("sequence")
    @Expose
    private int sequence;
    @SerializedName("attendees")
    @Expose
    private List<EventAttendee> attendees = null;
    @SerializedName("attendeesOmitted")
    @Expose
    private boolean attendeesOmitted;
    @SerializedName("extendedProperties")
    @Expose
    private ExtendedProperties extendedProperties;
    @SerializedName("hangoutLink")
    @Expose
    private String hangoutLink;
    @SerializedName("conferenceData")
    @Expose
    private ConferenceData conferenceData;
    @SerializedName("anyoneCanAddSelf")
    @Expose
    private boolean anyoneCanAddSelf;
    @SerializedName("guestsCanInviteOthers")
    @Expose
    private boolean guestsCanInviteOthers;
    @SerializedName("guestsCanModify")
    @Expose
    private boolean guestsCanModify;
    @SerializedName("guestsCanSeeOtherGuests")
    @Expose
    private boolean guestsCanSeeOtherGuests;
    @SerializedName("privateCopy")
    @Expose
    private boolean privateCopy;
    @SerializedName("locked")
    @Expose
    private boolean locked;
    @SerializedName("reminders")
    @Expose
    private Reminders reminders;
    @SerializedName("source")
    @Expose
    private Source source;
    @SerializedName("attachments")
    @Expose
    private List<Attachment> attachments = null;
    @SerializedName("eventType")
    @Expose
    private String eventType;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHtmlLink() {
        return htmlLink;
    }

    public void setHtmlLink(String htmlLink) {
        this.htmlLink = htmlLink;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime created) {
        this.created = created;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public void setUpdated(DateTime updated) {
        this.updated = updated;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public String getEndTimeUnspecified() {
        return endTimeUnspecified;
    }

    public void setEndTimeUnspecified(String endTimeUnspecified) {
        this.endTimeUnspecified = endTimeUnspecified;
    }

    public List<String> getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(List<String> recurrence) {
        this.recurrence = recurrence;
    }

    public String getRecurringEventId() {
        return recurringEventId;
    }

    public void setRecurringEventId(String recurringEventId) {
        this.recurringEventId = recurringEventId;
    }

    public OriginalStartTime getOriginalStartTime() {
        return originalStartTime;
    }

    public void setOriginalStartTime(OriginalStartTime originalStartTime) {
        this.originalStartTime = originalStartTime;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getiCalUID() {
        return iCalUID;
    }

    public void setiCalUID(String iCalUID) {
        this.iCalUID = iCalUID;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public List<EventAttendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<EventAttendee> attendees) {
        this.attendees = attendees;
    }

    public boolean getAttendeesOmitted() {
        return attendeesOmitted;
    }

    public void setAttendeesOmitted(boolean attendeesOmitted) {
        this.attendeesOmitted = attendeesOmitted;
    }

    public ExtendedProperties getExtendedProperties() {
        return extendedProperties;
    }

    public void setExtendedProperties(ExtendedProperties extendedProperties) {
        this.extendedProperties = extendedProperties;
    }

    public String getHangoutLink() {
        return hangoutLink;
    }

    public void setHangoutLink(String hangoutLink) {
        this.hangoutLink = hangoutLink;
    }

    public ConferenceData getConferenceData() {
        return conferenceData;
    }

    public void setConferenceData(ConferenceData conferenceData) {
        this.conferenceData = conferenceData;
    }

    public boolean getAnyoneCanAddSelf() {
        return anyoneCanAddSelf;
    }

    public void setAnyoneCanAddSelf(boolean anyoneCanAddSelf) {
        this.anyoneCanAddSelf = anyoneCanAddSelf;
    }

    public boolean getGuestsCanInviteOthers() {
        return guestsCanInviteOthers;
    }

    public void setGuestsCanInviteOthers(boolean guestsCanInviteOthers) {
        this.guestsCanInviteOthers = guestsCanInviteOthers;
    }

    public boolean getGuestsCanModify() {
        return guestsCanModify;
    }

    public void setGuestsCanModify(boolean guestsCanModify) {
        this.guestsCanModify = guestsCanModify;
    }

    public boolean getGuestsCanSeeOtherGuests() {
        return guestsCanSeeOtherGuests;
    }

    public void setGuestsCanSeeOtherGuests(boolean guestsCanSeeOtherGuests) {
        this.guestsCanSeeOtherGuests = guestsCanSeeOtherGuests;
    }

    public boolean getPrivateCopy() {
        return privateCopy;
    }

    public void setPrivateCopy(boolean privateCopy) {
        this.privateCopy = privateCopy;
    }

    public boolean getLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Reminders getReminders() {
        return reminders;
    }

    public void setReminders(Reminders reminders) {
        this.reminders = reminders;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

}


package aiss.model;

import javax.annotation.Generated;

import com.google.api.client.util.DateTime;
import com.google.appengine.repackaged.com.google.type.Date;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Start {

    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("dateTime")
    @Expose
    private DateTime dateTime;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

}

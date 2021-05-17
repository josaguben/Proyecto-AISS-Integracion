package aiss.model.repository;

import java.util.Collection;
import aiss.model.CalendarList;
import aiss.model.Calendars;
import aiss.model.Event;

public interface CalendarListRepository {
	
	// Calendars
	public void addCalendar(Calendars c);
	
	public void deleteCalendar(Calendars c);
	public void deleteCalendar(String id);
	public void updateCalendar(Calendars c);
	public Calendars getCalendar(String id);
	public Collection<Calendars> getAllCalendars();
		
	
	//Event
	public void addEvent(Event e);
	public Event getEvent(String id);
	public void deleteEvent (Event e);
	public void deleteEvent(String id);
	public void updateEvent(Event e);
	public Collection<Event> getAllEvents();

}

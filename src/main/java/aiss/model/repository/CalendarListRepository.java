package aiss.model.repository;

import java.util.Collection;

import aiss.model.Calendar;
import aiss.model.CalendarList;
import aiss.model.Event;

public interface CalendarListRepository {
	
	// Calendars
	public void addCalendar(Calendar c);
	
	public void deleteCalendar(Calendar c);
	public void deleteCalendar(String id);
	public void updateCalendar(Calendar c);
	public Calendar getCalendar(String id);
	public Collection<Calendar> getAllCalendars();
	
	// CalendarList
	
	public Collection<CalendarList> getAllCalendarList();
	public void deleteCalendarList(String id);
	public void deleteCalendarList(Calendar c);
	
		
	
	//Event
	public void addEvent(Event e);
	public Event getEvent(String id);
	public void deleteEvent (Event e);
	public void deleteEvent(String id);
	public void updateEvent(Event e);
	public Collection<Event> getAllEvents();

}

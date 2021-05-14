package aiss.model.repository;

import java.util.Collection;
import java.util.List;

import aiss.model.CalendarList;
import aiss.model.Calendars;

public interface CalendarListRepository {
	
	// Calendars
	public void addCalendar(Calendars c);
	public CalendarList getCalendar(String id);
	public void deleteCalendar(Calendars c);
	public void deleteCalendar(String id);
	public void updateCalendar(Calendars c);
	
	// CalendarList
	public void addCalendarList(CalendarList cl);
	public Collection<Calendars> getAllCalendars();
	

}

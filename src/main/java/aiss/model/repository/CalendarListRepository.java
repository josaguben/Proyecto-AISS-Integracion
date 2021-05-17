package aiss.model.repository;

import java.util.Collection;

import aiss.model.Calendar;
import aiss.model.CalendarList;
import aiss.model.Event;
import aiss.model.Task;

public interface CalendarListRepository {
	
	// Calendars
	public void addCalendar(Calendar c);
	
	public void deleteCalendar(Calendar c);
	public void deleteCalendar(String id);
	public void updateCalendar(Calendar c);
	public Calendar getCalendar(String id);
	public Collection<Event> getAllEvents();
	public Collection<Task> getAllTasks();
	
	// CalendarList
	
	public Collection<Calendar> getAllCalendars();
	public Collection<CalendarList> getAllCalendarList();
	public void deleteCalendarList(String id);
	public void deleteCalendarList(Calendar c);
	
}

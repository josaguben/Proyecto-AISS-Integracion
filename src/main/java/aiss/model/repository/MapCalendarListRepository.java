package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.Calendar;
import aiss.model.CalendarList;
import aiss.model.Event;
import aiss.model.Task;

public class MapCalendarListRepository implements CalendarListRepository{
		
	Map<String, Calendar> calendarsMap;
	Map<String, CalendarList> calendarListMap;
	Map<String, Event> EventsMap;
	Map<String, Task> TaskMap;



	private static MapCalendarListRepository instance = null;
	private int index=0;
	
	
	public static MapCalendarListRepository getInstance() {
		
		if(instance==null) {
			instance = new MapCalendarListRepository();
			instance.init();
		}
		
		return instance;
	}
	
	public void init() {
		
		calendarListMap = new HashMap<String,CalendarList>();
		calendarsMap = new HashMap<String,Calendar>();
		EventsMap = new HashMap<String,Event>();
		
	}

	@Override
	public void addCalendar(Calendar c) {
		String id = "c" + index++;
	}

	@Override
	public void deleteCalendar(Calendar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCalendar(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCalendar(Calendar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Calendar getCalendar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Calendar> getAllCalendars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<CalendarList> getAllCalendarList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCalendarList(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCalendarList(Calendar c) {
		// TODO Auto-generated method stub
		
	}

}	


package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.CalendarList;
import aiss.model.Calendars;
import aiss.model.Event;

public class MapCalendarListRepository implements CalendarListRepository{
		
	Map<String, Calendars> calendarsMap;
	Map<String, CalendarList> calendarListMap;
	Map<String, Event> EventsMap;


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
		calendarsMap = new HashMap<String,Calendars>();
		EventsMap = new HashMap<String,Event>();
		
	}
	
	@Override
	public void addEvent(Event e) {
		String id = "e" + index++;
		e.setId(id);
		EventsMap.put(id, e);
	}
	
	
	@Override
	public Event getEvent(String id) {
		return EventsMap.get(id);
	}

	
	@Override
	public void deleteEvent(String id) {
		EventsMap.remove(id);	
	}
	
	@Override
	public void deleteEvent(Event e) {
		EventsMap.remove(e.getId());	
	}
	
	@Override
	public void updateEvent(Event e) {
		EventsMap.put(e.getId(), e);		
	}
	
	public Collection<Event> getAllEvents(){
		return EventsMap.values();
	}
	
	


	@Override
	public void addCalendar(Calendars c) {
		String id = "c" + index++;
		c.setId(id);
		calendarsMap.put(id, c);
	}



	@Override
	public void deleteCalendar(Calendars c) {
		calendarsMap.remove(c.getId());
	}


	@Override
	public void deleteCalendar(String id) {
		calendarsMap.remove(id);
		
	}


	@Override
	public void updateCalendar(Calendars c) {
		calendarsMap.put(c.getId(), c);
		
	}


	@Override
	public Collection<Calendars> getAllCalendars() {
		return calendarsMap.values();
	}
	
	@Override
	public Calendars getCalendar(String id) {
		return calendarsMap.get(id);
	}
	
}	


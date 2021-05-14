package aiss.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import aiss.model.CalendarList;
import aiss.model.Calendars;

public class MapCalendarListRepository implements CalendarListRepository{
		
	Map<String, Calendars> calendarsMap;
	Map<String, CalendarList> calendarListMap;

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
		
		
	}


	@Override
	public void addCalendar(Calendars c) {
		String id = "c" + index++;
		c.setId(id);
		calendarsMap.put(id, c);
	}

	@Override
	public CalendarList getCalendar(String id) {
		return calendarListMap.get(id);
	}


	@Override
	public void deleteCalendar(Calendars c) {
		
	}


	@Override
	public void deleteCalendar(String id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateCalendar(Calendars c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCalendarList(CalendarList cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Calendars> getAllCalendars() {
		// TODO Auto-generated method stub
		return null;
	}
}

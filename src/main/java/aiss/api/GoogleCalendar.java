package aiss.api;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import aiss.api.resources.CalendarListResource;

public class GoogleCalendar extends Application{
	private Set<Object> singletons = new HashSet<>();
	private Set<Class<?>> classes = new HashSet<>();
	
	
	
	public GoogleCalendar() {
		
		singletons.add(CalendarListResource.getInstance());
		//singletons.add(CalendarsResource.getInstance());
		//singletons.add(EventsResource.getInstance());
	}
	
	@Override
	public Set<Class<?>> getClasses(){
		return classes;
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}
}

package aiss.api.resources;

import javax.ws.rs.Path;

import aiss.model.repository.CalendarListRepository;
import aiss.model.repository.MapCalendarListRepository;

@Path("/calendarList")
public class CalendarListResource {
	
	
	/*Singleton */
	private static CalendarListResource _instance=null;
	CalendarListRepository repository;
	
	private CalendarListResource() {
		repository = MapCalendarListRepository.getInstance();
	}
	
	
	

}

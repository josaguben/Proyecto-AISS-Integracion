package aiss.api.resources;

import java.net.URI;
import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.jboss.resteasy.spi.BadRequestException;
import org.jboss.resteasy.spi.NotFoundException;

import aiss.model.Calendar;
import aiss.model.CalendarList;
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
	
	public static CalendarListResource getInstance()
	{
		if(_instance==null)
				_instance=new CalendarListResource();
		return _instance;
	}
	
	
	@GET
	@Produces("application/json")
	public Collection<Calendar> getAllCallendars()
	{
		return repository.getAllCalendars();
	}

	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Calendar getCalendars(@PathParam("id") String id)
	{
		Calendar c = repository.getCalendar(id);
		
		if (c == null) {
			throw new NotFoundException("The playlist with id="+ id +" was not found");			
		}
		
		return c;
	}
	
	
	
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addCalendar(@Context UriInfo uriInfo, Calendar c) {
		if (c.getId() == null || "".equals(c.getId()))
			throw new BadRequestException("The name of the playlist must not be null");

		repository.addCalendar(c);

		// Builds the response. Returns the calendar the has just been added.
		UriBuilder ub = uriInfo.getAbsolutePathBuilder().path(this.getClass(), "get");
		URI uri = ub.build(c.getId());
		ResponseBuilder resp = Response.created(uri);
		resp.entity(c);			
		return resp.build();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package org.codesample.timeline.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import codesample.timeline.NamedEvent;

@Path("/events")
public class EventsResource {
	
	static Logger logger = LogManager.getLogger(EventsResource.class.getName());

	
    @GET
    @Path("{eventId}")
    @Produces({MediaType.APPLICATION_JSON})
    public NamedEvent getEvent(@PathParam("eventId") String eventId) {
		NamedEvent e = new NamedEvent("MyTestEvent"+eventId, DateTime.now());
		ObjectMapper mapper = new ObjectMapper();
		try {
			logger.info(mapper.writeValueAsString(e));
		} catch (JsonProcessingException e1) {
			throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
		}
        return e;
    }
}

package org.codesample.timeline.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;

import codesample.timeline.NamedEvent;

@Path("/events")
public class EventsResource {
	
	static Logger logger = LogManager.getLogger(EventsResource.class.getName());

	
    @GET
    @Path("{eventId}")
    @Produces( { MediaType.APPLICATION_JSON })
    public NamedEvent getEvent(@PathParam("eventId") String eventId) {
		NamedEvent e = new NamedEvent("Event", DateTime.now());
		logger.info(e);
        return e;
    }
}

package org.codesample.timeline.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import org.apache.wink.server.utils.LinkBuilders;
import org.json.JSONArray;
import org.json.JSONObject;

@Path("events")
public class EventsResource {
	
    private static final String EVENT = "events";
    private static final String ITEM_PATH = "{events}";
    private static final String ENCODING = "UTF-8";

	@GET
	@Produces( { MediaType.APPLICATION_JSON })
	public JSONArray getEvents() {
		return null;
	}
	
    @Path(ITEM_PATH)
    @GET
    @Produces( { MediaType.APPLICATION_JSON })
    public JSONObject getTask(@Context LinkBuilders link, @Context UriInfo uri,
            @PathParam(EVENT) String taskId) {
        // TODO:  Add implementation
        return null;
    }

    @POST
    @Consumes( { MediaType.APPLICATION_FORM_URLENCODED })
    @Produces( { MediaType.APPLICATION_JSON })
    public JSONObject createTask(MultivaluedMap<String, String> formData,
            @Context UriInfo uriInfo, @Context LinkBuilders linksBuilders) {
        // TODO:  Add implementation
        return null;
    }

    @Path(ITEM_PATH)
    @PUT
    @Consumes( { MediaType.APPLICATION_JSON })
    @Produces( { MediaType.APPLICATION_JSON })
    public JSONObject updateTask(JSONObject task, @Context UriInfo uriInfo,
            @Context LinkBuilders linksBuilders) {
        // TODO: Add implementation
        return null;
    }

    @Path(ITEM_PATH)
    @DELETE
    @Produces( { MediaType.APPLICATION_JSON })
    public JSONObject deleteTask(@Context LinkBuilders link, @Context UriInfo uri,
            @PathParam(EVENT) String taskId) {
        // TODO: Add implementation
        return null;
    }	
}

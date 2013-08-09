package org.codesample.timeline.server;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule.Priority;

public class TimelineApp extends Application {

	  /**
	   * Get the list of service classes provided by this JAX-RS application
	   */
	  @Override
	  public Set<Class<?>> getClasses() {
	    Set<Class<?>> serviceClasses = new HashSet<Class<?>>();
	    serviceClasses.add(EventsResource.class);
	    return serviceClasses;
	  }
	  
	  @Override
	  public Set<Object> getSingletons() {
	    Set<Object> s = new HashSet<Object>();
	    
	    ObjectMapper mapper = new ObjectMapper();
	    	    
	    // Register the JAXB module with the mapper to allow JAXB annotations
	    JaxbAnnotationModule jaxb = new JaxbAnnotationModule();
	    jaxb.setPriority(Priority.PRIMARY);
	    mapper.registerModule(jaxb);
	    
	    // Register the JodaTime module with the mapper
	    mapper.registerModule(new JodaModule());
	    
	    // Set up the provider
	    JacksonJaxbJsonProvider jaxbProvider = new JacksonJaxbJsonProvider();
	    jaxbProvider.setMapper(mapper);

	    s.add(jaxbProvider);
	    return s;
	  }
	  

}

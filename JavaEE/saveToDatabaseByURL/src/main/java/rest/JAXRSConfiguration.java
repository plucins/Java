package rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/get")
@ApplicationPath("/resources")
public class JAXRSConfiguration extends Application {

    @GET
    @Path("/sayHello")
    public String hello(){
        return "Hello";
    }
}

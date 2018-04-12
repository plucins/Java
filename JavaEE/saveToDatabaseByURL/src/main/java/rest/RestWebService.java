package rest;

import model.ObjectToDownloadQueue;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/rest")
    public class RestWebService {

        @GET
        @Path("/url")
        public Response whatever(@QueryParam("url") String url) {
            ObjectToDownloadQueue queue = new ObjectToDownloadQueue();
            queue.addToQueue(url);
            return Response.ok().build();
        }
    }

package com.kontrol.jax_rs.filters.request;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/request-filters")
public class NameBoundResource {

    @GET
    @Logged
    @Path("name-bound")
    public Response testNameBoundRequestFilter() {
        return Response.noContent().build();
    }
}

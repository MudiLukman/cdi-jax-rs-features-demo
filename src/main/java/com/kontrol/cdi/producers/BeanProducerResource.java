package com.kontrol.cdi.producers;

import com.kontrol.User;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/producers")
public class BeanProducerResource {

    @Inject
    User user;

    @Inject
    List<String> names;

    @GET
    @Path("user")
    public Response getUser() {
        return Response.ok(user).build();
    }

    @GET
    @Path("names")
    public Response getNames() {
        return Response.ok(names).build();
    }
}

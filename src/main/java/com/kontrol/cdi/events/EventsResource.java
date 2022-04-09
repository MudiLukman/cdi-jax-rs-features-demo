package com.kontrol.cdi.events;

import com.kontrol.User;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("events")
public class EventsResource {

    @Inject
    Event<User> userEvent;

    @POST
    public Response createUser(@Valid User user) {
        userEvent.fireAsync(user);
        System.out.println("Just fired user event");
        return Response.status(Response.Status.CREATED).build();
    }

}

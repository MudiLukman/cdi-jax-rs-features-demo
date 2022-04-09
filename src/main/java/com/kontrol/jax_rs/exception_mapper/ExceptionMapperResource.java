package com.kontrol.jax_rs.exception_mapper;

import com.kontrol.User;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/exception-mapper")
public class ExceptionMapperResource {

    @POST
    public Response createInvalidUser(User user) {
        return Response.status(Response.Status.CREATED)
                .entity(validateUser(user))
                .build();
    }

    private User validateUser(User user) {
        if (user.name == null || user.name.trim().isEmpty()) {
            throw new BadRequestException("Username cannot be blank");
        }
        return user;
    }
}

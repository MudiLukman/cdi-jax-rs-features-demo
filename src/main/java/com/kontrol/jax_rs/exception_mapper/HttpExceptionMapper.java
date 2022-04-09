package com.kontrol.jax_rs.exception_mapper;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HttpExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException exception) {
        HttpError error = new HttpError();
        error.code = exception.getResponse().getStatus();
        error.message = exception.getMessage();

        return Response.status(error.code).entity(error).build();
    }
}

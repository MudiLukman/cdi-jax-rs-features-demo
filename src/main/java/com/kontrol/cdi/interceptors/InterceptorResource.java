package com.kontrol.cdi.interceptors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/interceptors")
public class InterceptorResource {

    @GET
    public Response callMethods() {
        addNumbers(3, 7);
        getNumber();
        return Response.noContent().build();
    }

    @Logging
    public int addNumbers(int a, int b) {
        return a + b;
    }

    @Logging
    public int getNumber() {
        return 40;
    }
}

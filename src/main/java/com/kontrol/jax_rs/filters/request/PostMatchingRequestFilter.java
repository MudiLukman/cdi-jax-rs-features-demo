package com.kontrol.jax_rs.filters.request;

import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;

//default is post matching so no annotation provided
public class PostMatchingRequestFilter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        String requestMethod = containerRequestContext.getRequest().getMethod().toUpperCase();
        String[] dangerousOperations = new String[] {"POST", "PUT", "DELETE", "PATCH"};

        String token = containerRequestContext.getHeaderString("Authorization");
        if (token == null || token.isEmpty()) { //pseudo authentication
            for (String dangerousOperation : dangerousOperations) {
                if (dangerousOperation.equalsIgnoreCase(requestMethod)) {
                    throw new NotAuthorizedException("User not authorized");
                }
            }
        }
    }
}

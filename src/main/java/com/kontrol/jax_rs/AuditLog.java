package com.kontrol.jax_rs;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

public class AuditLog {

    public static void pseudoAuditLog(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) {
        int statusCode = containerResponseContext.getStatus();
        String httpMethod = containerRequestContext.getRequest().getMethod();
        String path = containerRequestContext.getUriInfo().getPath();
        boolean successful = true;
        if (statusCode >= 400) {
            successful = false;
        }
        System.out.println("User tried to do a " + httpMethod + " on " + path + ". Succeeded? " + successful);
        //maybe use for audit log and store in DB
    }
}

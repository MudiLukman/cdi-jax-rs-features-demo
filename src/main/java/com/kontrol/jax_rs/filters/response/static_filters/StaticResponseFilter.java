package com.kontrol.jax_rs.filters.response.static_filters;

import com.kontrol.jax_rs.AuditLog;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class StaticResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        System.out.println("Static Container Response Filter");
        AuditLog.pseudoAuditLog(containerRequestContext, containerResponseContext);
    }
}

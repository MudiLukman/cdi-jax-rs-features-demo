package com.kontrol.jax_rs.filters.response.dynamic_filters;

import com.kontrol.jax_rs.AuditLog;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import java.io.IOException;

public class DynamicResponseFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        System.out.println("Dynamic Container Response Filter");
        AuditLog.pseudoAuditLog(containerRequestContext, containerResponseContext);
    }
}

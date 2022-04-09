package com.kontrol.cdi.qualifiers;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/qualifiers")
public class Waiter {
    @Inject
    @Flavour(Flavour.Type.ESPRESSO)
    Coffee espresso;

    @Inject
    @Flavour(Flavour.Type.LATTE)
    Coffee latte;

    @GET
    @Path("espresso")
    @Produces("text/plain")
    public String serveEspresso() {
        return espresso.flavour();
    }

    @GET
    @Path("latte")
    @Produces("text/plain")
    public String serveLatte() {
        return latte.flavour();
    }

}

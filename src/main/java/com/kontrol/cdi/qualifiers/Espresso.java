package com.kontrol.cdi.qualifiers;

import javax.enterprise.context.ApplicationScoped;

@Flavour(Flavour.Type.ESPRESSO)
@ApplicationScoped
public class Espresso implements Coffee{

    @Override
    public String flavour() {
        return "Espresso";
    }
}

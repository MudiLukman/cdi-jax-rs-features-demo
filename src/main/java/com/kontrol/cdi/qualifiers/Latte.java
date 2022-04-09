package com.kontrol.cdi.qualifiers;

import javax.enterprise.context.ApplicationScoped;

@Flavour(Flavour.Type.LATTE)
@ApplicationScoped
public class Latte implements Coffee{

    @Override
    public String flavour() {
        return "Latte";
    }
}

package com.kontrol.cdi.producers;

import com.kontrol.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

public class BeanProducer {

    @Produces
    @ApplicationScoped
    public User userProducer() {
        return new User();
    }

    @Produces
    @Default
    public List<String> namesProducer(User user) { //method arg must be injected by container
        List<String> names = new ArrayList<>();
        names.add(user.name);
        names.add("Peggy Olson");
        names.add("Joan Harris");
        names.add("Betty Draper");
        names.add("Bertram Cooper");
        return names;
    }
}

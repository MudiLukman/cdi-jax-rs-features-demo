package com.kontrol.cdi.events;

import com.kontrol.User;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.ObservesAsync;

@ApplicationScoped
public class UserService {

    public void handleUserEvent(@ObservesAsync User user) {
        System.out.println("Got user: " + user);
    }

}

package com.kontrol;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {

    @NotBlank
    @Size(min = 2, max = 60)
    public String name;

    public User() {
        this.name = "Don Draper";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
